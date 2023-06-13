package com.example.hammingweight_wi22b038;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HammingtonController {

    public static String lastMessage = "Test";

    @GetMapping("/api/hamming/pre")
    public static String returnPrevious(){
        return lastMessage;
    }


    @RequestMapping("/api/hamming")
    public static int hammingWeight(@RequestParam String input) {
        int weight = calculateHammingWeight(input);
        lastMessage = input;
        return weight;
    }

    private static int calculateHammingWeight(String input) {
        int weight = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != '0') {
                weight++;
            }
        }
        return weight;
    }

}
