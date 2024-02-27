package com.youneskarir.springbootjpaonetomanycrud.service.impl;

import com.youneskarir.springbootjpaonetomanycrud.dto.CommentRequest;
import com.youneskarir.springbootjpaonetomanycrud.dto.TutorialRequest;
import com.youneskarir.springbootjpaonetomanycrud.modal.Comment;
import com.youneskarir.springbootjpaonetomanycrud.modal.Tutorial;
import com.youneskarir.springbootjpaonetomanycrud.repository.CommentRepository;
import com.youneskarir.springbootjpaonetomanycrud.repository.TutorialRepository;
import com.youneskarir.springbootjpaonetomanycrud.service.CommentService;
import com.youneskarir.springbootjpaonetomanycrud.service.TutorialService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CommentServiceImpl implements CommentService {

    private CommentRepository commentRepository;
    private TutorialRepository tutorialRepository;

    @Override
    public Comment createComment(Long tutorialId, CommentRequest CommentRequest) {
        Tutorial tutorial = tutorialRepository.findById(tutorialId).get();
        Comment comment = Comment.builder()
                .tutorial(tutorial)
                .content(CommentRequest.getContent())
                .build();
        return commentRepository.save(comment);
    }

    @Override
    public Comment getComment(Long id) {
        return commentRepository.findById(id).get();
    }

    @Override
    public Comment deleteComment(Long id) {
        Comment deleted = commentRepository.findById(id).get();
        commentRepository.delete(deleted);
        return deleted;
    }

    @Override
    public Comment updateComment( Long commentId, CommentRequest CommentRequest) {

        Comment comment = Comment.builder()
                .id(commentId)
                .content(CommentRequest.getContent())
                .tutorial(commentRepository.findById(commentId).get().getTutorial())
                .build();
        return commentRepository.save(comment);
    }


    @Override
    public List<Comment> getTutorialAllComments(Long tutorialId) {
        return commentRepository.findAllByTutorialId(tutorialId);
    }

    @Override
    public void deleteTutorialAllComments(Long tutorialId) {
         commentRepository.deleteAllByTutorial_Id(tutorialId);
    }


}
