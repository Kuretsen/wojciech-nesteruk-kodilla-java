package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    final int id;
    final String userName;
    final char sex;
    final LocalDate birthDay;
    final int postsQuantity;

    public ForumUser(final int id, final String userName, final char sex, final LocalDate birthDay, final int postsQuantity) {
        this.id = id;
        this.userName = userName;
        this.sex = sex;
        this.birthDay = birthDay;
        this.postsQuantity = postsQuantity;
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public int getPostsQuantity() {
        return postsQuantity;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthDay=" + birthDay +
                ", postsQuantity=" + postsQuantity +
                '}';
    }
}
