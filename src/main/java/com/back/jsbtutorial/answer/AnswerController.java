package com.back.jsbtutorial.answer;

import com.back.jsbtutorial.question.Question;
import com.back.jsbtutorial.question.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/answer")
@RequiredArgsConstructor
@Controller
public class AnswerController {
    private final AnswerService answerService;
    private final QuestionService questionService;

    @PostMapping("/create/{id}")
    @ResponseBody
    public String create(@PathVariable Integer id, @RequestParam("content") String content) {
        Question question = questionService.getQuestion(id);
        answerService.create(question, content);
        return id + "번 답글 등록완료";
    }
}
