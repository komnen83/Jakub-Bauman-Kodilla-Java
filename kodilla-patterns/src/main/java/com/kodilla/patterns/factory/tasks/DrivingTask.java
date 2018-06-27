package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {

    private String taskName;
    private String where;
    private String using;
    private boolean taskExecuted = false;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
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
        return "Driving task:  " +
                "Task name = '" + taskName + '\'' +
                ", Where = '" + where + '\'' +
                ", Using = '" + using + '\'';
    }
}
