package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class Homework implements Observable{

    private final List<Observer> observers;
    private final List<String> homeworks;
    private final String studentName;

    public Homework(String studentName) {
        observers = new ArrayList<>();
        homeworks = new ArrayList<>();
        this.studentName = studentName;
    }

    public List<String> getTasks() {
        return homeworks;
    }

    public String getStudentName() {
        return studentName;
    }

    public void sendTask(String task){
        homeworks.add(task);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers){
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
}