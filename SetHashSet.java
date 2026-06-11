import java.util.HashSet;

public class SetHashSet {
	
	public static void main(String[] args) {
		HashSet<Integer> hs=new HashSet<>();
		hs.add(60);
		hs.add(50);
		hs.add(30);
		hs.add(29);
		System.out.println(hs);
		
		
		//searching
		System.out.println(hs.contains(29));
		
		//removing
		hs.remove(29);
		System.out.println("after removing:"+hs);
		
		//size()
		System.out.println(hs.size());
	
		
		System.out.println(hs.isEmpty());
		
		hs.clear();
		
		System.out.println("after clear"+hs);
	
	}

}

