package com.myProject.todolist.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.sql.Timestamp;


@Entity
@Table(name="mylist")
public class UserList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "head")
    @NotNull(message = "This Field cannot be Empty.")
    private String head;

    @Column(name = "body")
    @NotNull(message = "This Field cannot be Empty.")
    @Size(min=5, message = "This field must contain at least 5 character.")
    private String body;

    @Column(name = "time_created", nullable = true)
    private Timestamp timeCreated;

    public UserList(){}

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Timestamp getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(Timestamp timeCreated) {
        this.timeCreated = timeCreated;
    }
}
