import java.io.*;
import java.util.Scanner;

public class Main {
    private static void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } finally {
            is.close();
            os.close();
        }
    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter source file: ");
        String source= scanner.nextLine();

        System.out.println("Enter destination file: ");
        String dest= scanner.nextLine();

        File sourceFile= new File(source);
        File destFile= new File(dest);

        try {
            copyFileUsingStream(sourceFile,destFile);
            System.out.println("Copy completed!");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
