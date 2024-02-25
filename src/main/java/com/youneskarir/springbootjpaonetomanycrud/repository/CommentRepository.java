package com.youneskarir.springbootjpaonetomanycrud.repository;

import com.youneskarir.springbootjpaonetomanycrud.modal.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment,Long> {

    List<Comment> findAllByTutorialId(Long id);
}
