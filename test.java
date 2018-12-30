import java.util.Scanner;

import com.QuickBus.PromcodeApi.Promocode;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println();
		Scanner input4 = new Scanner(System.in);
		System.out.print("Enter Origin: ");
    	String orig = input4.next();
    	Scanner input5 = new Scanner(System.in);
    	System.out.print("Enter destination: ");
    	String dest = input5.next();
		Promocode.getactivedata();
	}

}
