import java.io.*;
public class FileReaderDemo {
    public static void main(String[] args) {
        // try {
        //     FileReader reader = new FileReader("input.txt");
        //     BufferedReader buffer = new BufferedReader(reader);
        //     String line = buffer.readLine();
        //     if (line != null) {
        //         System.out.println(line);
        //     } 
        //     else{
        //         System.out.println("No content to display. ");
        //     }
        //     buffer.close();
        //     reader.close();
        // } catch (Exception e) {
        //     System.out.println(e);
        // }
        try {
            FileWriter writer = new FileWriter("input.txt");
            writer.write("Hello I am learning Java.\n");
            writer.write("My name is Rohan Shakya.");
            System.out.println("File written successfully");
            writer.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
}
