import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class JavaStream {

    public static void main(String[] args) {


        List<Integer> nums= Arrays.asList(4,5,7,8,9);

        /*
        data.sorted();



        data.forEach(n-> System.out.println(n));*/

        Stream<Integer> data=nums.stream();

        Stream<Integer> mappeddata=data.map(n-> n*2);
        mappeddata.forEach(n-> System.out.println(n));


        nums.stream()
                .map(n->n*2)
                .forEach(n-> System.out.println(n));


        nums.stream().filter(n->n%2==1).sorted().map(n->n*2).forEach(System.out::println);
        System.out.println("************************");
        Predicate<Integer> predi=n -> n%2==1;

        int result=nums.parallelStream()
                .filter(predi)
                //.sorted()
                .map(n -> n*2)
                .reduce(0,(c,e)->c+e);
        System.out.println(result);





    }



}
