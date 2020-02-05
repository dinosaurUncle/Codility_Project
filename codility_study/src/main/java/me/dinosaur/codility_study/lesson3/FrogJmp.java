package me.dinosaur.codility_study.lesson3;

import org.springframework.stereotype.Service;

@Service
public class FrogJmp {

    public FrogJmp () {
        System.out.println("FrogJmp: " + solution(10, 85, 30));
    }

    public int solution(int X, int Y, int D) {
        if (X == Y) return 0;
        else return (int) Math.ceil((((double)Y-X)/(D)));

    }
}
