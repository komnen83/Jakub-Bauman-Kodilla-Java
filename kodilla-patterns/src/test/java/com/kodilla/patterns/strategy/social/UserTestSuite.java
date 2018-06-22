package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {

        //Given
        User stevenSeagull = new Millenials("Steven Seagull");
        User arnoldSchwarcenfagger = new YGeneration("Arnold Schwarcenfagger");
        User adelaPenderson = new ZGeneration("Adela Penderson");

        //When
        String stevenShare = stevenSeagull.sharePost();
        System.out.println("Steven Seagull share his post on the: " + stevenShare);
        String arnoldShare = arnoldSchwarcenfagger.sharePost();
        System.out.println("Arnold Schwarcenfagger share his post on the: " + arnoldShare);
        String adelaShare = adelaPenderson.sharePost();
        System.out.println("Adela Penderson share her post on the: " + adelaShare);

        //Then
        Assert.assertEquals("Facebook", stevenShare);
        Assert.assertEquals("Twitter", arnoldShare);
        Assert.assertEquals("Snapchat", adelaShare);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User stevenSeagull = new Millenials("Steven Seagull");
        User arnoldSchwarcenfagger = new YGeneration("Arnold Schwarcenfagger");

        //When
        String stevenShare = stevenSeagull.sharePost();
        System.out.println("Steven Seagull share his post on the: " + stevenShare);
        stevenSeagull.setSocialPublisher(new SnapchatPublisher());
        stevenShare = stevenSeagull.sharePost();
        System.out.println("Now Steven share hist post on the: " + stevenShare);

        //Then
        Assert.assertEquals("Snapchat", stevenShare);
    }
}
