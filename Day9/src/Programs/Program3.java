package Programs;

import java.io.*;

public class Program3 {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Enter only <sourceFilePath> and <destinationFilePath>");
            return;
        }

        String sourceFilePath = args[0];
        String destinationFilePath = args[1];

        try {
            File sourceFile = new File(sourceFilePath);
            File destinationFile = new File(destinationFilePath);

            if (!sourceFile.exists()) {
                System.out.println("Source file does not exist.");
                return;
            }

            if (destinationFile.exists()) {
                System.out.print("File already exists. Do you want to overwrite? (Yes/No): ");
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                String userInput = reader.readLine().trim().toLowerCase();

                if (!userInput.equals("yes")) {
                    System.out.println("File copy operation canceled.");
                    return;
                }
            } else {
                destinationFile.createNewFile();
            }

            copyFileContents(sourceFile, destinationFile);
            System.out.println("File copied successfully!");
        } catch (FileNotFoundException e) {
            System.out.println("Source file not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error during file copy: " + e.getMessage());
        }
    }

    private static void copyFileContents(File sourceFile, File destinationFile) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
        }
    }
}
