package com.ded.android.myapplicationjail.data;

import android.util.Log;

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


    Question question1 = new Question("Вы заходите в хату, на вас с интересом смотрят заключенные, вы: ");
    addQuestion(question1);
    Question question2 = new Question("Рассказывай за что загремел?");
    addQuestion(question2);
    Question question2a = new Question("Покупал или продавал?");
    addQuestion(question2a);
    Question question3 = new Question("Сильно били пока ты был под следствием?");
    addQuestion(question3);
    Question question4 = new Question("Сам кто по жизни?");
    addQuestion(question4);
    Question question4a = new Question("Вам предлагают купить койку или ждать очередь, вы: ");
    addQuestion(question4a);
    Question question4b = new Question("Давай аббревиатуру набьем тебе");
    addQuestion(question4b);
    Question question5 = new Question("Может во что-то рубанем?");
    addQuestion(question5);
    Question question6 = new Question("На что играть будем?");
    addQuestion(question6);
    Question question7 = new Question("У нас ведь здесь черная зона, ты же знаешь что это означает?");
    addQuestion(question7);
    Question question8 = new Question("Я вижу у тебя чаек при себе, а что за чай?");
    addQuestion(question8);
    Question question9 = new Question("Будь добр, завари чифирку, а то в хате галяк");
    addQuestion(question9);
    Question question10 = new Question("Дальше что будешь делать?");
    addQuestion(question10);
    Question question11 = new Question("Сидите пьете чай, а сокамерник идет в туалет, вы:");
    addQuestion(question11);
    Question question12 = new Question("Ну что, вилкой в глаз или в жопу раз?");
    addQuestion(question12);
    Question question13 = new Question("Баба есть у тебя?");
    addQuestion(question13);
    Question question14 = new Question("И как, хорошо с ней было? Мохнатку лизал ей?");
    addQuestion(question14);
    Question question15 = new Question("Можешь пойти на дальняк выдавить личинку");
    addQuestion(question15);
    Question question15a = new Question("Вы громко разперделись, не рви жопу дай примерить!\n" +
        "Ну с облегчением тебя, руки хоть помой а то ведь хер трогал");
    addQuestion(question15a);
    Question question16 = new Question("Шары вкатывать будешь?");
    addQuestion(question16);
    Question question17 = new Question("лучше сразу признайся ты не пидераст, а то все равно узнаем рано или поздно");
    addQuestion(question17);
    Question question18 = new Question("А доказывать будешь? В тазик сядешь?");
    addQuestion(question18);
    Question question19 = new Question("Вас ударил сокамерник, ваши действия:");
    addQuestion(question19);
    Question question20 = new Question("Вы получили передачу и к вам подходит обиженный и просит угостить сигаретой, ваши действия: ");
    addQuestion(question20);
    Question question21 = new Question("Вы получили передачу и к вам подходит смотрящий и просит уделить на общее, ваши действия: ");
    addQuestion(question21);
    Question question22 = new Question("Вы обнаружили что пропала шоколадка");
    addQuestion(question22);
    Question question23 = new Question("вам становиться известно что сокамерники планируют побег, вы:");
    addQuestion(question23);
    Question question24 = new Question("Сокамернику принесли телефон, вы:");
    addQuestion(question24);
    Question question25 = new Question("Сокамерники просят заплатить на свободе за телефон который принесут в камеру, вы:");
    addQuestion(question25);
    Question question26 = new Question("Вас просят помыть пол в камере, вы:");
    addQuestion(question26);


    question1.setAnswers(new Answer("Здарова братва!", question2), new Answer("Добрый вечер", question2),
        new Answer("Мир вашему дому", question2), new Answer("Здарова мужики", question2),
        new Answer("Пожмете руку", question2), new Answer("Здравствуйте арестанты", question2)
    );
    question2.setAnswers(
        new Answer("Да так, за мелкую кражу", question3),
        new Answer("Взял кассу", question3),
        new Answer("Менты падлы подставили, гоп-стоп вешают", question3),
        new Answer("За наркоту", question2a),
        new Answer("Против системы пошел", question3),
        new Answer("За убийство ", question3)
    );

    question2a.setAnswers(new Answer("Покупал", question3), new Answer("Продавал", question3));
    question3.setAnswers(new Answer("Душили противогазом", question4), new Answer("Подвешивали ласточкой за руки и за ноги", question4),
        new Answer("По голове через книгу били", question4), new Answer("Не били вообще", question4),
        new Answer("Один раз по лицу опер засветил", question4));

    question4.setAnswers(new Answer("Да так, обычный рабочий", question5), new Answer("Мент бывший", question4a),
        new Answer("Бизнесом занимался", question4a), new Answer("Не лох я , живу по понятиям", question4b));

    question4a.setAnswers(new Answer("Согласиться", question5), new Answer("Отказаться", question5));

    //todo написать аббвреатуру
    question4b.setAnswers(new Answer("", question5), new Answer("", question5));

    question5.setAnswers(new Answer("Шашки", question6), new Answer("Шахматы", question6),
        new Answer("Карты", question6), new Answer("Домино", question6), new Answer("Нарды", question6));

    question6.setAnswers(new Answer("На просто так", question7), new Answer("На интерес", question7),
        new Answer("Без интереса", question7), new Answer("Ну мне интересно что ты имел ввиду", question7));
    question7.setAnswers(new Answer("Знаю, когда все по ментовским предписаниям", question8),
        new Answer("Когда всем черножопые управляют", question8),
        new Answer("Кода братва и понятия порядком управляют", question8));
    question8.setAnswers(new Answer("Липтон", question9), new Answer("Ахмад", question9),
        new Answer("Зеленый", question9), new Answer("Батик", question9), new Answer("Беседа", question9));

    question9.setAnswers(new Answer("Налить воды в чашку и поставить кипятиться", question10),
        new Answer("Высыпать чай в чашу залить водой и поставить кипятиться", question10),
        new Answer("Поставить кипятиться воду, по чашам рассыпать чай", question10),
        new Answer("Я не знаю как его делать", question11));
    question10.setAnswers(new Answer("После закипания разлить воду по приготовленным кружкам с чаем", question11),
        new Answer("Держать чашу с чаем на огне 5 мину и запарить еще 10", question11),
        new Answer("Высыпать чай в чашу после закипания воды перемешать, затем попарить", question11),
        new Answer("Высыпать чай в чашу после закипания воды, попарить, затем несколько раз подогреть снова", question11),
        new Answer("Высыпать чай в чашу после закипания воды, попарить перемешивая", question11));

    question11.setAnswers(new Answer("Будете дальше сидеть пить чай", question12),
        new Answer("Перестаете пить чай", question12),
        new Answer("Перестаете пить чай и по возвращению его сделаете замечание", question12));

    question12.setAnswers(new Answer("Да пошел ты!", question13), new Answer("Вилкой в глаз", question13),
        new Answer("В жопу, вилкой больно", question13), new Answer("Что-то я не вижу здесь одноглазых", question13));

    question13.setAnswers(new Answer("Есть", question14), new Answer("Была", question14),
        new Answer("Нету", question14));
    question14.setAnswers(new Answer("Да хорошо, конечно лизал, кто ж не лизал", question15),
        new Answer("Да хорошо было, но мохнатую к сожалению не лизал", question15),
        new Answer("Моя личная жизнь это моя личная жизнь", question15),
        new Answer("Я же сказал что нету девушки", question15),
        new Answer("Ну так, было разок", question15));
    question15.setAnswers(new Answer("Сесть на виду у всех и начать откладывать глину",
            question15a), new Answer("Начать давить пасту пытаясь скрыть звуки пердежа", question15a),
        new Answer("Откидывать шлак с особым энтузиазмом, дуть в дудку", question15a),
        new Answer("Нет, не хочу", question16));
    question15a.setAnswers(new Answer("Помыть", question16), new Answer("Не мыть", question16),
        new Answer("Вырубить хуком того кто хотел примерить твою жопу", question16));
    question16.setAnswers(new Answer("Буду", question17), new Answer("Нет", question17),
        new Answer("А вы здесь в бильярд играете?", question17));
    question17.setAnswers(new Answer("Да", question18), new Answer("Нет", question18),
        new Answer("Я бисексуал", question18));
    question18.setAnswers(new Answer("Да нет, ты чего", question19), new Answer("Сяду", question19),
        new Answer("Я в тазик сяду если ты мне в х.й дунешь чтобы пузыри пошли", question19));
    question19.setAnswers(new Answer("Ударите в ответ", question20), new Answer("Пожалуетесь администрации", question20),
        new Answer("Расскажите смотрящему", question20), new Answer("Промолчите", question20));
    question20.setAnswers(new Answer("Дадите пачку", question21), new Answer("Откажите", question21));
    question21.setAnswers(new Answer("Откажете", question22), new Answer("Отдадите все на нужды арестантам", question22),
        new Answer("Отдадите половину на нужды арестантам", question22),
        new Answer("Дадите 15-20% на нужды арестантам", question22));
    question22.setAnswers(new Answer("Вы нажалуетесь смотрящему", question23),
        new Answer("Нажалуетесь администрации", question23),
        new Answer("Попросите сокамерников сделать братский шмон", question23),
        new Answer("При всех сообщите о пропаже шоколадки , имеючи риск быть жлобом что сами съели и забыли ", question23));
    question23.setAnswers(new Answer("Скажите Администрации", question24), new Answer("Попроситесь с ними", question24),
        new Answer("Будете молчать", question24));
    question24.setAnswers(new Answer("Попросите позвонить", question25), new Answer("Не возьмете телефон", question25),
        new Answer("Будете ждать пока преложить позвонить", question25));
    question25.setAnswers(new Answer("Откажетесь ", question26), new Answer("Согласитесь", question26));
    question26.setAnswers(new Answer("Согласитесь", question26), new Answer("Откажете", question26),
        new Answer("Поинтересуетесь о графике дежурств", question26),
        new Answer("Дадите леща тому кто попросил помыть пол", question26)
    );


    currentQuestion = question1;

//    Answer answer = currentQuestion.getAnswers()[5];
//    Log.d("TAG", "Examination: " + answer.getTextAnswer());


  }

  public Question setCurrentQuestionByAnswerId(int answerNum) {
    Answer answer = currentQuestion.getAnswers()[answerNum];
    int nextQuestionId = answer.getNextQuestionId();
    currentQuestion = this.getQuestionById(nextQuestionId);
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
