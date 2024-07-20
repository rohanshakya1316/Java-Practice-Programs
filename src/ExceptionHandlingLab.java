import java.io.*;

public class ExceptionHandlingLab {
    public static void main(String[] args) {
        BufferedReader reader = null;

        try {
            // Open the file
            reader = new BufferedReader(new FileReader("src/input.txt"));
            String line;

            // Read the file line by line
            while ((line = reader.readLine()) != null) {
                try {
                    // Try to parse the line to an integer
                    int number = Integer.parseInt(line);
                    System.out.println(number);
                } catch (NumberFormatException e) {
                    // Handle number format exception
                    System.out.println("Invalid number format on line: " + line);
                }
            }

        } catch (FileNotFoundException e) {
            // Handle file not found exception
            System.out.println("File not found: input.txt");
        } catch (IOException e) {
            // Handle IO exception
            System.out.println("Error reading file: input.txt");
        } finally {
            // Ensure the file is closed properly
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println("Error closing file: input.txt");
                }
            }
        }
    }
}
