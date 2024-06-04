import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {

        int arr[]=new int[]{2,7,11,15};
        int target=9;
        int res[]= twoSumHashing(arr,target);

        System.out.println("Index is:");
        for(int i=0;i<res.length;i++)
        {
            System.out.println(res[i]);
        }
    }
    public static int[] twoSumHashing(int[] arr,int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(arr[i], i);

        }

        return  new int[]{};
    }
}
