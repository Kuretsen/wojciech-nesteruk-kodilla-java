package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeworkTestSuite {

    @Test
    void testUpdate() {
        //Given
        Mentor mentorCharles = new MentorCharles();
        Mentor mentorPeter = new MentorPeter();
        Homework johnHomework = new Homework("John");
        Homework ivoneHomework = new Homework("Ivone");
        Homework jessieHomework = new Homework("Jessie");
        Homework jamesHomework = new Homework("James");
        Homework brockHomework = new Homework("Brock");
        johnHomework.registerObserver(mentorCharles);
        ivoneHomework.registerObserver(mentorCharles);
        jessieHomework.registerObserver(mentorPeter);
        jamesHomework.registerObserver(mentorPeter);
        brockHomework.registerObserver(mentorCharles);

        //When
        johnHomework.sendTask("Task 1");
        johnHomework.sendTask("Task 2");
        ivoneHomework.sendTask("Task 1");
        jessieHomework.sendTask("Task 1");
        jessieHomework.sendTask("Task 2");
        jamesHomework.sendTask("Task 1");
        brockHomework.sendTask("Task 1");

        //Then
        assertEquals(4, mentorCharles.getUpdateCount());
        assertEquals(3, mentorPeter.getUpdateCount());
    }
}
