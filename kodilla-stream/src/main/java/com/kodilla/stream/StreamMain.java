package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.person.People;
import com.kodilla.stream.reference.FunctionalCalculator;
import org.w3c.dom.ls.LSOutput;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
//        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
//
//        System.out.println("Calculating expressions with lambdas");
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a+b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a-b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a*b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a/b);
//
//        System.out.println("Calculating expressions with method references");
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromB);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

//        System.out.println("7.1. Poem decorator");
//        PoemBeautifier poemBeautifier = new PoemBeautifier();
//        String newText1 = poemBeautifier.beautify("Text to beautify", (text -> text.toUpperCase()));
//        System.out.println(newText1);
//        String newText2 = poemBeautifier.beautify("Text to beautify", (text -> "ABC" + text + "ABC"));
//        System.out.println(newText2);
//        String newText3 = poemBeautifier.beautify("Text to beautify", (text -> "Text: " +"\"" + text + "\"" + " have " + text.length() + " letters"));
//        System.out.println(newText3);
//        String newText4 = poemBeautifier.beautify("Text to beautify", (text -> "Middle letter of " + text + " is " + text.charAt(text.length()/2)));
//        System.out.println(newText4);
//        String newText5 = poemBeautifier.beautify("Text to beautify", (text -> text.replace(" ", "_")));
//        System.out.println(newText5);

//        System.out.println("Using Stream to generate even numbers from 1 to 20");
//        NumbersGenerator.generateEven(20);

//        People.getList().stream()
//                .map(String::toUpperCase)
//                .filter(s -> s.length() > 11)
//                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
//                .filter(s -> s.substring(0, 1).equals("M"))
//                .forEach(System.out::println);

//        System.out.println("Ćwiczenie na kolekcjach z dowolnymi obiekatami");
//        BookDirectory theBookDirectory = new BookDirectory();
//        theBookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .forEach(System.out::println);

//        System.out.println("Ćwieczenie na Collectors.toList()");
//        BookDirectory theBookDirectory = new BookDirectory();
//        List<Book> theResultListOfBooks = theBookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .collect(Collectors.toList());
//
//        System.out.println("# elements: " + theResultListOfBooks.size());
//        theResultListOfBooks.stream()
//                .forEach(System.out::println);

//        System.out.println("Ćwiczenie na Collectors.toMap()");
//        BookDirectory theBookDirectory = new BookDirectory();
//        Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .collect(Collectors.toMap(Book::getSignature, book -> book));
//        System.out.println("# elements: " + theResultMapOfBooks.size());
//        theResultMapOfBooks.entrySet().stream()
//                .map(entry -> entry.getKey() + ": " + entry.getValue())
//                .forEach(System.out::println);

//        System.out.println("Ćwiczenie na Collectors.joining");
//        BookDirectory theBookDirectory = new BookDirectory();
//        String theResultStringOfBooks = theBookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .map(Book::toString)
//                .collect(Collectors.joining(",\n", "<<", ">>"));
//        System.out.println(theResultStringOfBooks);

        System.out.println("7.3 Stream by forum users");
        Forum theForum = new Forum();
        Map<Integer, ForumUser> theResultOfForumUser = theForum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getBirthDay().getYear() <= 2003)
                .filter(forumUser -> forumUser.getPostsQuantity() > 0)
                .collect(Collectors.toMap(ForumUser::getId, forumUser -> forumUser));
        theResultOfForumUser.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}
