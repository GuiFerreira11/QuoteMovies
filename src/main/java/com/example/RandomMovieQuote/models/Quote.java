package com.example.RandomMovieQuote.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "quotes")
public class Quote {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long Id;
  private String quote;
  private String movieChar;
  private String movie;
  private String urlPoster;

  public Long getId() {
    return Id;
  }
  public String getQuote() {
    return quote;
  }
  public String getMovieChar() {
    return movieChar;
  }
  public String getMovie() {
    return movie;
  }
  public String getUrlPoster() {
    return urlPoster;
  }

}
