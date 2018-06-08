package HashMap;

import java.util.HashMap;

public class HashMapProgram {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<Integer, String>();
        map.put(1,"Ankit");
        map.put(2,"Nishant");
        map.put(3,"Gaurav");
        System.out.println(map.entrySet());
        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue("Ankit"));
//        System.out.println(map.remove(1));
        System.out.println(map.size());

    }
}
