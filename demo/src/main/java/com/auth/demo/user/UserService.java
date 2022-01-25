package com.auth.demo.user;

import java.util.List;

import com.auth.demo.roles.Role;
import com.auth.demo.roles.RoleRepositroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepositroy roleRepositroy;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public void registerDefaultUser(User user){
        
        Role userRole = roleRepositroy.findByName("USER");
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        user.addRole(userRole);
        userRepository.save(user);

    }

    public List<User> listAll(){
        return userRepository.findAll();
    }

    public User getUser(int id){
        return userRepository.findById(id).get();
    }

    public List<Role> listRoles(){
        return roleRepositroy.findAll();
    }



}
