package com.ded.android.myapplicationjail.ui.result.presenter;

import com.ded.android.myapplicationjail.data.Examination;
import com.ded.android.myapplicationjail.data.model.Result;
import com.ded.android.myapplicationjail.ui.result.view.ResultFragmentView;

public class ResultPresenterImpl implements ResultPresenter {

  ResultFragmentView resultFragmentView;

  public ResultPresenterImpl(ResultFragmentView resultFragmentView) {
    this.resultFragmentView = resultFragmentView;
  }

  @Override
  public Result getResult() {

    return Examination.getInstance().loadResult();

  }
}
