package arrays;
//check if all digits of a number are even
public class EvenArray {
	
	public static void isAllEven(int num) {
		boolean allEven=true;
		int originalnum=num;
		while(num!=0) {
			int digit=num%10;
			if(digit%2!=0) {
				allEven=false;
				break;
			}
			num=num/10;
		}
		if(allEven) {
			System.out.println("All digits of "+ originalnum+" are even.");
		}else {
			System.out.println("Not all digits of "+ originalnum +"are even.");
		}
	}
	public static void main(String[] args) {
	isAllEven(83);	
	}
}
