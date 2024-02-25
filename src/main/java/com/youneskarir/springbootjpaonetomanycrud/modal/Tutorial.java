package com.youneskarir.springbootjpaonetomanycrud.modal;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tutorial")
public class Tutorial {

    @Id
    @GeneratedValue(
            generator = "tutorial_sequence",
            strategy = GenerationType.SEQUENCE
    )
    @SequenceGenerator(
            sequenceName = "tutorial_sequence",
            name = "tutorial_id",
            allocationSize = 1
    )
    @Column(name = "tutorial_id")
    private String id;
    @Column(name = "comment_title")
    private String Title;
    @Column(name = "comment_description")
    private String description;
    @Column(name = "comment_published")
    private boolean published;


}
