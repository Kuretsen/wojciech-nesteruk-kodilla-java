package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

@SpringBootTest
public class BoardTestSuite {

    @Test
    void testBoard() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        List<String> list1 = board.getDoneList().getTasks();
        int size = list1.size();
        List<String> list2 = board.getInProgressList().getTasks();
        int size2 = list2.size();
        List<String> list3 = board.getToDoList().getTasks();
        int size3 = list3.size();

        //Then
        Assertions.assertEquals(0, size);
        Assertions.assertEquals(0, size2);
        Assertions.assertEquals(0, size3);
    }

    @Test
    void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        List<String> toDoList = board.getToDoList().getTasks();
        toDoList.add("task1");

        List<String> inProgressList = board.getInProgressList().getTasks();
        inProgressList.add("task3");

        List<String> doneList = board.getDoneList().getTasks();
        doneList.add("task5");

        //Then
        Assertions.assertEquals("task1", toDoList.get(0));
        Assertions.assertEquals("task3", inProgressList.get(0));
        Assertions.assertEquals("task5", doneList.get(0));
    }
}
