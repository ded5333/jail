package com.ded.android.myapplicationjail.data.model;

public class Question {

  private static int questionId = 0;
  private String questionText;
  private int id;
  private Answer[] answers;
  private ReactionToAnswer [] reaction;

  private Question() {
  }


  public Question(String questionText, Answer... answers) {
    this.questionText = questionText;
    this.id = ++questionId;
    this.answers = answers;
  }

  public Question setAnswers(Answer... answers) {
    this.answers = answers;
    return this;
  }

  public Question setReaction(ReactionToAnswer... reaction) {
    this.reaction = reaction;
    return this;
  }

  public String getQuestionText() {
    return questionText;
  }

  public int getId() {
    return id;
  }

  public Answer[] getAnswers() {
    return answers;
  }

  public ReactionToAnswer[] getReaction() {
    return reaction;
  }

  public void setId(int id) {
    this.id = id;
  }

}
