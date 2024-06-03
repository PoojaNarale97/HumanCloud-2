
import java.util.HashMap;



public class ClimeStairsHashMap {


    public static void main(String[] args) {
        int n = 5; // Example input

        HashMap<Integer, Integer> memo=new HashMap<>();
        System.out.println(climbStairs(n,memo));

    }

    private static int climbStairs(int n, HashMap<Integer, Integer> memo) {
        int result=0;

        memo.put(1, 1); // There is 1 way to stay at the ground (doing nothing)
        memo.put(2, 1); // There is 1 way to reach the first step (one step)

        if (n <= 1) {
            return 1;
        }
        else
        {
            for (int i = 3; i <= n; i++) {
                result = memo.get(i - 1) + memo.get(i - 2);
                memo.put(i, result);
            }
        }
        return result;
    }




}
