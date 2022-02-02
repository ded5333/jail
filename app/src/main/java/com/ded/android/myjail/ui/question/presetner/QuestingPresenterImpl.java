package com.ded.android.myjail.ui.question.presetner;

import android.content.Context;

import com.ded.android.myjail.data.Examination;
import com.ded.android.myjail.data.model.Question;
import com.ded.android.myjail.ui.question.view.QuestionFragmentView;

import static com.ded.android.myjail.data.Examination.FIRST_QUESTION;

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
