package com.QuizService.QuizService.controller;

import com.QuizService.QuizService.entities.Quiz;
import com.QuizService.QuizService.service.QuizService;
import lombok.Getter;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
// @RequestMapping("/quiz")
public class QuizController {


    private QuizService quizService;

    public QuizController(QuizService quizService) {
        this.quizService = quizService;
    }

    // create  - create k liye service chaiye
    // @requestBody data arha hota hai tab use karte hai
    @PostMapping
    public Quiz create(@RequestBody Quiz quiz) {
        return quizService.add(quiz);
    }

    // get all
    @GetMapping("/quiz")
    public List<Quiz> get() {

        return quizService.get();
    }

    //get one
    @GetMapping("{id}")
    public Quiz getone(@PathVariable long id) {

        return quizService.get(id);
    }
}