package com.scaler.Splitwise.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Data;

import java.util.List;

@Data
@Entity(name = "SPLITWISE_USER")
public class User extends BaseModel{
    private String name;
    private String email;
    private String phoneNumber;
    @ManyToMany
    private List<Group> groups;
}
