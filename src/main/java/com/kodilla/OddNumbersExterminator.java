package com.kodilla;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {
    public List<Integer> exterminate(List<Integer>numbers){
        List<Integer> evens=new ArrayList<>();
        for (Integer element : numbers) {
            if (element%2==0){
                evens.add(element);
            }

        }
        return evens;
    }
}
