package com.ded.android.myjail.ui.result.presenter;

import android.content.Context;

import com.ded.android.myjail.data.Examination;
import com.ded.android.myjail.data.model.Result;
import com.ded.android.myjail.ui.result.view.ResultFragmentView;

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
