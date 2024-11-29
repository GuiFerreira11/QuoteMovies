package com.example.RandomMovieQuote.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.RandomMovieQuote.DTO.QuoteDTO;
import com.example.RandomMovieQuote.models.Quote;
import com.example.RandomMovieQuote.repository.QuoteRepository;

@Service
public class QuoteService {
  @Autowired
  private QuoteRepository repository;

  public QuoteDTO getQuote() {
    Quote quote = repository.getRandomQuote();
    return new QuoteDTO(quote.getQuote(), quote.getMovieChar(), quote.getMovie(), quote.getUrlPoster());
  }


}
