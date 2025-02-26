package com.myProject.todolist.controller;

import com.myProject.todolist.Entity.UserList;
import com.myProject.todolist.service.UserListService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.List;

@Controller
@RequestMapping("/todolist")
public class MainController {
    private UserListService userListService;
    public MainController(UserListService userListService){
        this.userListService = userListService;
    }

    @GetMapping("/myList")
    public String viewList(Model model){
        List<UserList> myList = userListService.findAll();
        model.addAttribute("myList", myList)
                .addAttribute("newList", new UserList())
                .addAttribute("addItem", "Add New To-Do-List");
        return "MyTodolist";
    }

    @PostMapping("/processForm")
    public String processForm(@ModelAttribute("newList") UserList userList){
        userList.setTimeCreated(new Timestamp(System.currentTimeMillis()));
        userListService.save(userList);
        return "redirect:/todolist/myList";
    }

    @GetMapping("/showFormForUpdate")
    public String updateList(@RequestParam("id") int id, Model model){
        UserList myUserList = userListService.findById(id);
        List<UserList> myList = userListService.findAll();
        model.addAttribute("myList", myList)
                .addAttribute("newList", myUserList)
                .addAttribute("addItem", "Update To-Do-List");
        return "MyTodolist";
    }
    @GetMapping("/showFormForDeletion")
    public String deleteList(@RequestParam("id") int id, Model model){
        userListService.deleteById(id);
        return "redirect:/todolist/myList";
    }

}
