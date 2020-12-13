package lab23.ex1;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("Robinson", "Oliver");
        dictionary.put("Brown", "Jack");
        dictionary.put("Graves", "Mark");
        dictionary.put("Brealey", "Amanda");
        dictionary.put("Gatiss", "Mark");
        dictionary.put("Adams", "Mark");
        dictionary.put("Potter", "Thomas");
        dictionary.put("Stubbs", "Jack");
        dictionary.put("Barker", "Amanda");

        Map<String, String> dic = new HashMap<>();
        for (String key : dictionary.keySet()) {
            String value = dictionary.get(key);
            if (!dic.containsValue(value))
                dic.put(key, value);
        }
        System.out.println(dic);
    }
}
