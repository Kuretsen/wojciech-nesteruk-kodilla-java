package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave() {
        //Given
        Product paper = new Product("Paper");
        Product pen = new Product("Pen");

        Item item1 = new Item(paper, new BigDecimal(2), 100);
        Item item2 = new Item(pen, new BigDecimal(1), 50);

        Invoice invoice = new Invoice("01/08/05/2023");

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);

        List<Item> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);

        invoice.setItems(items);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        assertNotEquals(0,id);
        assertEquals(2, invoice.getItems().size());

        //CleanUp
        invoiceDao.deleteById(id);
    }
}
