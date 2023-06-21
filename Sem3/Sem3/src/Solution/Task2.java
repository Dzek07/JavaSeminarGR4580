package Solution;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task2 {
    static Random random = new Random();
    public static List<Integer> generateRandomIntegers(int count){
        return Stream.generate(random::nextInt).limit(count).collect(Collectors.toList());
    }
    public static void execute() {
        List<Integer> integers = generateRandomIntegers(10);
        System.out.println(integers);
        integers.sort(Integer::compareTo);
        System.out.println(integers);
    }


    public static void filler(ArrayList<Integer> array){
        
        Random rnd = new Random();
        for (int i = 0; i < 10; ++i){
            array.add(rnd.nextInt(100));
        }
        System.out.println(array);
        
    }
   
    public static void poisk(ArrayList<Integer> array, ArrayList<Integer> arrayIndex){
        
        for (int i = 0; i < array.size(); ++i){
            if (array.get(i) % 2 == 0){
                arrayIndex.add(i);
            }
        }
    }
    public static void delIn(ArrayList<Integer> array, ArrayList<Integer> arrayIndex){
        for (int i = arrayIndex.size() - 1; i >= 0; --i){
            int tmp = arrayIndex.get(i);
            array.remove(tmp);
        }
        System.out.println(array);
        
    }
}   
