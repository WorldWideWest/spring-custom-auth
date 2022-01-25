package com.auth.demo.roles;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RoleRepositroy extends JpaRepository<Role, Integer> {
    @Query("SELECT r FROM Role r WHERE r.name = ?1")
    public Role findByName(String name);
}
