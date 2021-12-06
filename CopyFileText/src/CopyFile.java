import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {

    public List<Integer> readFile(String filePath) {
        List<Integer> numbers = new ArrayList<>();

        try {
            File file= new File(filePath);
            if (!file.exists()){
                throw new FileNotFoundException();
            }

            DataInputStream dataInputStream= new DataInputStream(new FileInputStream(file));

            String line= "";

            while ((line= dataInputStream.readLine()) != null){
                numbers.add(Integer.parseInt(line));
            }

            dataInputStream.close();

        }catch (Exception e){
            e.printStackTrace();
        }

        return numbers;
    }

    public void writeFile(String filePath, List<Integer> number){
        try {
            File file= new File(filePath);
            DataOutputStream dataOutputStream= new DataOutputStream(new FileOutputStream(file));
            for (int i = 0; i < number.size() ; i++) {
                dataOutputStream.write(number.get(i));
            }
            dataOutputStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public void readFileOutput(String filePath){
        try {
            File file= new File(filePath);
            DataInputStream dataInputStream= new DataInputStream(new FileInputStream(file));
            while (true){
                System.out.println(dataInputStream.readInt());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
