package com.ded.android.myjail.data.model;

public class Answer {
  private String textAnswer;
  private int nextQuestionId;
  private int category;

  public Answer(String textAnswer, Question nextQuestion,int category) {
    this.textAnswer = textAnswer;
    this.nextQuestionId = nextQuestion.getId();
    this.category = category;
  }

  public int getNextQuestionId() {
    return nextQuestionId;
  }

  public String getTextAnswer() {
    return textAnswer;
  }

  public int getCategory() {
    return category;
  }
}
