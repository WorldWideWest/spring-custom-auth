package com.auth.demo.roles;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
     
    @Column(nullable = false, length = 45)
    private String name;
 
    public Role() { }
     
    public Role(String name) {
        this.name = name;
    }
     
    public Role(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
 
    public Role(Integer id) {
        this.id = id;
    }
     
 
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
