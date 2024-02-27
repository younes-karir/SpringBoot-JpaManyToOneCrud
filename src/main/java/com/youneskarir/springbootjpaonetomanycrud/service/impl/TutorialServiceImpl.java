package com.youneskarir.springbootjpaonetomanycrud.service.impl;


import com.youneskarir.springbootjpaonetomanycrud.dto.TutorialRequest;
import com.youneskarir.springbootjpaonetomanycrud.modal.Tutorial;
import com.youneskarir.springbootjpaonetomanycrud.repository.TutorialRepository;
import com.youneskarir.springbootjpaonetomanycrud.service.TutorialService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TutorialServiceImpl implements TutorialService {

    @Autowired
    private TutorialRepository tutorialRepository;


    @Override
    public Tutorial createTutorial(TutorialRequest tutorialRequest) {
        Tutorial tutorial = Tutorial.builder()
                .Title(tutorialRequest.getTitle())
                .description(tutorialRequest.getDescription())
                .published(true)
                .build();

        return tutorialRepository.save(tutorial);
    }

    @Override
    public Tutorial getTutorial(Long id) {
        return tutorialRepository.findById(id).get();
    }

    @Override
    public Tutorial deleteTutorial(Long id) {
        Tutorial deleted = tutorialRepository.findById(id).get();
        tutorialRepository.delete(deleted);
        return deleted;
    }

    @Override
    public Tutorial updateTutorial(Long id, TutorialRequest tutorialRequest) {
        Tutorial tutorial = Tutorial.builder()
                .id(id)
                .Title(tutorialRequest.getTitle())
                .description(tutorialRequest.getDescription())
                .published(true)
                .build();
        return tutorialRepository.save(tutorial);
    }

    @Override
    public List<Tutorial> getAll() {
        return tutorialRepository.findAll();
    }
}
