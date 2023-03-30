package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> listOfUsers = new ArrayList<>();

    public Forum() {
        listOfUsers.add(new ForumUser(1, "John", 'M', LocalDate.of(1994, 5,9), 50));
        listOfUsers.add(new ForumUser(2, "Alex", 'M', LocalDate.of(1995, 6,10), 0));
        listOfUsers.add(new ForumUser(3, "Mark", 'M', LocalDate.of(1996, 7,11), 5));
        listOfUsers.add(new ForumUser(4, "Patrick", 'M', LocalDate.of(1997, 8,12), 0));
        listOfUsers.add(new ForumUser(5, "Annet", 'K', LocalDate.of(1998, 9,13), 10));
        listOfUsers.add(new ForumUser(6, "Patricia", 'K', LocalDate.of(1999, 10,14), 0));
        listOfUsers.add(new ForumUser(7, "Alex", 'K', LocalDate.of(2000, 12,15), 15));
        listOfUsers.add(new ForumUser(8, "Kate", 'K', LocalDate.of(2001, 1,16), 8));
        listOfUsers.add(new ForumUser(9, "George", 'M', LocalDate.of(2002, 2,17), 6));
        listOfUsers.add(new ForumUser(10, "Fred", 'M', LocalDate.of(2003, 3,18), 3));
        listOfUsers.add(new ForumUser(11, "Ginny", 'K', LocalDate.of(2004, 4,19), 0));
        listOfUsers.add(new ForumUser(12, "Hermione", 'K', LocalDate.of(2005, 5,20), 7));
        listOfUsers.add(new ForumUser(13, "Neville", 'M', LocalDate.of(2006, 6,21), 13));
        listOfUsers.add(new ForumUser(14, "Harry", 'M', LocalDate.of(2007, 7,22), 2));
        listOfUsers.add(new ForumUser(15, "Emily", 'K', LocalDate.of(2008, 8,23), 3));
        listOfUsers.add(new ForumUser(16, "Lily", 'K', LocalDate.of(2009, 9,24), 20));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(listOfUsers);
    }
}