package com.guilherme.SpringReddit.repository;

import com.guilherme.SpringReddit.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {

}
