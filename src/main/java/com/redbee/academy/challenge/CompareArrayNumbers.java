package com.redbee.academy.challenge;

import java.util.List;

public class CompareArrayNumbers {

  /**
   * Method that receives two lists and returns
   * another list with de max of each index
   *
   * @param a - Some Integer Number
   * @param b - Another Integer Number
   * @return The result of a + b
   */
    public static List<Integer> max(List<Integer> a, List<Integer> b) {
        List<Integer> max=new ArrayList<>();
       Integer maxList1=a.get(0);
       Integer maxList2=b.get(0);
        for (int i=0;i<a.size();i++) {
            if ( a.get(i)>maxList1) {
                maxList1=a.get(i);
            }

        }
        for (int i=1;i<b.size();i++){
            if (b.get(i)>maxList2){
                maxList2=b.get(i);
            }
        }
        max.add(maxList1);
        max.add(maxList2);

        return max;
    }



}
