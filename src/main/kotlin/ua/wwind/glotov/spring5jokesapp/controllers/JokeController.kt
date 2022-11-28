package ua.wwind.glotov.spring5jokesapp.controllers

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import ua.wwind.glotov.spring5jokesapp.services.JokeService

@Controller
class JokeController(@Autowired private val jokeService: JokeService) {

    @GetMapping("/")
    fun showJoke(model: Model): String {
        model.addAttribute("joke", jokeService.getJoke())
        return "index"
    }
}