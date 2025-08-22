
import java.io.*;

class FileReadWrite {

    public static void main(String args[]) {

        try {
            FileWriter writer = new FileWriter("example.txt");

            writer.write("Writing into the sample.txt file\n");
            writer.write("Again writin in th same file\n");
            System.out.println("Written the data successfully in file");
            writer.close();

            FileReader read = new FileReader("example.txt");
            BufferedReader bf = new BufferedReader(read);
            String line;
            System.out.println("Reading the Data");

            while ((line = bf.readLine()) != null) {
                System.out.println(line);
            }
            bf.close();
            read.close();

        } catch (Exception e) {
            System.out.println("Error while Writing the file");

        }
    }

}
