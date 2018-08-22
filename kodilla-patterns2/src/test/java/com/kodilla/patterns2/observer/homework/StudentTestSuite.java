package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentTestSuite {
    @Test
    public void testUpdate() {
        //Given
        HomeworkQueue larsUlrichHomeworkQueue = new HomeworkQueue("Lars Ulrich");
        HomeworkQueue kirkHammetHomeworkQueue = new HomeworkQueue("Kirk Hammet");
        Mentor johnBonham = new Mentor("John Bonham");
        Mentor jimmyPage = new Mentor("Jimmy Page");
        kirkHammetHomeworkQueue.registerObserver(jimmyPage);
        larsUlrichHomeworkQueue.registerObserver(johnBonham);
        //When
        kirkHammetHomeworkQueue.addTask("Singleton pattern");
        kirkHammetHomeworkQueue.addTask("Protorype pattern");
        larsUlrichHomeworkQueue.addTask("Strategy pattern");
        kirkHammetHomeworkQueue.addTask("Join the Hibernate framework");
        larsUlrichHomeworkQueue.addTask("Create an entity of task lists");
        //Then
        assertEquals(2 ,johnBonham.getUpdateCount());
        assertEquals(3 ,jimmyPage.getUpdateCount());
    }
}
