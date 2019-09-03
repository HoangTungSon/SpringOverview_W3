package data;

import inputOutput.Output;

import java.util.HashMap;
import java.util.Map;

public class WordDataBase {
    private static Map<String, String> dic;

    static {
        dic = new HashMap<>();

        dic.put("hello", "Xin chào");
        dic.put("how", "Thế nào");
        dic.put("book", "Cuốn sách");
        dic.put("computer", "Máy tính");
    }

    public static String checkInput(Output output) {
        String result = dic.get(output.getWord());
        output.setWordInVn(result);
        return result;
    }
}
