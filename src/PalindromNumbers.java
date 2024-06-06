import java.util.ArrayList;

public class PalindromNumbers {
    public static void main(String[] args) {


        int[] numbers={123,123,1221,12321,12345};

        ArrayList<Integer> palindromeNumbers=new ArrayList<>();


        for(int number:numbers)
        {
            if(isPalindrom(number))
            {
                palindromeNumbers.add(number);
            }
        }

        System.out.println("Palindrom Numbers in the Array are:"+palindromeNumbers);

    }

    public static boolean isPalindrom(int number)
    {
        int originalNumber=number;
        int reverse=0;//reverse*10+digit;

        while(number!=0)
        {
            int digit=number%10;
            reverse=reverse*10+digit;
            number/=10;
        }
        return  originalNumber==reverse;
    }


}
