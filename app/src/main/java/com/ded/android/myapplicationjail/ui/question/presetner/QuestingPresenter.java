package com.ded.android.myapplicationjail.ui.question.presetner;

import com.ded.android.myapplicationjail.data.model.Question;

public interface QuestingPresenter {

  Question loadNextQuestionByAnswerId(int answerId);

  boolean isFirstQuestion();
}
