package com.ded.android.myjail.ui.question.view;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.ded.android.myjail.MainActivity;
import com.ded.android.myjail.R;
import com.ded.android.myjail.data.model.Answer;
import com.ded.android.myjail.data.model.Question;
import com.ded.android.myjail.data.model.ReactionToAnswer;
import com.ded.android.myjail.ui.question.presetner.QuestingPresenter;
import com.ded.android.myjail.ui.question.presetner.QuestingPresenterImpl;
import com.google.android.material.button.MaterialButton;

import static com.ded.android.myjail.data.Examination.FIRST_QUESTION;
import static com.ded.android.myjail.data.Examination.MAX_QUESTION_ID;


public class QuestionFragment extends Fragment implements QuestionFragmentView {

  private QuestingPresenter questingPresenter;
  private TextView tvQuestion;
  private Question currentQuestion;
  private int wrapContent = LinearLayout.LayoutParams.WRAP_CONTENT;
  private LinearLayout llAnswers;
  private LinearLayout.LayoutParams lParams;
  private Button btnNewAnswer;
  private MainActivity mainActivity;

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
    mainActivity = (MainActivity)getActivity();

  }

  @Override
  public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);

    lParams = new LinearLayout.LayoutParams(
        wrapContent, wrapContent);

    llAnswers = view.findViewById(R.id.llAnswers);

    tvQuestion = view.findViewById(R.id.tvQuestion);


    if (questingPresenter.isFirstQuestion()) {
      currentQuestion = questingPresenter.loadNextQuestionByAnswerId(FIRST_QUESTION);

      showAnswers(currentQuestion);

    }

    tvQuestion.setText(currentQuestion.getQuestionText());


  }

  void showAnswers(Question currentQuestion) {

    for (int i = 0; i < currentQuestion.getAnswers().length; i++) {
      Answer answer = currentQuestion.getAnswers()[i];
      btnNewAnswer = new MaterialButton(requireContext());
      btnNewAnswer.setText(answer.getTextAnswer());
      btnNewAnswer.setId(i);

      llAnswers.addView(btnNewAnswer, lParams);

      btnNewAnswer.setOnClickListener(getOnClickDoSomething(i));
    }


  }

  View.OnClickListener getOnClickDoSomething(final int id) {
    return v -> {
      llAnswers.removeAllViews();
      int answerId = v.getId();

      if (currentQuestion.getId() < MAX_QUESTION_ID) {
        loadAndShowQuestion(answerId);
      }
      else if (currentQuestion.getId() >= MAX_QUESTION_ID) {
        mainActivity.showAd();

        Navigation.findNavController(requireView()).navigate(R.id.action_questionFragment_to_resultFragment);
      }

    };


  }

  void loadAndShowQuestion(int answerId) {
    currentQuestion = questingPresenter.loadNextQuestionByAnswerId(answerId);

    ReactionToAnswer reaction = currentQuestion.getReaction()[answerId];
    tvQuestion.setText(reaction.getReaction() + currentQuestion.getQuestionText());

    showAnswers(currentQuestion);


  }


}