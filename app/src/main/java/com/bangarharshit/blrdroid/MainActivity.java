package com.bangarharshit.blrdroid;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

  @Nullable private String s;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }

  @Override
  protected void onResume() {
    super.onResume();
  }

  @Override
  protected void onPause() {
    super.onPause();
    if (!isStringBlank(s)) {
      System.out.println(s.length());
    }
  }

  boolean isStringBlank(@Nullable String s) {
    if (s == null || s.isEmpty()) {
      return true;
    }
    return false;
  }
}
