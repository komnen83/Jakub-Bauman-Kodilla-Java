package com.kodilla.testing.forum.statistics.Statictics;

import com.kodilla.testing.com.kodilla.testing.forum.statistics.ForumStatistics;
import com.kodilla.testing.forum.statistics.Statistics;
import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TestForumStatistics {
    @Test
    public void testCulateAdvStatistics() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        Statistics statisticMock = mock(Statistics.class);

        when(statisticMock.postsCount()).thenReturn(0);
        when(statisticMock.commentsCount()).thenReturn(0);

        //When
        forumStatistics.calculateAdvStatistics(statisticMock);

        //Then
        Assert.assertEquals(0, forumStatistics.getAveragePosts(), 0000.1);
    }

    @Test
    public void testCulateAdvStatistics1()  {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        Statistics statisticMock = mock(Statistics.class);

        when(statisticMock.postsCount()).thenReturn(10);
        when(statisticMock.commentsCount()).thenReturn(100);
        //When
        forumStatistics.calculateAdvStatistics(statisticMock);
        //Then
        Assert.assertEquals(10, forumStatistics.getAverageCommmentsPerPosts(), 0000.1);
    }
}
