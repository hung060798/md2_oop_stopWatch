package com.company;
import java.util.Random;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
	// write your code here
        StopWatch watch = new StopWatch();
        Random random = new Random();
        watch.start();
        int[] array = new int[100000];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100000);
        }
        sort(array);
        watch.stop();
        System.out.println(Arrays.toString(array));
        System.out.println(watch.getElapsedTime() + " milisec");
    }

    public static void sort(int[] arr) {
        int size = arr.length;
        for (int step = 0; step < size - 1; step++) {
            int min = step;
            for (int i = step + 1; i < size; i++) {
                if (arr[i] < arr[min]) {
                    min = i;
                }
            }
            int temp = arr[step];
            arr[step] = arr[min];
            arr[min] = temp;
        }
    }
}
