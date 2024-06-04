//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int arr[]=new int[]{2,7,11,15};
        int target=9;

        int resu[]=twoSumBruteForce(arr,target);

        for(int i=0;i<resu.length;i++)
        {
            System.out.println(resu[i]);
        }
    }

    public static int[] twoSumBruteForce(int[] arr,int target)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==target)
                {
                    return new int[]{i,j};
                }
            }
        }

        return new int[]{};
        //return new IllegalArgumentException("No Two sum Solution");
    }
}