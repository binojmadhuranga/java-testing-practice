package com.exampl.test;

public class UserFinder {

    public String findUserById(int id) {
        if (id == 0) {
            return null; // user not found
        }
        return "User" + id;
    }
}
