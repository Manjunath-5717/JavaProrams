import java.util.HashMap;
public class HashSetExample {
	public static void main(String[] args) {
	HashMap<Integer,String> hm=new HashMap<>();
	
	
	hm.put(101,"abhi");
	hm.put(102, "vikas");
	hm.put(103, "akashay");
	hm.put(104, "vinay");
	hm.put(105, "vikas");
	System.out.println(hm); //inseration order  is not maintained
	
	//returns value corresponding to the given key
	System.out.println(hm.get(102));
	
	//removes entry associated with given key
	hm.remove(104);
	System.out.println(hm);
	
	//checks whether specified key is present
	System.out.println(hm.containsKey(102));
	
	System.out.println(hm.keySet());
	
	System.out.println(hm.values());
	
	System.out.println(hm.entrySet());
		
	//size 
	System.out.println(hm.size());
	
	System.out.println(hm.isEmpty());
	hm.clear();
	
	System.out.println(hm.isEmpty());
		
	}

}
