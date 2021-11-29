import java.util.TreeMap;

public class Main {
    public static final char SPACE= ' ';
    public static void main(String[] args) {
        String string= "Xin chao toi toi ten ten la Tuan Anh";

        TreeMap<String,Integer> treeMap= countWord(string);

        for (String key: treeMap.keySet()){
            System.out.println(key + " " + treeMap.get(key));
        }

    }


    public static TreeMap<String,Integer> countWord(String input){
        TreeMap<String,Integer> treeMap= new TreeMap<>();
        StringBuilder stringBuilder= new StringBuilder();

        for (int i=0; i< input.length();i++){
            if (input.charAt(i) != SPACE){
                stringBuilder.append(input.charAt(i));
            }else {
                addWord(treeMap, stringBuilder);
                stringBuilder= new StringBuilder();
            }
        }
        addWord(treeMap,stringBuilder);
        return treeMap;
    }

    public static void addWord(TreeMap<String,Integer> treeMap, StringBuilder stringBuilder){
        String string= stringBuilder.toString();

        if (string.length() == 0){
            return;
        }
        if (treeMap.containsKey(string)){
            int count= treeMap.get(string) + 1;
            treeMap.put(string,count);
        }else {
            treeMap.put(string,1);
        }
    }

}


