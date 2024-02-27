package com.youneskarir.springbootjpaonetomanycrud.controller;


import com.youneskarir.springbootjpaonetomanycrud.dto.TutorialRequest;
import com.youneskarir.springbootjpaonetomanycrud.modal.Tutorial;
import com.youneskarir.springbootjpaonetomanycrud.response.ResponseHandler;
import com.youneskarir.springbootjpaonetomanycrud.service.TutorialService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/tutorials")
public class TutorialController {

    private TutorialService tutorialService;


    @PostMapping
    public ResponseEntity<Object> createTutorial(@RequestBody @Valid  TutorialRequest tutorialRequest){
        return ResponseHandler.responseBuilder(
                "tutorial has been created",
                HttpStatus.CREATED,
                tutorialService.createTutorial(tutorialRequest)
        );
    }


    @GetMapping("{id}")
    public ResponseEntity<Object> getTutorial(@PathVariable Long id){
        return ResponseHandler.responseBuilder(
                "tutorial details",
                HttpStatus.CREATED,
                tutorialService.getTutorial(id)
        );
    }

    @GetMapping
    public ResponseEntity<Object>  getALL( ){
        return ResponseHandler.responseBuilder(
                "list of tutorials",
                HttpStatus.OK,
                tutorialService.getAll()
        );
    }


    @PutMapping("{id}")
    public ResponseEntity<Object> updateTutorial(
            @PathVariable Long id,
            @RequestBody @Valid TutorialRequest tutorialRequest){
        return ResponseHandler.responseBuilder(
                "Tutorial has been updated",
                HttpStatus.OK,
                tutorialService.updateTutorial(id,tutorialRequest)
        );
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Object> deleteTutorial(@PathVariable Long id){
        return ResponseHandler.responseBuilder(
                "tutorial has been deleted",
                HttpStatus.OK,
                tutorialService.deleteTutorial(id)
        );
    }





}
