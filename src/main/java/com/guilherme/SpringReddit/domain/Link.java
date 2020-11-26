package com.guilherme.SpringReddit.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Link {

    @Id
    @GeneratedValue
    private Long Id;

    @NonNull
    private String title;

    @NonNull
    private String url;

    @OneToMany(mappedBy="Link")
    private List<Comment> comments = new ArrayList<>();

}
