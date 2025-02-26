package com.myProject.todolist.service;

import com.myProject.todolist.Entity.UserList;
import com.myProject.todolist.dao.ListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserListServiceImplement implements UserListService{
    private ListRepository listRepository;
    @Autowired
    public UserListServiceImplement(ListRepository listRepository){
        this.listRepository = listRepository;
    }
    @Override
    public UserList save(UserList newUserList) {
        return listRepository.save(newUserList);
    }

    @Override
    public UserList findById(int id) {
        Optional<UserList> foundList =  listRepository.findById(id);
        if(foundList.isEmpty()){
            throw new RuntimeException("No any List Found with id " + id);
        }else{
            return foundList.get();
        }
    }

    @Override
    public List<UserList> findAll() {
        return listRepository.findAll();
    }

    @Override
    public void deleteById(int id) {
        listRepository.deleteById(id);
    }
}
