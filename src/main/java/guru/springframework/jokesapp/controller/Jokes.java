package guru.springframework.jokesapp.controller;

import guru.springframework.jokesapp.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Jokes {

    private JokeService jokeService;

    public Jokes(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping(value = { "/", ""})
    public String getJoke(Model model) {

        model.addAttribute("joke", jokeService.getRandomQuote());

        return "chucknorris";
    }
}
