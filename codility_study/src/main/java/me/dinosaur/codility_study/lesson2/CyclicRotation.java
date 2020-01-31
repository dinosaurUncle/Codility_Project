package me.dinosaur.codility_study.lesson2;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CyclicRotation {
    public CyclicRotation(){
        int [] A = {3, 8, 9, 7, 6};
        int [] B = solution(A, 0);
        for (int aa : B){
            System.out.println("aa: " + aa);
        }
    }
    public int [] solution(int[] A, int K) {
        int result[] = new int[A.length];
        int firstNum =0;
        List<Integer> list = new ArrayList<Integer>();
        if (A.length == 0) return result;
        else if (A.length == 1) {
            return A;
        }else if (K == 0){
            return A;
        }
        for (int i = 0; i<K; i++){
            if (i == 0){
                firstNum = A[A.length-1];
                list.add(firstNum);
                for (int each : A){
                    list.add(each);
                }
                list.remove(list.size()-1);
            } else {
                firstNum = list.get(list.size() -1);
                list.add(0, firstNum);
                list.remove(list.size()-1);
            }
        }

        for (int j =0; j <list.size(); j++){
            result[j] = list.get(j);
        }
        return result;
    }

}
