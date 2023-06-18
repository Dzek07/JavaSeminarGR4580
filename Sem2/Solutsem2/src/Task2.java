import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Arrays;
import java.io.IOException;
import java.util.logging.Logger;

public class Task2 {
    private static Logger logger = Logger.getLogger(Task2.class.getName());
    /**
     * @param args
     */
    public static void main(String[] args) {
    
    int[] anArray = new int[] {3, 1, 7, 2, 0, 9, 7, 6, 8, 3};


    String filePath = "log.txt";
    logger.info("Изменения в массиве " + Arrays.toString(anArray) + "\n");
    try (FileWriter writer = new FileWriter(filePath, true)) {
        BufferedWriter bufferWriter = new BufferedWriter(writer);
        bufferWriter.write(Arrays.toString(anArray) + "\n");
        bufferWriter.close();
    } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    for (int i = 0; i < anArray.length - 1; i++) {
        for(int j = 0; j < anArray.length - i - 1; j++) {
            if(anArray[j + 1] < anArray[j]) {
                int swap = anArray[j];
                anArray[j] = anArray[j + 1];
                anArray[j + 1] = swap;
                
                logger.info("Изменения в массиве " + Arrays.toString(anArray) + "\n");
                try (FileWriter writer = new FileWriter(filePath, true)) {
                    BufferedWriter bufferWriter = new BufferedWriter(writer);
                    bufferWriter.write(Arrays.toString(anArray) + "\n");
                    bufferWriter.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }


        }
    }
}
    System.out.println(Arrays.toString(anArray));   
    }
}