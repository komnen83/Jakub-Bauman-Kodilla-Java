package com.kodilla.hibernate.com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import com.kodilla.hibernate.tasklist.TaskListDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    private static final String LISTNAME = "Hibernate list";
    private static final String DESCRIPTION = "Hibernate description";

    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList(LISTNAME, DESCRIPTION);
        taskListDao.save(taskList);
        String list = taskList.getListName();
        //When
        List<TaskList> readListName = taskListDao.findByListName(list);
        //Then
        Assert.assertEquals(1, readListName.size());
        //CleanUp
        int id = readListName.get(0).getId();
        taskListDao.delete(id);
    }
}