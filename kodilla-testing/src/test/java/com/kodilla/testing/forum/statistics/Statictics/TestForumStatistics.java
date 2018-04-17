package com.kodilla.testing.forum.statistics.Statictics;

import com.kodilla.testing.com.kodilla.testing.forum.statistics.ForumStatistics;
import com.kodilla.testing.forum.statistics.Statistics;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TestForumStatistics {
    @Test
    public void testCulateAdvStatistics() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        Statistics statisticMock = mock(Statistics.class);

        when(statisticMock.postsCount()).thenReturn(0);
        when(statisticMock.commentsCount()).thenReturn(1);
        when(statisticMock.usersNames()).thenReturn(Arrays.asList("test"));

        //When
        forumStatistics.calculateAdvStatistics(statisticMock);
        //Then
        Assert.assertEquals(0, forumStatistics.getPostsNumber());
        Assert.assertEquals(0, forumStatistics.getAveragePosts());
    }
}
