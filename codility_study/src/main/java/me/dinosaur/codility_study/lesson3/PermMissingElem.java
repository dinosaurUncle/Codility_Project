package me.dinosaur.codility_study.lesson3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PermMissingElem {

    public PermMissingElem(){

    }


    public int solution(int[] A) {
        if (A.length == 1){
            if (A[0] == 1) return 2;
            else return 1;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=1; i<=A.length; i++){
            map.put(i,i);
        }
        for (int i=0; i<A.length; i++){
            map.remove(A[i]);
        }
        List<Integer> list = new ArrayList(map.keySet());
        if (list.size() == 0) {
            return A.length+1;
        } else {
            return list.get(0);
        }

    }
}
