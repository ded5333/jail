package com.ded.android.myapplicationjail.data;

import com.ded.android.myapplicationjail.data.model.Answer;
import com.ded.android.myapplicationjail.data.model.Question;
import com.ded.android.myapplicationjail.data.model.ReactionToAnswer;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Examination {

  public static final int FIRST_QUESTION = -1;
  public final int ANSWER_CATEGORY_INSTANTLY_COCK = 0;
  public final int ANSWER_CATEGORY_BAD = 1;
  public final int ANSWER_CATEGORY_MAN = 2;
  public final int ANSWER_CATEGORY_THIEVES = 4;
  public final int ANSWER_CATEGORY_SHESTERKA = 5;
  public final int ANSWER_CATEGORY_STUKACH = 6;

  private static Examination instance = null;
  private boolean isFirstQuestion = true;
  private Question currentQuestion;
  private LinkedHashMap<Integer, Question> examinationQuestions = new LinkedHashMap<>();
  private ArrayList<Integer> categoryArray = new ArrayList<>();

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


    question1.setAnswers(new Answer("Здарова братва!", question2, ANSWER_CATEGORY_THIEVES),
        new Answer("Добрый вечер", question2, ANSWER_CATEGORY_BAD),
        new Answer("Мир вашему дому", question2, ANSWER_CATEGORY_THIEVES),
        new Answer("Здарова мужики", question2, ANSWER_CATEGORY_BAD),
        new Answer("Пожмете руку", question2, ANSWER_CATEGORY_BAD),
        new Answer("Здравствуйте арестанты", question2, ANSWER_CATEGORY_THIEVES)
    );
    question2.setAnswers(
        new Answer("Да так, за мелкую кражу", question3, ANSWER_CATEGORY_THIEVES),
        new Answer("Взял кассу", question3, ANSWER_CATEGORY_THIEVES),
        new Answer("Менты падлы подставили, гоп-стоп вешают", question3, ANSWER_CATEGORY_THIEVES),
        new Answer("За наркоту", question2a, ANSWER_CATEGORY_BAD),
        new Answer("Против системы пошел", question3, ANSWER_CATEGORY_THIEVES),
        new Answer("За убийство ", question3, ANSWER_CATEGORY_THIEVES)
    );

    question2a.setAnswers(new Answer("Покупал", question3, ANSWER_CATEGORY_MAN),
        new Answer("Продавал", question3, ANSWER_CATEGORY_INSTANTLY_COCK));
    question3.setAnswers(new Answer("Душили противогазом", question4, ANSWER_CATEGORY_MAN),
        new Answer("Подвешивали ласточкой за руки и за ноги", question4, ANSWER_CATEGORY_MAN),
        new Answer("По голове через книгу били", question4, ANSWER_CATEGORY_MAN),
        new Answer("Не били вообще", question4, ANSWER_CATEGORY_MAN),
        new Answer("Один раз по лицу опер засветил", question4, ANSWER_CATEGORY_MAN));

    question4.setAnswers(new Answer("Да так, обычный рабочий", question5, ANSWER_CATEGORY_MAN),
        new Answer("Мент бывший", question4a, ANSWER_CATEGORY_MAN),
        new Answer("Бизнесом занимался", question4a, ANSWER_CATEGORY_MAN),
        new Answer("Не лох я, живу по понятиям", question4b, ANSWER_CATEGORY_THIEVES));

    question4a.setAnswers(new Answer("Согласиться", question5, ANSWER_CATEGORY_BAD),
        new Answer("Отказаться", question5, ANSWER_CATEGORY_MAN));

    //todo дописать аббвреатуру
    question4b.setAnswers(new Answer("БОМЖИЗ", question5, ANSWER_CATEGORY_THIEVES),
        new Answer("ЕВРОПА", question5, ANSWER_CATEGORY_THIEVES),
        new Answer("ТУЗ", question5, ANSWER_CATEGORY_THIEVES),
        new Answer("ВУЗ", question5, ANSWER_CATEGORY_THIEVES),
        new Answer("ТМЖ", question5, ANSWER_CATEGORY_MAN),
        new Answer("ЮДВ", question5, ANSWER_CATEGORY_THIEVES)
    );

    question5.setAnswers(new Answer("Шашки", question6, ANSWER_CATEGORY_MAN),
        new Answer("Шахматы", question6, ANSWER_CATEGORY_MAN),
        new Answer("Карты", question6, ANSWER_CATEGORY_MAN),
        new Answer("Домино", question6, ANSWER_CATEGORY_MAN),
        new Answer("Нарды", question6, ANSWER_CATEGORY_MAN));

    question6.setAnswers(new Answer("На просто так", question7, ANSWER_CATEGORY_BAD),
        new Answer("На интерес", question7, ANSWER_CATEGORY_BAD),
        new Answer("Без интереса", question7, ANSWER_CATEGORY_MAN),
        new Answer("Ну мне интересно что ты имел ввиду", question7, ANSWER_CATEGORY_MAN));
    question7.setAnswers(new Answer("Знаю, когда все по ментовским предписаниям", question8, ANSWER_CATEGORY_BAD),
        new Answer("Когда всем черножопые управляют", question8, ANSWER_CATEGORY_BAD),
        new Answer("Кода братва и понятия порядком управляют", question8, ANSWER_CATEGORY_THIEVES));
    question8.setAnswers(new Answer("Липтон", question9, ANSWER_CATEGORY_MAN),
        new Answer("Ахмад", question9, ANSWER_CATEGORY_MAN),
        new Answer("Зеленый", question9, ANSWER_CATEGORY_MAN),
        new Answer("Батик", question9, ANSWER_CATEGORY_MAN),
        new Answer("Беседа", question9, ANSWER_CATEGORY_MAN));

    question9.setAnswers(new Answer("Налить воды в чашку и поставить кипятиться", question10, ANSWER_CATEGORY_MAN),
        new Answer("Высыпать чай в чашу залить водой и поставить кипятиться", question10, ANSWER_CATEGORY_MAN),
        new Answer("Поставить кипятиться воду, по чашам рассыпать чай", question10, ANSWER_CATEGORY_MAN),
        new Answer("Я не знаю как его делать", question11, ANSWER_CATEGORY_MAN));
    question10.setAnswers(new Answer("После закипания разлить воду по приготовленным кружкам с чаем", question11, ANSWER_CATEGORY_MAN),
        new Answer("Держать чашу с чаем на огне 5 мину и запарить еще 10", question11, ANSWER_CATEGORY_MAN),
        new Answer("Высыпать чай в чашу после закипания воды перемешать, затем попарить", question11, ANSWER_CATEGORY_MAN),
        new Answer("Высыпать чай в чашу после закипания воды, попарить, затем несколько раз подогреть снова", question11, ANSWER_CATEGORY_MAN),
        new Answer("Высыпать чай в чашу после закипания воды, попарить перемешивая", question11, ANSWER_CATEGORY_MAN));

    question11.setAnswers(new Answer("Будете дальше сидеть пить чай", question12, ANSWER_CATEGORY_BAD),
        new Answer("Перестаете пить чай", question12, ANSWER_CATEGORY_MAN),
        new Answer("Перестаете пить чай и по возвращению его сделаете замечание", question12, ANSWER_CATEGORY_THIEVES));

    question12.setAnswers(new Answer("Да пошел ты!", question13, ANSWER_CATEGORY_BAD),
        new Answer("Вилкой в глаз", question13, ANSWER_CATEGORY_MAN),
        new Answer("В жопу, вилкой больно", question13, ANSWER_CATEGORY_INSTANTLY_COCK),
        new Answer("Что-то я не вижу здесь одноглазых", question13, ANSWER_CATEGORY_SHESTERKA));

    question13.setAnswers(new Answer("Есть", question14, ANSWER_CATEGORY_MAN),
        new Answer("Была", question14, ANSWER_CATEGORY_MAN),
        new Answer("Нету", question14, ANSWER_CATEGORY_MAN));
    question14.setAnswers(new Answer("Да хорошо, конечно лизал, кто ж не лизал", question15, ANSWER_CATEGORY_BAD),
        new Answer("Да хорошо было, но мохнатую к сожалению не лизал", question15, ANSWER_CATEGORY_MAN),
        new Answer("Моя личная жизнь это моя личная жизнь", question15, ANSWER_CATEGORY_MAN),
        new Answer("Я же сказал что нету девушки", question15, ANSWER_CATEGORY_MAN),
        new Answer("Ну так, было разок", question15, ANSWER_CATEGORY_BAD));
    question15.setAnswers(new Answer("Сесть на виду у всех и начать откладывать глину",
            question15a, 2), new Answer("Начать давить пасту пытаясь скрыть звуки пердежа", question15a, ANSWER_CATEGORY_MAN),
        new Answer("Откидывать шлак с особым энтузиазмом, дуть в дудку", question15a, ANSWER_CATEGORY_MAN),
        new Answer("Нет, не хочу", question16, ANSWER_CATEGORY_MAN));
    question15a.setAnswers(new Answer("Помыть", question16, ANSWER_CATEGORY_MAN),
        new Answer("Не мыть", question16, ANSWER_CATEGORY_BAD),
        new Answer("Вырубить хуком того кто хотел примерить твою жопу", question16, ANSWER_CATEGORY_BAD));
    question16.setAnswers(new Answer("Буду", question17, ANSWER_CATEGORY_MAN),
        new Answer("Нет", question17, ANSWER_CATEGORY_MAN),
        new Answer("А вы здесь в бильярд играете?", question17, ANSWER_CATEGORY_SHESTERKA));
    question17.setAnswers(new Answer("Да", question18, ANSWER_CATEGORY_INSTANTLY_COCK),
        new Answer("Нет", question18, ANSWER_CATEGORY_MAN),
        new Answer("Я бисексуал", question18, ANSWER_CATEGORY_INSTANTLY_COCK));
    question18.setAnswers(new Answer("Да нет, ты чего", question19, ANSWER_CATEGORY_MAN),
        new Answer("Сяду", question19, ANSWER_CATEGORY_BAD),
        new Answer("Я в тазик сяду если ты мне в х.й дунешь чтобы пузыри пошли", question19, ANSWER_CATEGORY_THIEVES));
    question19.setAnswers(new Answer("Ударите в ответ", question20, ANSWER_CATEGORY_MAN),
        new Answer("Пожалуетесь администрации", question20, ANSWER_CATEGORY_STUKACH),
        new Answer("Расскажите смотрящему", question20, ANSWER_CATEGORY_SHESTERKA),
        new Answer("Промолчите", question20, ANSWER_CATEGORY_BAD));
    question20.setAnswers(new Answer("Дадите пачку", question21, ANSWER_CATEGORY_MAN),
        new Answer("Откажите", question21, ANSWER_CATEGORY_BAD));
    question21.setAnswers(new Answer("Откажете", question22, ANSWER_CATEGORY_BAD),
        new Answer("Отдадите все на нужды арестантам", question22, ANSWER_CATEGORY_BAD),
        new Answer("Отдадите половину на нужды арестантам", question22, ANSWER_CATEGORY_MAN),
        new Answer("Дадите 15-20% на нужды арестантам", question22, ANSWER_CATEGORY_MAN));
    question22.setAnswers(new Answer("Вы нажалуетесь смотрящему", question23, ANSWER_CATEGORY_SHESTERKA),
        new Answer("Нажалуетесь администрации", question23, ANSWER_CATEGORY_STUKACH),
        new Answer("Попросите сокамерников сделать братский шмон", question23, ANSWER_CATEGORY_MAN),
        new Answer("При всех сообщите о пропаже шоколадки , имеючи риск быть жлобом что сами съели и забыли ", question23, ANSWER_CATEGORY_MAN));
    question23.setAnswers(new Answer("Скажите Администрации", question24, ANSWER_CATEGORY_STUKACH),
        new Answer("Попроситесь с ними", question24, ANSWER_CATEGORY_SHESTERKA),
        new Answer("Будете молчать", question24, ANSWER_CATEGORY_MAN));
    question24.setAnswers(new Answer("Попросите позвонить", question25, ANSWER_CATEGORY_BAD),
        new Answer("Не возьмете телефон", question25, ANSWER_CATEGORY_MAN),
        new Answer("Будете ждать пока преложить позвонить", question25, ANSWER_CATEGORY_BAD));
    question25.setAnswers(new Answer("Откажетесь ", question26, ANSWER_CATEGORY_MAN),
        new Answer("Согласитесь", question26, ANSWER_CATEGORY_BAD));
    question26.setAnswers(new Answer("Согласитесь", question26, ANSWER_CATEGORY_BAD),
        new Answer("Откажете", question26, ANSWER_CATEGORY_BAD),
        new Answer("Поинтересуетесь о графике дежурств", question26, ANSWER_CATEGORY_MAN),
        new Answer("Дадите леща тому кто попросил помыть пол", question26, ANSWER_CATEGORY_BAD)
    );
    question1.setReaction(new ReactionToAnswer("реакция на первый ответ 0 вопроса"),
        new ReactionToAnswer("реакция на 2 ответ 1 вопроса"),
        new ReactionToAnswer("реакция на 2 ответ 1 вопроса"),
        new ReactionToAnswer("реакция на 2 ответ 1 вопроса")
        );

    question2.setReaction(new ReactionToAnswer("Здарова! "),
        new ReactionToAnswer("Здарова! "),
        new ReactionToAnswer("Здарова! "),
        new ReactionToAnswer("Здарова! "),
        new ReactionToAnswer("Здарова! "),
        new ReactionToAnswer("Здарова! ")

    );
    question3.setReaction(new ReactionToAnswer("Ясно. "),
        new ReactionToAnswer("Красава, наш пацан. "),
        new ReactionToAnswer("Понятно. "),
        new ReactionToAnswer(""),
        new ReactionToAnswer("Красава. "),
        new ReactionToAnswer("Понятно. ")
    );
    question2a.setReaction(new ReactionToAnswer("Бывает! "),
        new ReactionToAnswer(""),
        new ReactionToAnswer(""),
        new ReactionToAnswer("")
    );
    question4.setReaction(new ReactionToAnswer("Ясно. "),
        new ReactionToAnswer("Ясно. "),
        new ReactionToAnswer("Понятно. "),
        new ReactionToAnswer("Понятно. "),
        new ReactionToAnswer("Повезло! "),
        new ReactionToAnswer("Кум поганый! ")
    );
    question5.setReaction(new ReactionToAnswer("Ясно. "),
        new ReactionToAnswer("Красава, наш пацан. "),
        new ReactionToAnswer("Понятно. "),
        new ReactionToAnswer(""),
        new ReactionToAnswer("Красава. "),
        new ReactionToAnswer("Кум поганый! ")
    );
    question6.setReaction(new ReactionToAnswer("Ясно. "),
        new ReactionToAnswer("Красава, наш пацан. "),
        new ReactionToAnswer("Понятно. "),
        new ReactionToAnswer(""),
        new ReactionToAnswer("Красава. "),
        new ReactionToAnswer("Понятно. ")
    );
    question7.setReaction(new ReactionToAnswer("Ясно. "),
        new ReactionToAnswer("Красава, наш пацан. "),
        new ReactionToAnswer("Понятно. "),
        new ReactionToAnswer(""),
        new ReactionToAnswer("Красава. "),
        new ReactionToAnswer("Понятно. ")
    );
    question8.setReaction(new ReactionToAnswer("Ясно. "),
        new ReactionToAnswer("Красава, наш пацан. "),
        new ReactionToAnswer("Понятно. "),
        new ReactionToAnswer(""),
        new ReactionToAnswer("Красава. "),
        new ReactionToAnswer("Понятно. ")
    );


    currentQuestion = question1;

//    Answer answer = currentQuestion.getAnswers()[5];
//    Log.d("TAG", "Examination: " + answer.getTextAnswer());


  }

  public Question setCurrentQuestionByAnswerId(int answerNum) {
    Answer answer = currentQuestion.getAnswers()[answerNum];
    ReactionToAnswer reaction = currentQuestion.getReaction()[answerNum];
    int category = answer.getCategory();
    categoryArray.add(category);


    // Log.d("TAG", "setCurrentQuestionByAnswerId: " + reaction.toString());
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
