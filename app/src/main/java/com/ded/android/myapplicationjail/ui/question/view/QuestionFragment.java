package com.ded.android.myapplicationjail.ui.question.view;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.ded.android.myapplicationjail.R;
import com.ded.android.myapplicationjail.data.model.Answer;
import com.ded.android.myapplicationjail.data.model.Question;
import com.ded.android.myapplicationjail.data.model.ReactionToAnswer;
import com.ded.android.myapplicationjail.ui.question.presetner.QuestingPresenter;
import com.ded.android.myapplicationjail.ui.question.presetner.QuestingPresenterImpl;

import java.util.ArrayList;

import static com.ded.android.myapplicationjail.data.Examination.FIRST_QUESTION;


public class QuestionFragment extends Fragment implements QuestionFragmentView {

  QuestingPresenter questingPresenter;
  TextView tvQuestion;
  Question currentQuestion;
  int wrapContent = LinearLayout.LayoutParams.WRAP_CONTENT;
  LinearLayout llAnswers;
  LinearLayout.LayoutParams lParams;
  Button btnNewAnswer;

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

    lParams = new LinearLayout.LayoutParams(
        wrapContent, wrapContent);

    llAnswers = view.findViewById(R.id.llAnswers);

    tvQuestion = view.findViewById(R.id.tvName);


    if (questingPresenter.isFirstQuestion()) {

      currentQuestion = questingPresenter.loadNextQuestionByAnswerId(FIRST_QUESTION);

      showAnswers(currentQuestion);

    }

    tvQuestion.setText(currentQuestion.getQuestionText());
    // Log.d("TAG", "getOnClickDoSomething: " + currentQuestion.getReaction());


  }

  void showAnswers(Question currentQuestion) {

    for (int i = 0; i < currentQuestion.getAnswers().length; i++) {
      Answer answer = currentQuestion.getAnswers()[i];
      btnNewAnswer = new Button(requireContext());
      btnNewAnswer.setText(answer.getTextAnswer());
      btnNewAnswer.setId(i);

      Log.d("TAG", "showAnswers: " + answer.getTextAnswer());
      Log.d("TAG", "showAnswers: " + btnNewAnswer.getId());


      llAnswers.addView(btnNewAnswer, lParams);

      btnNewAnswer.setOnClickListener(getOnClickDoSomething(i));
    }
    Log.d("TAG", "showAnswers: " + btnNewAnswer.getId());


  }

  View.OnClickListener getOnClickDoSomething(final int id) {
    return v -> {
      // Log.d("TAG", "onClick: " + currentQuestion.getAnswers()[v.getId()].toString());
      //Answer answer = currentQuestion.getAnswers()[v.getId()];
      // Log.d("TAG", "onClick: " + answer.getNextQuestionId());
      //answer.getNextQuestionId();
      //Log.d("TAG", "onClick: " + v.getId());
      // Log.d("TAG", " answer.getNextQuestionId(): " +  answer.getNextQuestionId());
      llAnswers.removeAllViews();
      int answerId = v.getId();

      currentQuestion = questingPresenter.loadNextQuestionByAnswerId(answerId);


      ReactionToAnswer reaction = currentQuestion.getReaction()[answerId];
      tvQuestion.setText(reaction.getReaction() +  currentQuestion.getQuestionText());

      showAnswers(currentQuestion);

      Log.d("TAG", "getOnClickDoSomething: " + reaction.getReaction());


    };
  }


}