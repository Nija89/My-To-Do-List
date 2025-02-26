package com.myProject.todolist.service;

import com.myProject.todolist.Entity.UserList;

import java.util.List;

public interface UserListService {

    UserList save(UserList newUserList);

    UserList findById(int id);

    List<UserList> findAll();

    void deleteById(int id);

}
