package com.youneskarir.springbootjpaonetomanycrud.repository;

import com.youneskarir.springbootjpaonetomanycrud.modal.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TutorialRepository extends JpaRepository<Tutorial,Long> {

}
