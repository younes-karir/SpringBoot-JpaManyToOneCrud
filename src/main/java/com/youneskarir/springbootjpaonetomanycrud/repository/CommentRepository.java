package com.youneskarir.springbootjpaonetomanycrud.repository;

import com.youneskarir.springbootjpaonetomanycrud.modal.Comment;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment,Long> {

    List<Comment> findAllByTutorialId(Long id);


    @Transactional
    void deleteAllByTutorial_Id(Long id);
}
