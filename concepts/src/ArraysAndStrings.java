import java.util.ArrayList;
import java.util.HashMap;

public class ArraysAndStrings {

    public HashMap<Integer,Object> buildMap(Object [] students){
        HashMap<Integer,Object> map=new HashMap<Integer, Object>();
        int i=0;
        for(Object student:students){
            map.put(i,student);
            i++;
        }
        return map;
    }

    //ArrayList (or a dynamically resizing array) is an array that resizes itself as needed while still providing O(1) access
    public ArrayList<String> merge(String [] words, String [] more){
        ArrayList<String> sentence=new ArrayList<String>();
        for(String s: words) sentence.add(s);
        for(String s: more) sentence.add(s);
        return sentence;
    }
}
