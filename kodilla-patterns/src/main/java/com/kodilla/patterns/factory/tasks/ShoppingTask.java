package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {

    private String taskName;
    private String whatToBuy;
    private double quantity;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    public String getTaskName() {
        return taskName;
    }

    public void executeTask() {

    }

    @Override
    public boolean isTaskExecuted() {
        return false;
    }

    @Override
    public String toString() {
        return "Shopping task:  " +
                "Task name = '" + taskName + '\'' +
                ", What to buy = '" + whatToBuy + '\'' +
                ", Quantity = " + quantity;
    }
}
