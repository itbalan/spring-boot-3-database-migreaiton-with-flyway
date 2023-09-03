package com.flyway.springboot3databasemigreaitonwithflyway.models;


import com.flyway.springboot3databasemigreaitonwithflyway.models.Account;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;

    String title;

    @Column(columnDefinition="TEXT")
    String body;

    LocalDateTime createdAt;
    LocalDateTime updatedAt;

    @ManyToOne
    @JoinColumn(name="account_id", referencedColumnName = "id", nullable = false)
    private Account account;
}
