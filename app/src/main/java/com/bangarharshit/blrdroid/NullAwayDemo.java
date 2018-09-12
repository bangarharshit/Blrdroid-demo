package com.bangarharshit.blrdroid;

import android.support.annotation.NonNull;

public class NullAwayDemo {

  public static void main(String[] args) {
    compute(null);
  }

  public static void compute(@NonNull String abc) {
    System.out.println(abc.length());
  }
}
