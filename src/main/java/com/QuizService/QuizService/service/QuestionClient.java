package com.QuizService.QuizService.service;



import com.QuizService.QuizService.entities.Question;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient (url="http://localhost:8081",value="Question-client")
public interface QuestionClient {


    // iske andar ham woh rakhnege joh  service mai  question mai rkha hai

     @GetMapping("/question/quiz/{quizId}") // quizid dono same hogi joh ham url mai dalenge
    List<Question> getQuestionOfQuiz(@PathVariable Long quizId);// list of saare question provide krdega joh question lekr ayga

}
