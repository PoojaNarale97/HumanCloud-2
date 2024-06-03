import java.util.stream.Stream;


public class ClimbStrairsStream {






        public static void main(String[] args) {
            int n = 5; // Example input
            System.out.println(climbStairs(n));
        }

        public static int climbStairs(int n) {
            return Stream.iterate(new int[]{1, 1}, fib -> new int[]{fib[1], fib[0] + fib[1]})
                    .limit(n)
                    .reduce((a, b) -> b)
                    .orElseThrow()[1];
        }
    }



