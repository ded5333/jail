package com.ded.android.myjail.ui.result.view;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.ded.android.myjail.MainActivity;
import com.ded.android.myjail.R;
import com.ded.android.myjail.data.model.Result;
import com.ded.android.myjail.ui.result.presenter.ResultPresenter;
import com.ded.android.myjail.ui.result.presenter.ResultPresenterImpl;

import java.util.Random;


public class ResultFragment extends Fragment implements ResultFragmentView {

  private ResultPresenter resultPresenter;
  private Result result;
  private TextView tvResult;
  private TextView tvResultDescription;
  private Button btnNewTest;
  private Button btnExit;
  private TextView tvNick;
  private MainActivity mainActivity;
  private Button btnNoCorrect;



  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
                           Bundle savedInstanceState) {
    // Inflate the layout for this fragment
    return inflater.inflate(R.layout.fragment_result, container, false);
  }

  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    resultPresenter = new ResultPresenterImpl(this,requireContext());
    mainActivity = (MainActivity) getActivity();



  }


  @SuppressLint("SetTextI18n")
  @Override
  public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);

    tvResult = view.findViewById(R.id.tvResult);
    tvResultDescription = view.findViewById(R.id.tvResultDescription);
    tvNick = view.findViewById(R.id.tvNickName);
    btnNewTest = view.findViewById(R.id.btnNewTest);
    btnExit = view.findViewById(R.id.btnExit);
    result = resultPresenter.getResult();
    btnNoCorrect = view.findViewById(R.id.btnNoCorrect);

    tvResult.setText(result.getResult());
    tvResultDescription.setText(result.getDescription());
    String randomStr = result.getNickname()[new Random().nextInt(result.getNickname().length)];
    tvNick.setText("Кличка " + "\"" + randomStr + "\"");
    Log.d("TAG", "onViewCreated: " + randomStr);
      mainActivity.loadInterstitialAd();

    btnNoCorrect.setOnClickListener(v ->{
    //  mainActivity.showAd();

      Navigation.findNavController(requireView()).navigate(R.id.action_resultFragment_to_helpAnswerFragment);

    });


    btnNewTest.setOnClickListener(v -> {

      Navigation.findNavController(requireView()).navigate(R.id.action_resultFragment_to_descriptionFragment);

    });

    btnExit.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        mainActivity.finishApp();
      }
    });

  }


}