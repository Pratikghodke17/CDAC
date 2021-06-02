package recap;
import java.util.*;

class Arr{

	static void add(int[]elements) {
		int add =0;
		for(int i=1;i<elements.length;i++) {
			add += elements[i];}
		System.out.println("Addition is:"+add);
		}
	
	static void Search(int[]elements) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of Elements to find:");
		int scan = sc.nextInt();
		for(int i=1;i<elements.length;i++) {
			if(scan == elements[i]) {
				System.out.println("Elements is present in Array");
			}
		}
	}
	static void Reverse(int[]elements) {
		System.out.println("Reversed Array is :");
		for(int i=elements.length-1;i>=0;i--) {
			System.out.println(elements[i]);
		}
	}
//	static boolean Exit() {
//		return false;
//	}
}
	
	
public class ArrayMenu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of Elements to create:");
		int size = sc.nextInt();
		int [] elements = new int [size];
		System.out.println("Enter the elements");
		for(int i = 0; i < elements.length; i++){
			elements[i] = sc.nextInt();
		}
		int exit=0;
		do {
			System.out.println(" ");
			System.out.println("Enter Your Choice");
			System.out.println("1. ADD  2. Search  3. Reverse  4. Exit");
			int choice = sc.nextInt();
			switch(choice)
				{
					case 1: Arr.add(elements);
					break;
					case 2: Arr.Search(elements);
					break;
					case 3: Arr.Reverse(elements);
					break;
					case 4: exit=1;
					break;
					default: break;
				}		
			}
		while(exit==0);
	}
}


		
		
	


