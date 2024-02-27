package com.youneskarir.springbootjpaonetomanycrud.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;

@Getter
public class CommentRequest {

    @NotEmpty(message = "comment should not bes empty")
    @Size(min = 3,message = "comment less than 3 character")
    private String content;

}
