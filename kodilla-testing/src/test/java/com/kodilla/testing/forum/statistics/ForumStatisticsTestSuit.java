package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class ForumStatisticsTestSuit {
    @Mock
    private Statistics statisticsMock;
    private List<String> generateNumberOfUsers(int usersQuantity) {
        List<String> resultList = new ArrayList<>();
        if (usersQuantity != 0) {
            for (int n = 0; n < usersQuantity; n++) {
                resultList.add("User" + n);
            }
        }
        return resultList;
    }

    @Test
    public void testCalculateAdvStatistics0Posts() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> listOfUsers = generateNumberOfUsers(1);
        when(statisticsMock.userNames()).thenReturn(listOfUsers);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assertions.assertEquals(0, forumStatistics.getNumberOfPosts());
        Assertions.assertEquals(0, forumStatistics.getAverageCommentsPerPosts());
        Assertions.assertEquals(0, forumStatistics.getAverageCommentsPerUser());
        Assertions.assertEquals(0, forumStatistics.getAveragePostsPerUser());
    }
    @Test
    public void testCalculateAdvStatistics1000Posts() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> listOfUsers = generateNumberOfUsers(10000);
        when(statisticsMock.userNames()).thenReturn(listOfUsers);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(1000);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assertions.assertEquals(1000, forumStatistics.getNumberOfPosts());
        Assertions.assertEquals(1, forumStatistics.getAverageCommentsPerPosts());
        Assertions.assertEquals(0.1, forumStatistics.getAverageCommentsPerUser());
        Assertions.assertEquals(0.1, forumStatistics.getAveragePostsPerUser());
    }
    @Test
    public void testCalculateAdvStatistics0Comments() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> listOfUsers = generateNumberOfUsers(100);
        when(statisticsMock.userNames()).thenReturn(listOfUsers);
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(0);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assertions.assertEquals(10, forumStatistics.getNumberOfPosts());
        Assertions.assertEquals(0, forumStatistics.getAverageCommentsPerPosts());
        Assertions.assertEquals(0, forumStatistics.getAverageCommentsPerUser());
        Assertions.assertEquals(0.1, forumStatistics.getAveragePostsPerUser());
    }
    @Test
    public void testCalculateAdvStatisticsMorePostsThanComments() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> listOfUsers = generateNumberOfUsers(1000);
        when(statisticsMock.userNames()).thenReturn(listOfUsers);
        when(statisticsMock.postsCount()).thenReturn(5000);
        when(statisticsMock.commentsCount()).thenReturn(4000);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assertions.assertEquals(5000, forumStatistics.getNumberOfPosts());
        Assertions.assertEquals(0.8, forumStatistics.getAverageCommentsPerPosts());
        Assertions.assertEquals(4, forumStatistics.getAverageCommentsPerUser());
        Assertions.assertEquals(5, forumStatistics.getAveragePostsPerUser());
    }
    @Test
    public void testCalculateAdvStatisticsMoreCommentsThanPosts() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> listOfUsers = generateNumberOfUsers(1000);
        when(statisticsMock.userNames()).thenReturn(listOfUsers);
        when(statisticsMock.postsCount()).thenReturn(4000);
        when(statisticsMock.commentsCount()).thenReturn(5000);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assertions.assertEquals(4000, forumStatistics.getNumberOfPosts());
        Assertions.assertEquals(1.25, forumStatistics.getAverageCommentsPerPosts());
        Assertions.assertEquals(5, forumStatistics.getAverageCommentsPerUser());
        Assertions.assertEquals(4, forumStatistics.getAveragePostsPerUser());
    }
    @Test
    public void testCalculateAdvStatistics0Users() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> listOfUsers = generateNumberOfUsers(0);
        when(statisticsMock.userNames()).thenReturn(listOfUsers);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(300);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assertions.assertEquals(100, forumStatistics.getNumberOfPosts());
        Assertions.assertEquals(3, forumStatistics.getAverageCommentsPerPosts());
        Assertions.assertEquals(0, forumStatistics.getAverageCommentsPerUser());
        Assertions.assertEquals(0, forumStatistics.getAveragePostsPerUser());
    }
    @Test
    public void testCalculateAdvStatistics100Users() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> listOfUsers = generateNumberOfUsers(100);
        when(statisticsMock.userNames()).thenReturn(listOfUsers);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(3000);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then

        Assertions.assertEquals(1000, forumStatistics.getNumberOfPosts());
        Assertions.assertEquals(3, forumStatistics.getAverageCommentsPerPosts());
        Assertions.assertEquals(30, forumStatistics.getAverageCommentsPerUser());
        Assertions.assertEquals(10, forumStatistics.getAveragePostsPerUser());
    }
}
