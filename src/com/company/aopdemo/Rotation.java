package com.company.aopdemo;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Rotation {

    public Set<String> rotate(List<String> words) {
        Set<String> rotated = new HashSet<>();
        for(String word:words) {
            int count = 0;
            String letters = word.substring(1, word.length()-1);
            while(count <= letters.length()/2) {
                String rotated_word = letters.substring(2) + letters.substring(0, 2);
                letters = rotated_word;
                rotated.add(rotated_word);
                count++;
            }
        }
        return rotated;
    }
}
