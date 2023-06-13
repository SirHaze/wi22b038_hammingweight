package com.example.hammingweight_wi22b038;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.*;

class HammingtonControllerTest {
    @Test
    public void testHammingWeight01() {
        //Assert
        String input = "1101001";
        int expectedWeight = 4;

        //Act
        int actualWeight = HammingtonController.hammingWeight(input);

        //Assess
        assertEquals(expectedWeight, actualWeight);
    }

    @Test
    public void testHammingWeight02() {
        //Assert
        String input = "QWER0123";
        int expectedWeight = 7;

        //Act
        int actualWeight = HammingtonController.hammingWeight(input);

        //Assess
        assertEquals(expectedWeight, actualWeight);
    }


}