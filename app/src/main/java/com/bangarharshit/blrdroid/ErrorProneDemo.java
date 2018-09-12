package com.bangarharshit.blrdroid;

import io.reactivex.Observable;
import io.reactivex.functions.Consumer;

public class ErrorProneDemo {

  // @SuppressWarnings("CheckReturnValue")
  public static void main(String[] args) throws IllegalAccessException, InstantiationException {
    Observable.just(1)
        .subscribe(
            new Consumer<Integer>() {
              @Override
              public void accept(Integer integer) {
                System.out.println(integer);
              }
            });
    //
    // Set<Short> s = new HashSet<>();
    // for (short i = 0; i < 100; i++) {
    //  s.add(i);
    //  s.remove(i - 1);
    // }
    // System.out.println(s.size());

    ErrorProneDemo errorProneDemo = ErrorProneDemo.class.newInstance();
  }

  @SuppressWarnings("InfiniteRecursion")
  class Test {
    void f() {
      f();
    }
  }
}
