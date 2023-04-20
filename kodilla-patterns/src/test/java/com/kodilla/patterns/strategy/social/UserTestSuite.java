package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User steven = new Millenials("Steven Links");
        User john = new YGeneration("John Hemerald");
        User jacob = new ZGeneration("Jacob Amber");

        //When
        String stevenSocialMedia = steven.sharePost();
        System.out.println("Steven share post using: " + stevenSocialMedia);
        String johnSocialMedia = john.sharePost();
        System.out.println("John share post using: " + johnSocialMedia);
        String jacobSocialMedia = jacob.sharePost();
        System.out.println("Jacob share post using: " + jacobSocialMedia);

        //Then
        assertEquals("Snapchat", stevenSocialMedia);
        assertEquals("Twitter", johnSocialMedia);
        assertEquals("Facebook", jacobSocialMedia);
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User jacob = new ZGeneration("Jacob Amber");

        //When
        String jacobSocialMedia = jacob.sharePost();
        System.out.println("Jacob share post using: " + jacobSocialMedia);
        jacob.setSocialPublisher(new TwitterPublisher());
        jacobSocialMedia = jacob.sharePost();
        System.out.println("Jacob now share post using: " + jacobSocialMedia);

        //Then
        assertEquals("Twitter", jacobSocialMedia);
    }
}
