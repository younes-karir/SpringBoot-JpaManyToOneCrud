package com.youneskarir.springbootjpaonetomanycrud.controller;


import com.youneskarir.springbootjpaonetomanycrud.dto.CommentRequest;
import com.youneskarir.springbootjpaonetomanycrud.response.ResponseHandler;
import com.youneskarir.springbootjpaonetomanycrud.service.CommentService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class CommentController {


    private CommentService commentService;


    @PostMapping("/tutorials/{id}/comments")
    public ResponseEntity<Object> createComment(@RequestBody @Valid CommentRequest commentRequest, @PathVariable Long id){
        return ResponseHandler.responseBuilder(
                "Comment has been created",
                HttpStatus.CREATED,
                commentService.createComment(id,commentRequest)
        );
    }

    @GetMapping("/comments/{id}")
    public ResponseEntity<Object> getComment(@PathVariable Long id){
        return ResponseHandler.responseBuilder(
                "comment details",
                HttpStatus.OK,
                commentService.getComment(id)
                );
    }

    @GetMapping("/tutorials/{id}/comments")
    public ResponseEntity<Object> getAll(@PathVariable Long id){
        return ResponseHandler.responseBuilder(
                "tutorial comments list",
                HttpStatus.OK,
                commentService.getTutorialAllComments(id)
        );
    }

    @PutMapping("/comments/{id}")
    public ResponseEntity<Object> updateComment
            (@PathVariable Long id,@RequestBody @Valid CommentRequest commentRequest){

        return ResponseHandler.responseBuilder(
                "comment has been updated",
                HttpStatus.OK,
                commentService.updateComment(id,commentRequest)
        );
    }


    @DeleteMapping("/comments/{id}")
    public ResponseEntity<Object> deleteComment(@PathVariable Long id)
    {
        return ResponseHandler.responseBuilder(
                "comment deleted",
                HttpStatus.OK,
                commentService.deleteComment(id)
        );
    }


    @DeleteMapping("/tutorials/{id}/comments")
    public ResponseEntity<Object> createComment(@PathVariable Long id){
        commentService.deleteTutorialAllComments(id);
        return ResponseHandler.responseBuilder(
                "Comment has been created",
                HttpStatus.CREATED,
               null
        );
    }




}
