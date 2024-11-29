package com.example.RandomMovieQuote.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.RandomMovieQuote.DTO.QuoteDTO;
import com.example.RandomMovieQuote.service.QuoteService;

@RestController
public class QuoteController {
  
  @Autowired
  private QuoteService service;

  @GetMapping("/series/frases")
  public QuoteDTO getQuote(){
    return service.getQuote();
  }
}
