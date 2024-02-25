package com.youneskarir.springbootjpaonetomanycrud.modal;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "comment")
public class Comment {

    @Id
    @GeneratedValue(
            generator = "comment_sequence",
            strategy = GenerationType.SEQUENCE
    )
    @SequenceGenerator(
            sequenceName = "comment_sequence",
            name = "comment_id",
            allocationSize = 1
    )
    @Column(name = "comment_id")
    private Long id;

    @Column(name = "content")
    private String content;


    @ManyToOne(fetch = FetchType.LAZY, optional = false) // many comments hav one tutorial
    @JoinColumn(name = "tutorial_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE) // if the tutorial was deleted all his comment should be deleted also
    @JsonIgnore
    private Tutorial tutorial;
}
