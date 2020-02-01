package me.dinosaur.codility_study.lesson2;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class OddOccurrencesInArray {

    public OddOccurrencesInArray() {
        int [] A = {2, 2, 3, 3, 4};
        System.out.println(solution(A));
    }

    public int solution(int[] A) {
        int result = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        if (A.length == 1 || A.length == 2) return A[0];
        else {
            for (int i =0; i<A.length; i++){
                if (i == 0){
                    map.put(A[i], i);
                } else {
                    if (!map.containsKey(A[i])) {
                        map.put(A[i], i);
                    } else {
                        map.remove(A[i]);
                    }
                }
            }
            Iterator<Integer> iterator = map.keySet().iterator();
            while (iterator.hasNext()){
                result = iterator.next();
            }
        }
        return result;
    }


}
