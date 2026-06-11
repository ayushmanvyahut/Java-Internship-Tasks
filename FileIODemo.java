import java.io.*;

public class FileIODemo {
    public static void main(String[] args) {

        try {
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));

            String line;

            while ((line = reader.readLine()) != null) {
                writer.write(line.toUpperCase());
                writer.newLine();
            }

            reader.close();
            writer.close();

            System.out.println("File copied successfully with uppercase conversion.");

        } catch (FileNotFoundException e) {
            System.out.println("Error: Input file not found.");

        } catch (IOException e) {
            System.out.println("Error: Problem while reading or writing the file.");
        }
    }
}