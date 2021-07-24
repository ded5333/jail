package com.ded.android.myapplicationjail.ui.result.presenter;

import android.content.Context;

import com.ded.android.myapplicationjail.data.Examination;
import com.ded.android.myapplicationjail.data.model.Result;
import com.ded.android.myapplicationjail.ui.result.view.ResultFragmentView;

public class ResultPresenterImpl implements ResultPresenter {

  ResultFragmentView resultFragmentView;
  Context context;

  public ResultPresenterImpl(ResultFragmentView resultFragmentView,Context context) {
    this.resultFragmentView = resultFragmentView;
    this.context = context;
  }

  @Override
  public Result getResult() {

    return Examination.getInstance(context).loadResult();

  }
}
