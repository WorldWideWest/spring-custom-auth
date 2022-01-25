package com.auth.demo.user;

import java.util.List;

import com.auth.demo.roles.Role;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String homeView(){
        return "index";
    }

    @GetMapping("/register")
    public String registerView(Model model){
        User user = new User();
        model.addAttribute("user", user);
        return "register-view";
    }

    @PostMapping("/process-register")
    public String registerView(User user){
        
        userService.registerDefaultUser(user);
        return "register-success";

    }

    @GetMapping("/users")
    public String usersView(Model model) {

        List<User> listUsers = userRepository.findAll();
        model.addAttribute("listUsers", listUsers);
        return "users-view";

    }

    @GetMapping("/edit/{id}")
    public String editUserView(@PathVariable("id") int id, Model model) {

        User user = userService.getUser(id);
        model.addAttribute("user", user);
        List<Role> roles = userService.listRoles();
        model.addAttribute("roles", roles);

        return "edit-view";
        
    }


}
