import java.util.HashMap;
import java.util.Map;

public class MostFrequentWord {

    public static String mostFrequentWord(String str)
    {
        String[] words=str.split("\\s");

        Map<String,Integer> wordCounts=new HashMap<>();

        for(String word:words)
        {
            wordCounts.put(word,wordCounts.getOrDefault(word,0)+1);
        }

        String mostFrequentWord=null;
        int maxCount=0;

        for(Map.Entry<String,Integer> entry:wordCounts.entrySet())
        {
            if(entry.getValue()>maxCount)
            {
                mostFrequentWord=entry.getKey();
                maxCount=entry.getValue();
            }
        }
        return mostFrequentWord;
    }






    public static void main(String[] args) {

        String input="This is a String with some words.This String contain my repeated words and unique words";
        String mostFrequent=mostFrequentWord(input);
        System.out.println("The most Frequent Word:"+mostFrequent);


    }



}
