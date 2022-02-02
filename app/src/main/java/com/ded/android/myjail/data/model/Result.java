package com.ded.android.myjail.data.model;

public class Result {
  private String result;
  private String description;
  private String[] nickname;

  public Result(String result, String description, String... nickname) {
    this.result = result;
    this.description = description;
    this.nickname = nickname;
  }

  public String getResult() {
    return result;
  }

  public String getDescription() {
    return description;
  }

  public String[] getNickname() {
    return nickname;
  }

  public Result setNickname(String[] nickname) {
    this.nickname = nickname;
    return this;
  }
}
