package de.telran.homework14112023.model;

import java.util.List;

public class ListOfUsers {
    List<User> userList;

    public ListOfUsers(List<User> userList) {
        this.userList = userList;
    }

    public void add(User user){
        userList.add(user);
    }
    public List<User> get(){
        return userList;
    }
}
