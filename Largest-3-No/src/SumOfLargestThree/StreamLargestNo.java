package SumOfLargestThree;

import java.util.Arrays;

public class StreamLargestNo {
    public static void main(String[] args) {
        int arr[] = new int[]{5, 1, 9, 6, 7};

        int sum = Arrays.stream(arr)//its corresponding primitive int value to integer object
                .boxed()//
                .sorted((a, b) -> b - a)//sorted in descending order
                .limit(3)
                .mapToInt(Integer::intValue)//each Integer object is mapped to its corresponding primitive int value
                .sum();
        System.out.println(sum);
    }
}
