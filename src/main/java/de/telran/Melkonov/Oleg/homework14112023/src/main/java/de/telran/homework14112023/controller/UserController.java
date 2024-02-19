package de.telran.homework14112023.controller;

import de.telran.homework14112023.model.ListOfUsers;
import de.telran.homework14112023.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

@GetMapping("/users")
public List<User> getAll(ListOfUsers list){
   return list.get();
}

}
