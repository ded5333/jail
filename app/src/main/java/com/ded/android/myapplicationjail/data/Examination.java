package com.ded.android.myapplicationjail.data;

import com.ded.android.myapplicationjail.data.model.Answer;
import com.ded.android.myapplicationjail.data.model.Question;

import java.util.LinkedHashMap;

public class Examination {

  public static final int FIRST_QUESTION = -1;
  private static Examination instance = null;
  private boolean isFirstQuestion = true;
  private Question currentQuestion;
  private LinkedHashMap<Integer, Question> examinationQuestions = new LinkedHashMap<>();

  public static Examination getInstance() {
    if (instance == null) {
      instance = new Examination();
    }
    return instance;
  }


  public Examination() {


    Question question1 = new Question("Вы заходите  в хату, на вас с интересом смотрят заключенные,вы: ");
    Question question2 = new Question("Рассказывай за что загремел?");
    Question question2a = new Question("Покупал или продавал?");
    Question question3 = new Question("Сильно били пока ты был под следствием?");
    Question question4 = new Question("Сам кто по жизни?");
    Question question4a = new Question("Вам предлагают купить койку или ждать очередь,вы: ");
    Question question4b = new Question("Давай аббревиатуру набьем тебе");
    Question question5 = new Question("Как может во что-то рубанем?");


    question1.setAnswers(new Answer("Здарова братва!", question3), new Answer("Добрый вечер", question2),
        new Answer("Мир вашему дому", question2), new Answer("здарова мужики", question2),
        new Answer("пожмете руку", question2), new Answer("здравствуйте арестанты", question2));
    question2.setAnswers(
        new Answer("да так за мелкую кражу", question3),
        new Answer("взял кассу", question3),
        new Answer("менты падлы подставили, гоп стоп вешают", question3),
        new Answer("за наркоту", question2a),
        new Answer("против системы пошел", question3),
        new Answer("за убийство ", question3)

    );

    question2a.setAnswers(new Answer("Покупал", question3), new Answer("Продавал", question3));


    currentQuestion = question1;

  }

  public Question setCurrentQuestionByAnswerId(int answerNum) {
    Answer answer = currentQuestion.getAnswers()[answerNum];
    int nextQuestionId = answer.getNextQuestionId();
    currentQuestion = getQuestionById(nextQuestionId);
    isFirstQuestion = false;
    return currentQuestion;
  }

  public void addQuestion(Question question) {
    examinationQuestions.put(question.getId(), question);
  }

  public Question getQuestionById(int id) {

    return examinationQuestions.get(id);
  }

  public void createAndAddQuestion(String questionText, Answer... answers) {

  }

  public boolean isFirstQuestion() {
    return isFirstQuestion;
  }


  public Question loadCurrentQuestion() {
    return currentQuestion;
  }
}
