package com.myProject.todolist.dao;

import com.myProject.todolist.Entity.UserList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ListRepository extends JpaRepository<UserList, Integer> {
}
