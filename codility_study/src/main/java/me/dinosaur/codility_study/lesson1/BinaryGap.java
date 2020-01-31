package me.dinosaur.codility_study.lesson1;

import org.springframework.stereotype.Service;

@Service
public class BinaryGap {
    public BinaryGap() {
        System.out.println("result: " + solution(32));
    }

    public int solution(int N) {
        int count =0;
        int maxCount = 0;
        boolean isOpen = false;
        String a2 = Integer.toBinaryString(N);
        //System.out.println(a2);
        for (int i=0; i<a2.length(); i++) {
            if (a2.charAt(i) == '1'){
                isOpen = true;
                if (maxCount < count) maxCount = count;

                count = 0;
            } else {
                if (isOpen){
                    count++;
                }

            }


        }
        return maxCount;
    }
}
