package com.ded.android.myjail.ui.question.presetner;

import com.ded.android.myjail.data.model.Question;

public interface QuestingPresenter {

  Question loadNextQuestionByAnswerId(int answerId);

  boolean isFirstQuestion();

}
