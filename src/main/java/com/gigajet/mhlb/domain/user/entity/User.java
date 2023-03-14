package com.gigajet.mhlb.domain.user.entity;

import com.gigajet.mhlb.domain.user.dto.UserRequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity(name = "users")
@Getter
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String image;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String job;

    public User(UserRequestDto.Register registerDto, String password) {
        this.image = registerDto.getUserImage();
        this.email = registerDto.getEmail();
        this.username = registerDto.getUserName();
        this.description = registerDto.getUserDesc();
        this.password = password;
        this.job = registerDto.getUserJob();
    }
}