package My_Spring_Projects.demo.controller;


import My_Spring_Projects.demo.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyController
{
    @PostMapping("users")
    public User saveUser(@RequestBody User user)
    {
        System.out.println("User saved!");
        user.setPass("");
        return user;
    }

    @PostMapping("users-all")
    public List<User> saveUser(@RequestBody List<User> users)
    {
        System.out.println("User saved!");
        users.forEach(user -> user.setPass(""));
        return users;
    }
}
