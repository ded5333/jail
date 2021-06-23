package com.ded.android.myapplicationjail.data.model;

public class Answer {
  private String textAnswer;
  private int nextQuestionId;

  public Answer(String textAnswer, Question nextQuestion) {
    this.textAnswer = textAnswer;
    this.nextQuestionId = nextQuestion.getId();
  }

  public int getNextQuestionId() {
    return nextQuestionId;
  }
}
