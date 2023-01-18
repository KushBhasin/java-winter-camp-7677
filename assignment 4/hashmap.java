import java.util.*;

public class hashmap{
    public static void main(String[] args) {
        HashMap<Integer,String> map= new HashMap<Integer,String>();
        map.put(1, "Kush");
        map.put(2,"MAyank");
        map.put(3,"Jatin"); 
        map.put(4,"Jitendra");
        
        System.out.println(map);
        System.out.println("Iterating Hashmap...");  
        for(Map.Entry m : map.entrySet()){    
         System.out.println(m.getKey()+" "+m.getValue());
    }
}
    
}
