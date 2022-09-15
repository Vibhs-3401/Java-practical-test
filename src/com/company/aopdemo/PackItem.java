package com.company.aopdemo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class PackItem {

    public String packingItem(int n) {
        if (n <= 0) {
            return "Please enter valid number";
        } else if (n == 1) {
            return "[B1]";
        } else if (n == 2) {
            return "[B1B1], [B2]";
        } else {
            String result = "";
            String bOne = "B1";
            String bTwo = "B2";
            String openBraces = "[";
            String closeBraces = "] ";

            MultiplyString multiplyString = new MultiplyString();


            for (int i = 0; n - i >= 0; i += 2) {
                result += openBraces;

//                result += String.join("", Collections.nCopies((n - i), bOne));
//                result += String.join("", Collections.nCopies(i / 2, bTwo));

                result += multiplyString.multiples((n-i), bOne);
                result += multiplyString.multiples(i/2, bTwo);

                result += closeBraces;
            }

            List<String> arr = Arrays.asList(result.split(" "));

            Rotation rotation = new Rotation();
            Set<String> rotated_list = rotation.rotate(arr);

            for(String ele:rotated_list) {
                if(!result.contains(ele)) {
                    result += openBraces + ele + closeBraces;
                }
            }
            return result;
        }
    }
}
