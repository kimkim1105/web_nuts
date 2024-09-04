package com.kimsomin.nuts.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private String screenName;
    private String email;
    private String phone;
    private String address;
    private String city;
    private String country;
    private String avatar;
    private Date createdDate;
    private Date updatedDate;
}
