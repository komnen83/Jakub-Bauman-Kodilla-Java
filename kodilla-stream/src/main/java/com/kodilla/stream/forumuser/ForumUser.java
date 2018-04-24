package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int userID;
    private final String userName;
    private final char sex = 'M';
    private final LocalDate birthDay;
    private final int postNumber;

    public ForumUser(int userID, String userName, int birthDay, int postNumber, char sex) {
        this.userID = userID;
        this.userName = userName;
        this.birthDay = birthDay;
        this.postNumber = postNumber;
        this.sex = sex;
    }

    public int getUserID() {
        return userID;
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

    public int getPostNumber() {
        return postNumber;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", sex=" + sex +
                ", birthDay=" + birthDay +
                ", postNumber=" + postNumber +
                '}';
    }
}
