package com.example.archyuas.click;

import com.example.archyuas.entity.Friends;

import java.util.ArrayList;

// 10116371 ARCHY RPN IF-8  11/8/2019
public interface LoadFriendsCallback {
    void preExecute();
    void postExecute(ArrayList<Friends> friends);
}
