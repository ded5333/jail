package com.ded.android.myjail.ui.no_correct_answer.view;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.ded.android.myjail.MainActivity;
import com.ded.android.myjail.R;


public class HelpAnswerFragment extends Fragment {

  private Button btnNewTest;
  private Button btnExit;
  private MainActivity mainActivity;
  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

  mainActivity = (MainActivity) getActivity();

  }

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
                           Bundle savedInstanceState) {
    // Inflate the layout for this fragment
    return inflater.inflate(R.layout.fragment_help_answer, container, false);
  }

  @Override
  public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    btnNewTest = view.findViewById(R.id.btnNewTestHelp);
    btnExit = view.findViewById(R.id.btnExitHelp);
    mainActivity.showAd();

    btnNewTest.setOnClickListener(v -> {

      Navigation.findNavController(requireView()).navigate(R.id.action_helpAnswerFragment_to_descriptionFragment);

    });

    btnExit.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        mainActivity.finishApp();
      }
    });


  }
}