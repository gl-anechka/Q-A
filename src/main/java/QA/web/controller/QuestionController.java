package QA.web.controller;

import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.sql.Struct;

@Controller
public class QuestionController {
    @GetMapping("/")
    public String start() {
        return "redirect:/step1";
    }

    @GetMapping("/step1")
    public String step1(Model model) {
        model.addAttribute("title", "Ты меня любишь?");
        model.addAttribute("text", "Только честно");
        model.addAttribute("image", "/images/photo1.png");
        model.addAttribute("nextUrl", "/step2");
        model.addAttribute("yesText", "ДА!");
        model.addAttribute("noText", "Ну да");

        return "quest";
    }

    @GetMapping("/step2")
    public String step2(Model model) {
        model.addAttribute("title", "Ты точно уверен?");
        model.addAttribute("image", "/images/photo2.png");
        model.addAttribute("nextUrl", "/step3");
        model.addAttribute("yesText", "Точно");
        model.addAttribute("noText", "Не-а");

        return "quest";
    }

    @GetMapping("/step3")
    public String step3(Model model) {
        model.addAttribute("title", "Последний шанс передумать...");
        model.addAttribute("text", "Иначе буду кусаться >_<");
        model.addAttribute("image", "/images/photo3.png");
        model.addAttribute("nextUrl", "/final");
        model.addAttribute("yesText", "Уверен!");
        model.addAttribute("noText", "Можно обратно?");

        return "quest";
    }

    @GetMapping("/final")
    public String finalPage(Model model) {
        model.addAttribute("title", "Ура-ура ^^!");
        model.addAttribute("image", "/images/final.png");

        return "final";
    }
}
