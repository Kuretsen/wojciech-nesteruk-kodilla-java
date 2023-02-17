package com.kodilla.testing.forum.statistics;

public class ForumStatistics {
    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private double averagePostsPerUser;
    private double averageCommentsPerUser;
    private double averageCommentsPerPosts;

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public double getAverageCommentsPerPosts() {
        return averageCommentsPerPosts;
    }
    public void calculateAdvStatistics (Statistics statistics) {
        numberOfUsers = statistics.userNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();
        averagePostsPerUser = calculateAvgPostsPerUser();
        averageCommentsPerUser = calculateAvgCommentsPerUser();
        averageCommentsPerPosts =calculateAvgCommentsPerPosts();
    }
    private double calculateAvgPostsPerUser() {
        if (numberOfUsers > 0) {
            return (double) numberOfPosts/numberOfUsers;
        } else {
            return 0;
        }
    }
    private double calculateAvgCommentsPerUser() {
        if (numberOfUsers > 0) {
            return (double) numberOfComments/numberOfUsers;
        } else {
            return 0;
        }
    }
    private double calculateAvgCommentsPerPosts() {
        if (numberOfPosts > 0) {
            return (double) numberOfComments/numberOfPosts;
        } else {
            return 0;
        }
    }
    public void showStatistics() {
        System.out.println("Advanced statistics:");
        System.out.println("Number of users: " + numberOfUsers);
        System.out.println("Number of posts: " + numberOfPosts);
        System.out.println("Number of comments: " + numberOfComments);
        System.out.println("Average number of posts per user: " + averagePostsPerUser);
        System.out.println("Average number of comments per user: " + averageCommentsPerUser);
        System.out.println("Average number of comments per post: " + averageCommentsPerPosts);
    }
}
