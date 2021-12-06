import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CopyFile copyFile= new CopyFile();
        List<Integer> numbers= copyFile.readFile("numbers.txt");
        copyFile.writeFile("result.txt", numbers);
        copyFile.readFileOutput("result.txt");


    }
}
