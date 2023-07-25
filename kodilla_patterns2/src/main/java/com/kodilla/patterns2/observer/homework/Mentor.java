package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private final String mentorName;
    private int updateCount;
    @Override
    public void update(Homework homework) {
        System.out.println("Student: " + homework.getStudentName() + " send homework to check: " + homework.getTasks().get(homework.getTasks().size()-1));
        updateCount++;
    }

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}