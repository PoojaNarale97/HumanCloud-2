package SumOfLargestThree;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

public class MapLargestNo {
    public static void main(String[] args) {

        int arr[]={5,7,5,1,2,8};


        Map<Integer,Integer> countMap=new HashMap<>();


        for(int num:arr)
        {
            if(countMap.containsKey(num))
            {
                countMap.put(num,countMap.get(num)+1);
                System.out.println("Check");
            }
            else
            {
                countMap.put(num,1);
            }
        }




        int first=0;
       int second=0;
       int third=0;

       for(Map.Entry<Integer,Integer> entry:countMap.entrySet())
       {
          int num=entry.getKey();
          if(num>first)
          {
              third=second;
              second=first;
              first=num;
          }
          else if(num>second)
          {
              third=second;
              second=num;
          } else if (num>third) {
              third=num;

          }
       }

       int sum=first+second+third;
        System.out.println(sum);


    }



}
