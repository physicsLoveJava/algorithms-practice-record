package types.divide;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayDeque;
import java.util.Queue;

/**
 * level display directory
 */
public class LevelDisplayDirectory {

    public static void display(String path) throws FileNotFoundException {
        Queue<String> queue = new ArrayDeque<String>();
        File file = new File(path);
        if(!file.exists()) {
            throw new FileNotFoundException();
        }
        addToQueue(file, queue);
        while(!queue.isEmpty()) {
            String top = queue.poll();
            File topFile = new File(top);
            if(topFile.isFile()) {
                print(topFile.getAbsolutePath());
            }else if(topFile.isDirectory()) {
                addToQueue(topFile, queue);
            }
        }
    }

    private static void print(String top) {
        System.out.println(top);
    }

    private static void addToQueue(File file, Queue<String> queue) {
        if(file.isFile()) {
            queue.add(file.getAbsolutePath());
        }else if(file.isDirectory()) {
            File[] files = file.listFiles();
            for (File subFile : files) {
                queue.add(subFile.getAbsolutePath());
            }
        }
    }

}
