package me.dinosaur.codility_study.lesson4;

import java.util.*;

public class MissingInteger {

    public MissingInteger(){

    }

    public int solution(int[] A) {
        int maximum =0;
        int result = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int a : A){
            map.put(a, a);
            if (maximum < a) maximum = a;
        }
        if (maximum == 0) return 1;
        if (maximum == 1) return 2;
        for (int i =1; i<maximum; i++){
            if (!map.containsKey(i)){
                result = i;
                break;
            }
        }
        if (result == 0){
            result = maximum+1;
        } else {
            if (result < 0) result =1;
        }
        return result;
    }
}
