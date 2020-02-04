package me.dinosaur.codility_study.lesson3;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class TapeEquilbrium {

    public TapeEquilbrium(){

    }
    public int solution(int[] A) {
        List<Integer> list = new ArrayList<>();
        if (A.length >2 ){
            int sum = 0;
            int reverseSum =0;
            int resultSum =0;
            for (int eachValue : A){
                reverseSum += eachValue;
            }
            for (int i =0; i<(A.length)-1; i++){
                sum += A[i];
                reverseSum -= A[i];
                resultSum = Math.abs(sum - reverseSum);
                list.add(resultSum);
                resultSum=0;
            }

        } else {
            if (A.length == 2){
                list.add(Math.abs(A[0] - A[1]));
                list.add(Math.abs(A[1] - A[0]));
            }

        }
        Collections.sort(list);
        return list.get(0);
    }


}
