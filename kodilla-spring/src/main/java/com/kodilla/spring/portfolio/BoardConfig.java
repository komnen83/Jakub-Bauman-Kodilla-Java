package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BoardConfig {

    @Bean(name = "listDone")
    public TaskList getDoneList() {
        List<String> listDone = new ArrayList<>();
        return new TaskList(listDone);
    }

    @Bean(name = "listToDo")
    public TaskList getInProgressList() {
        List<String> listToDo = new ArrayList<>();
        return new TaskList(listToDo);
    }

    @Bean(name = "listInProgress")
    public TaskList getToDoList() {
        List<String> listInProgress = new ArrayList<>();
        return new TaskList(listInProgress);
    }
    @Bean
    public Board getBoard() {
        return new Board(getToDoList(), getDoneList(), getInProgressList());
    }
}
