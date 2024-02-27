package com.youneskarir.springbootjpaonetomanycrud.service;

import com.youneskarir.springbootjpaonetomanycrud.dto.CommentRequest;
import com.youneskarir.springbootjpaonetomanycrud.dto.TutorialRequest;
import com.youneskarir.springbootjpaonetomanycrud.modal.Comment;

import java.util.List;

public interface CommentService {
    Comment createComment(Long tutorialId,CommentRequest CommentRequest);
    Comment getComment(Long id);
    Comment deleteComment(Long id);
    Comment updateComment(Long commentId,CommentRequest CommentRequest);
    List<Comment> getTutorialAll(Long tutorialId);
}
