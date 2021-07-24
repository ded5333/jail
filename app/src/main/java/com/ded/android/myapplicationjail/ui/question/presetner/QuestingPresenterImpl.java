package com.ded.android.myapplicationjail.ui.question.presetner;

import android.content.Context;

import com.ded.android.myapplicationjail.data.Examination;
import com.ded.android.myapplicationjail.data.model.Question;
import com.ded.android.myapplicationjail.ui.question.view.QuestionFragmentView;

import static com.ded.android.myapplicationjail.data.Examination.FIRST_QUESTION;

public class QuestingPresenterImpl implements QuestingPresenter {

  QuestionFragmentView view;
  Context context;


  public QuestingPresenterImpl(QuestionFragmentView view, Context context) {
    this.view = view;
    this.context = context;
  }


  @Override
  public Question loadNextQuestionByAnswerId(int answerId) {
    if (FIRST_QUESTION == answerId)
      return Examination.getInstance(context).loadCurrentQuestion();
    else
      return Examination.getInstance(context).setCurrentQuestionByAnswerId(answerId);
  }

  @Override
  public boolean isFirstQuestion() {

    return Examination.getInstance(context).isFirstQuestion();
  }


}
