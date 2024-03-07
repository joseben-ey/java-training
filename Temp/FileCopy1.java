package program1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CopyingFiles {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        executor.execute(new FileCopy1());
        executor.execute(new FileCopy2());

        executor.shutdown();
    }
}

class FileCopy1 implements Runnable {
    @Override
    public void run() {
        try (FileInputStream in = new FileInputStream("image1.bmp");
             FileOutputStream out = new FileOutputStream("temp.bmp")) {
            int b;
            while ((b = in.read()) != -1) {
                out.write(b);
            }
            System.out.println("FileCopy1: Copying complete.");
        } catch (IOException e) {
            System.out.println("FileCopy1: Error copying file.");
            e.printStackTrace();
        }
    }
}

class FileCopy2 implements Runnable {
    @Override
    public void run() {
        try (FileInputStream in = new FileInputStream("temp.bmp");
             FileOutputStream out = new FileOutputStream("image2.bmp")) {
            int b;
            while ((b = in.read()) != -1) {
                out.write(b);
            }
            System.out.println("FileCopy2: Copying complete.");
        } catch (IOException e) {
            System.out.println("FileCopy2: Error copying file.");
            e.printStackTrace();
        }
    }
}