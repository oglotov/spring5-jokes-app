package ua.wwind.glotov.spring5jokesapp.services

import guru.springframework.norris.chuck.ChuckNorrisQuotes
import org.springframework.stereotype.Service

@Service
class JokeServiceImpl : JokeService {

    private val chuckNorrisQuotes = ChuckNorrisQuotes()

    override fun getJoke(): String {
        return chuckNorrisQuotes.randomQuote
    }
}