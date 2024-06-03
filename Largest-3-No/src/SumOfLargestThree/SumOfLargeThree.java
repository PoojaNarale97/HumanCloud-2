package SumOfLargestThree;

public class SumOfLargeThree {

    public static void main(String[] args) {

        int arr[]=new int[]{1,2,3,4,5};


        int first=0;
        int second=0;
        int third=0;


        for(int num:arr)
        {
            if(num>first)
            {
                third=second;
                second=first;
                first=num;
            } else if (num>second)
            {
                third=second;
                second=num;
            } else if (num>third)
            {
                third=num;
            }
        }
        int sum=first+second+third;
        System.out.println("Largest Number is:"+sum);
    }



}
