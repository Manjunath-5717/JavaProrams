package arrays;

public class MYownArray<T>{
	T[] arr;
	int index;
	public void add(Object o) {
		if(arr==null) {
			arr =(T[]) new Object[5];
			arr[index++] = (T) o;
		}
		else if(index==arr.length) resize();
		else if(index<arr.length) {
			arr[index++] = (T)o;
		} }
	
	
	private void resize() {
		T[] res =(T[]) new Object[arr.length*2];
		for(int i = 0; i<arr.length; i++) {
			res[i] = arr[i];
		}
		arr = res;
 	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for(int i =0; i<index-1; i++) {
			sb.append(arr[i]+", ");
		}
		sb.append(arr[index-1]+"]");
		return sb.toString();
	}
	
	public void remove(Object o) {
	    for(int i = 0; i < index; i++) {
	        if(arr[i].equals(o)) {

	            for(int j = i; j < index - 1; j++) {
	                arr[j] = arr[j + 1];
	            }

	            index--;
	            arr[index] = null;
	            return;
	        }
	    }
	}
	public boolean contains(Object o) {
	    for(int i = 0; i < index; i++) {
	        if(arr[i].equals(o)) {
	            return true;
	        }
	    }
	    return false;
	}
	public int size(Object o) {
		int count=0;
		for(int i=1;i<=index;i++) {
		count++;
		}
		return count;
	}
}