package me.dinosaur.codility_study.lesson4;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class FrogRiverOne {

    public FrogRiverOne(){
        int[] A = {2, 2, 2, 2, 2};
        System.out.println(solution(2, A));
    }

    public int solution(int X, int[] A) {
        int result = -1;
        int count =0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int each : A) {
            if (!map.containsKey(each)){
                map.put(each, count);
            }
            count ++;
        }
        for (int i =1; i<=X; i++){
            if (map.containsKey(i)){
                if (result < map.get(i)) result = map.get(i);
            } else {
                return -1;
            }
        }
        return result;
    }
}
