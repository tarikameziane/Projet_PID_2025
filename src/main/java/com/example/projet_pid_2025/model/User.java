package com.example.projet_pid_2025.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String login;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private String langue ;

    @ManyToMany(mappedBy = "users")
    private List<Role> roles = new ArrayList<>();
    public User addRole(Role role) {
        if(!this.roles.contains(role)) {
            this.roles.add(role);
            role.addUser(this);
        }

        return this;
    }


    public User removeRole(Role role) {
        if(this.roles.contains(role)) {
            this.roles.remove(role);
            role.getUsers().remove(this);
        }

        return this;
    }


}
