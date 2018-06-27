package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task{

    private String taskName;
    private String color;
    private String whatToPaint;
    private boolean taskExecuted = false;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    public String getTaskName() {
        return taskName;
    }

    public void executeTask() {
        System.out.println("Task in progress: " + taskName);
        taskExecuted = true;
    }

    @Override
    public boolean isTaskExecuted() {
        return taskExecuted;
    }

    @Override
    public String toString() {
        return "Painting task:  " +
                "Task name = '" + taskName + '\'' +
                ", Color = '" + color + '\'' +
                ", What to paint = '" + whatToPaint + '\'';
    }
}
