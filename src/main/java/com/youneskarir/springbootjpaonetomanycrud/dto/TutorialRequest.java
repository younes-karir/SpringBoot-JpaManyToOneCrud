package com.youneskarir.springbootjpaonetomanycrud.dto;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class TutorialRequest {



    @NotEmpty(message = "tutorial title should not bes empty")
    private String Title;

    @NotEmpty(message = "tutorial description should not bes empty")
    @Size(min = 3,message = "tutorial description less than 3 character")
    private String description;

}
