package com.kodilla.patterns.factory.tasks;

public final class ShoppingTask implements Task{

    private final String taskName;
    private final String whatToBuy;
    private double quantity;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public void executeTask() {
        quantity = 0;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        if (quantity == 0) {
            return true;
        } else {
            return false;
        }
    }
}
