package com.kodilla.testing.com.kodilla.testing.forum.statistics;

import com.kodilla.testing.forum.statistics.Statistics;

import java.util.List;

public class ForumStatistics {
    private int usersNumber;
    private int postsNumber;
    private int commentsNumber;
    private double averagePosts;
    private double averageComments;
    private double averageCommmentsPerPosts;

    public void calculateAdvStatistics(Statistics statistics)   {

        usersNumber = statistics.usersNames().size();
        commentsNumber = statistics.commentsCount();
        postsNumber = statistics.postsCount();

        if(usersNumber != 0)     {
            averageComments = commentsNumber/usersNumber;
            averagePosts = postsNumber/usersNumber;
            averagePosts = (double)postsNumber/(double)usersNumber;
            averageComments = (double)commentsNumber/(double)usersNumber;
        }

        if(postsNumber != 0)    {
            averageCommmentsPerPosts = commentsNumber/postsNumber;
            averageCommmentsPerPosts = (double)commentsNumber/(double)postsNumber;
        }
    }

    public int getUsersNumber() {
        return usersNumber;
    }

    public int getPostsNumber() {
        return postsNumber;
    }

    public int getCommentsNumber() {
        return commentsNumber;
    }

    public double getAveragePosts() {
        return averagePosts;
    }

    public double getAverageComments() {
        return averageComments;
    }

    public double getAverageCommmentsPerPosts() {
        return averageCommmentsPerPosts;
    }
}