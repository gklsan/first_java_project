package com.example.first_project;

import org.springframework.stereotype.Component;

// To access through the qualifier by name @Component("auth")
@Component
public class Author {
    private int id;
    private String name;
    private String address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public void compile() {
        System.out.println("compiling.......");
    }
}
