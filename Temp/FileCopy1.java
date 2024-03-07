import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyingFiles {

    public static void main(String[] args) {
        Thread fileCopy1Thread = new Thread(new FileCopy1());
        Thread fileCopy2Thread = new Thread(new FileCopy2());

        fileCopy1Thread.start();
        fileCopy2Thread.start();

        try {
            fileCopy1Thread.join();
            fileCopy2Thread.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted while waiting for threads to finish.");
            e.printStackTrace();
        }

        System.out.println("File copying completed (without ExecutorService).");
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
