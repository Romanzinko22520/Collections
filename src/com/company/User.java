package com.company;
public class User implements Comparable<User>{
    int id;
    String name;


    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(User o) {
        return id-o.id;
    }
}
