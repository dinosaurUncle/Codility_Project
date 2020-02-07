package me.dinosaur.codility_study.lesson4;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class PermCheck {

    public PermCheck(){

    }

    public int solution(int[] A) {
        boolean result = true;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i =0; i < A.length; i++) {
            map.put(A[i], i);
        }

        for (int j=1; j <= A.length; j++){
            if (map.containsKey(j)){

            } else result = false;
        }
        if (result) {
            return 1;
        } else return 0;
    }

}
