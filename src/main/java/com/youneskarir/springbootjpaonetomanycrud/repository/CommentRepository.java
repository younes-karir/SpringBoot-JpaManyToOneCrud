package com.youneskarir.springbootjpaonetomanycrud.repository;

import com.youneskarir.springbootjpaonetomanycrud.modal.Comment;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment,Long> {

    List<Comment> findAllByTutorialId(Long id);

    void deleteByTutorialId(Long tutorial_id);

    @Modifying
    @Query(
            value = "DELETE  FROM Comment c where c.tutorial_id=?1",
            nativeQuery = true
    )
    void deleteAllByTutorial_Id(Long id);
}
