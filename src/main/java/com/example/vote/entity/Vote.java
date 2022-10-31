package com.example.vote.entity;

import lombok.Data;

/**
 * @author th
 */
@Data
public class Vote {

    private String username;
    private boolean opinion;

    public Vote(String username, boolean opinion) {
        this.username = username;
        this.opinion = opinion;
    }
}
