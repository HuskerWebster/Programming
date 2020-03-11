package com.company;

import java.util.Arrays;

public class Sort {


    int[] numbers;

    public Sort(int[] numbers) {
        this.numbers = numbers;
    }

    public void bubbleSort()
    {
        int temp;
        boolean swapActive = true;
        while(swapActive == true){

            swapActive = false;
            for (int i = 0; i< numbers.length-1; i++)
            {
                if (numbers [i] > numbers[i + 1]){
                    temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                    swapActive = true;

                }
            }
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(numbers);
    }

}
