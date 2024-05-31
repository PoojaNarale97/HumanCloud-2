

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
import java.util.HashMap;
import java.util.Map;
import  java.util.Scanner;
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter String:");
        String str=sc.nextLine();

        System.out.println("String is:"+str);

        char c=mostFrequentCharacter(str);
        System.out.println("Most frequent char is:"+c);
    }

    public static char mostFrequentCharacter(String s)
    {
        Map<Character,Integer> mp=new HashMap<>();

        for(char c:s.toCharArray())
        {
            mp.put(c,mp.getOrDefault(c,0)+1);
        }

        int maxFrequency=0;
        char mostFrequencyChar=' ';

        for(Map.Entry<Character,Integer> entry:mp.entrySet())
        {
            if(entry.getValue()>maxFrequency)
            {
                maxFrequency=entry.getValue();
                mostFrequencyChar = entry.getKey();
            }
        }
        return mostFrequencyChar;
    }
}