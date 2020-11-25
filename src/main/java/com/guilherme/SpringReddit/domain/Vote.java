package com.guilherme.SpringReddit.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



@Data
@NoArgsConstructor
@Entity
public class Vote {

    @Id
    @GeneratedValue
    private Long Id;

    private int vote;
}
