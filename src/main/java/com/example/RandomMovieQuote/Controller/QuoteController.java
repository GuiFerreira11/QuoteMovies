package com.example.RandomMovieQuote.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.RandomMovieQuote.DTO.QuoteDTO;

@Controller
public class QuoteController {
  
  @Autowired
  private QuoteService service;

  @GetMapping("/series/frases")
  public QuoteDTO getQuote(){
    return service.getQuote()
  }
}
