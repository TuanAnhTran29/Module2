import com.codegym.FileUtil;

import java.io.File;
import java.util.Scanner;

public class FIleCalculatorAdapter implements FileCalculator {
    @Override
    public long calculateSize(String path) {
        FileUtil fileUtil= new FileUtil();
        File file= new File(path);
        return fileUtil.calculateSize(file);
    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter file or folder path:");
        String path= scanner.nextLine();
//        FileCalculator fileCalculator= new FIleCalculatorAdapter();
//        Client client= new Client(fileCalculator);
//        client.printFileSize(path);

        Client client= new Client(new FIleCalculatorAdapter());
        client.printFileSize(path);

    }
}
