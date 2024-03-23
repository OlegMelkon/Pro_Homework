package de.telran;

import de.telran.dao.DbUserDao;
import de.telran.dao.UserDao;
import de.telran.database.Db;
import de.telran.model.User;

import java.io.FileNotFoundException;
import java.sql.*;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Db db = new Db();
        UserDao userDao = new DbUserDao(db);
        userDao.create(new User("John", 1, 33));
        userDao.create(new User("David", 2, 30));
        userDao.create(new User("Ivan", 3, 53));
        List<User> all = userDao.findAll();
        all.get(0);
        List<User> david = userDao.findAllByName("David");
        //List<User> badRequest = userDao.findAllByName("'; Select * from Users where id  >0");
        System.out.println(david);
    }
}