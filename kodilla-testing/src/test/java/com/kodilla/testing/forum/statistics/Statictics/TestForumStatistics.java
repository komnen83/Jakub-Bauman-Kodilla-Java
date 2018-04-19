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

        when(statisticMock.postsCount()).thenReturn(1000);
        when(statisticMock.commentsCount()).thenReturn(10);
        when(statisticMock.usersNames()).thenReturn(Arrays.asList("user1", "user2"));

        //When
        forumStatistics.calculateAdvStatistics(statisticMock);

        //Then
        Assert.assertEquals(500.0, forumStatistics.getAveragePosts(), 0000.1);
        Assert.assertEquals(5.0, forumStatistics.getAverageComments(), 0.1);
        Assert.assertEquals(0.01, forumStatistics.getAverageCommmentsPerPosts(), 1);
    }
}
