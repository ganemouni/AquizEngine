package com.stackroute.adminService.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Question {
  @Id
  private String id;
  private String question;
  private String sentence;
  private String answer;
  private String[] choices;
  private String difficulty;
  private double score;
  private int correctAttempts;
  private int totalOccurrences;

  public Question() {
  }

  public Question(String id, String question, String sentence, String answer, String[] choices, String difficulty, double score, int correctAttempts, int totalOccurrences) {
    this.id = id;
    this.question = question;
    this.sentence = sentence;
    this.answer = answer;
    this.choices = choices;
    this.difficulty = difficulty;
    this.score = score;
    this.correctAttempts = correctAttempts;
    this.totalOccurrences = totalOccurrences;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getDifficulty() {
    return difficulty;
  }

  public void setDifficulty(String difficulty) {
    this.difficulty = difficulty;
  }

  public int getCorrectAttempts() {
    return correctAttempts;
  }

  public void setCorrectAttempts(int correctAttempts) {
    this.correctAttempts = correctAttempts;
  }

  public int getTotalOccurrences() {
    return totalOccurrences;
  }

  public void setTotalOccurrences(int totalOccurrences) {
    this.totalOccurrences = totalOccurrences;
  }
}
