import java.util.HashMap;
import java.util.Set;
public class HashMatiqueTest{
    public static void main(String[] args) {
        HashMap<String, String> songMap = new HashMap<String, String>();
        songMap.put("track1", "song 1");
        songMap.put("track2", "song 2");
        songMap.put("track3", "song 3");
        songMap.put("track4", "song 4");
        Set<String> keys = songMap.keySet();
        for(String key : keys) {
            System.out.println(String.format("%s:%s",key,songMap.get(key)));  
        }
    }
}