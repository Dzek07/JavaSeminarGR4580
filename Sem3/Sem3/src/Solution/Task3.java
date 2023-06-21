package Solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task3 {
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
   
    public static void minMaxAverage(ArrayList<Integer> array){
        
        Collections.sort(array);
        

        int min = array.get(0);
        int max = array.get(array.size() - 1);
        int average = 0;
        int matAverage = min + max / 2;
        int differAverage = Math.abs(array.get(0) - matAverage);
        for (int i = 1; i < array.size(); ++i){
            if (differAverage > Math.abs(array.get(i) - matAverage)){
                differAverage = Math.abs(array.get(i) - matAverage);
                average = array.get(i);
            }
        }

        System.out.println(min + " Минимальный");
        System.out.println(max + " Максимальный");
        System.out.println(average + " Средний");



            
            

    }
    
}   
