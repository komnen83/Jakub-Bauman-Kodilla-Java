package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {

    private String taskName;
    private String where;
    private String using;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
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
        return "Driving task:  " +
                "Task name = '" + taskName + '\'' +
                ", Where = '" + where + '\'' +
                ", Using = '" + using + '\'';
    }
}
