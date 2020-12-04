package com.guilherme.SpringReddit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.guilherme.SpringReddit.domain.Link;

public interface LinkRepository extends JpaRepository<Link, Long> {

    Link findByTitle(String title);

}
