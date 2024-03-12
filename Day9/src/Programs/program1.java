package Programs;

import java.io.File;

public class program1 {

    public static void main(String[] args) {
        String folderPath = "C:\\Users\\*****\\eclipse-workspace\\Day9";

        System.out.println("Folder contents:");
        printFolders(folderPath);
    }

    public static void printFolders(String directoryPath) {
        File folder = new File(directoryPath);
        if (folder.isDirectory()) {
            File[] subFolders = folder.listFiles();
            if (subFolders != null) {
                for (File subFolder : subFolders) {
                    if (subFolder.isDirectory()) {
                        System.out.println(subFolder.getAbsolutePath());
                        printFolders(subFolder.getAbsolutePath()); // Recursively call for sub-folders
                    }
                }
            }
        }
    }
}
