package com.example.RandomMovieQuote.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.RandomMovieQuote.models.Quote;

public interface QuoteRepository extends JpaRepository<Quote, Long> {

  @Query("SELECT q FROM Quote q order by function('RANDOM') LIMIT 1")
  Quote getRandomQuote();
}
