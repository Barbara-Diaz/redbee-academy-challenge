package com.redbee.academy.challenge;

public class CompareNumbers {

  /**
   * Method that receives two numbers and returns the
   * max of both
   *
   * @param a - Some Integer Number
   * @param b - Another Integer Number
   * @param c - Another Integer Number
   * @return The max of a, b and c
   */
   public static Integer max(Integer a, Integer b, Integer c) {
        Integer mayor=0;

        if (a>b && a>c){
           mayor= a;
        }
        if (c>b && c>b){
            mayor= c;
        }
        if (b>a && b>c){
            mayor= b;
        }

        return mayor;
    }
}
