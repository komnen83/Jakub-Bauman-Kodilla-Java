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
    List<String> forumUserGenerator (int userQuantity)  {
        List<String> resultList = new ArrayList<>();
        for(int n = 1; n <= userQuantity; n++)  {
            String user = "user";
            resultList.add(user);
        }
        return resultList;
    }

    @Test
    public void testNumberOfPosts0() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        Statistics statisticMock = mock(Statistics.class);
        when(statisticMock.postsCount()).thenReturn(0);
        when(statisticMock.usersNames()).thenReturn(Arrays.asList("user1", "user2"));
        //When
        forumStatistics.calculateAdvStatistics(statisticMock);
        //Then
        Assert.assertEquals(0, forumStatistics.getAveragePosts(), 0000.1);
    }

    @Test
    public void testNumberOfPosts1000() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        Statistics statisticMock = mock(Statistics.class);
        when(statisticMock.postsCount()).thenReturn(1000);
        when(statisticMock.usersNames()).thenReturn(Arrays.asList("user1", "user2"));
        //When
        forumStatistics.calculateAdvStatistics(statisticMock);
        //Then
        Assert.assertEquals(500, forumStatistics.getAveragePosts(), 0000.1);
    }

    @Test
    public void testNumberOfComments0() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        Statistics statisticMock = mock(Statistics.class);
        when(statisticMock.postsCount()).thenReturn(0);
        when(statisticMock.usersNames()).thenReturn(Arrays.asList("user1", "user2"));
        //When
        forumStatistics.calculateAdvStatistics(statisticMock);
        //Then
        Assert.assertEquals(0, forumStatistics.getAverageComments(), 0000.1);
    }

    @Test
    public void testCommentsGreaterThanPosts()  {
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

    @Test
    public void testPostsGreaterThanComments()  {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        Statistics statisticMock = mock(Statistics.class);
        when(statisticMock.postsCount()).thenReturn(100);
        when(statisticMock.commentsCount()).thenReturn(10);
        //When
        forumStatistics.calculateAdvStatistics(statisticMock);
        //Then
        Assert.assertEquals(0.1, forumStatistics.getAverageCommmentsPerPosts(), 0000.1);
    }

    @Test
    public void testUserNumber0()  {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        Statistics statisticMock = mock(Statistics.class);
        List<String> user = forumUserGenerator(0);
        when(statisticMock.postsCount()).thenReturn(100);
        when(statisticMock.usersNames()).thenReturn(user);
        //When
        forumStatistics.calculateAdvStatistics(statisticMock);
        //Then
        Assert.assertEquals(0, forumStatistics.getAveragePosts(), 0000.1);
    }

    @Test
    public void testUserNumber100()  {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        Statistics statisticMock = mock(Statistics.class);
        List<String> user = forumUserGenerator(100);
        when(statisticMock.postsCount()).thenReturn(1000);
        when(statisticMock.usersNames()).thenReturn(user);
        //When
        forumStatistics.calculateAdvStatistics(statisticMock);
        //Then
        Assert.assertEquals(10, forumStatistics.getAveragePosts(), 0000.1);
    }
}
