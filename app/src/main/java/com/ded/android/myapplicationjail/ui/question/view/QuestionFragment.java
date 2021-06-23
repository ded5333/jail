package com.ded.android.myapplicationjail.ui.question.view;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ded.android.myapplicationjail.R;
import com.ded.android.myapplicationjail.data.model.Question;
import com.ded.android.myapplicationjail.ui.question.presetner.QuestingPresenter;
import com.ded.android.myapplicationjail.ui.question.presetner.QuestingPresenterImpl;

import static com.ded.android.myapplicationjail.data.Examination.FIRST_QUESTION;


public class QuestionFragment extends Fragment implements QuestionFragmentView {

  QuestingPresenter questingPresenter;
  TextView tvQuestion;
  Question currentQuestion;

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
                           Bundle savedInstanceState) {
    // Inflate the layout for this fragment
    return inflater.inflate(R.layout.fragment_question, container, false);
  }

  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    questingPresenter = new QuestingPresenterImpl(this, requireContext());


  }

  @Override
  public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);

    tvQuestion = view.findViewById(R.id.tvName);

    if (questingPresenter.isFirstQuestion()) {

      currentQuestion = questingPresenter.loadNextQuestionByAnswerId(FIRST_QUESTION);

    }

    tvQuestion.setText(currentQuestion.getQuestionText());
  }


}