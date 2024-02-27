package com.youneskarir.springbootjpaonetomanycrud.service;

import com.youneskarir.springbootjpaonetomanycrud.dto.TutorialRequest;
import com.youneskarir.springbootjpaonetomanycrud.modal.Tutorial;

import java.util.List;

public interface TutorialService {

    Tutorial createTutorial(TutorialRequest tutorialRequest);
    Tutorial getTutorial(Long id);
    Tutorial deleteTutorial(Long id);
    Tutorial updateTutorial(Long id,TutorialRequest tutorialRequest);
    List<Tutorial> getAll();
}
