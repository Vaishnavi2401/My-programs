import java.util.Map;
import java.util.HashMap;

class Main {
    public static void main(String[] args) {
        String line = "this is text";
        Map<Character, Integer> m = new HashMap<>();
        for(char c: line.toCharArray()){
            if(c != ' '){
                m.put(c, m.getOrDefault(c,0)+1);
            }
        
        }
        for(Map.Entry<Character, Integer> entry: m.entrySet()){
            
            System.out.println(entry.getKey()+" "+entry.getValue());
            
        }
    }
}