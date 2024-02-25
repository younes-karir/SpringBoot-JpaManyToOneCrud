package com.youneskarir.springbootjpaonetomanycrud.modal;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder
@AllArgsConstructor
@Data
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
            name = "tutorial_sequence",
            allocationSize = 1
    )
    @Column(name = "tutorial_id")
    private Long id;
    @Column(name = "Tutorial_title")
    private String Title;
    @Column(name = "Tutorial_description")
    private String description;
    @Column(name = "Tutorial_published")
    private boolean published;


}
