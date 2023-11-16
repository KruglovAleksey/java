package phoneBook;

import java.util.*;
import java.util.Map.Entry;



public class Tell {
    private Map<String, ArrayList<String>> phoneBook = new HashMap<>();

    public void add(String name, String number){
        phoneBook.putIfAbsent(name, new ArrayList<String>());
        phoneBook.get(name).add(number);
    }

    public HashMap<String, ArrayList<String>> find(String name){
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for(String key : phoneBook.keySet()){
            if(key == name){
                map.put(key, phoneBook.get(name));
            }
        }
        return map;
    }

    public boolean dell(String name){
        for(String key : phoneBook.keySet()){
            if(key == name){
                phoneBook.remove(name);
                return true;
            }
        }
        return false;
    }

    public void edit(String name, String numberOld, String numberNew ){
        for(String key : phoneBook.keySet()){
            if(key == name){
                phoneBook.get(key).remove(numberOld);
                phoneBook.get(key).add(numberNew);
            }
        }
    }

    public void print(){
        for(ArrayList<String> l : phoneBook.values()){
            Set<String> hs = new HashSet<>();
            hs.addAll(l);
            l.clear();
            l.addAll(hs);
        }
        List<ArrayList<String>> l = new ArrayList<>(phoneBook.values());
        Collections.sort(l, new Comparator<ArrayList<String>>(){
            public int compare(ArrayList<String> s1, ArrayList<String> s2){
                return Integer.compare(s2.size(), s1.size());                
            }});
        for(ArrayList<String> a : l){
            Iterator<Entry<String, ArrayList<String>>> iter = phoneBook.entrySet().iterator();
            while (iter.hasNext()){
                Entry<String, ArrayList<String>> e = iter.next();
                if(e.getValue().equals(a)){
                    System.out.println(e.getKey() + "-" + a);
                    iter.remove();
                }
            }
        }
    }  
}          