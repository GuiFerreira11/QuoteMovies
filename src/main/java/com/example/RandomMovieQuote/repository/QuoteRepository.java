package com.example.RandomMovieQuote.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.RandomMovieQuote.models.Quote;

public interface QuoteRepository extends JpaRepository<Quote, Long> {}
