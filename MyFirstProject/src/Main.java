import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Tutorial full course");
		// ***************** Variables ******************
		/* Primitive data types:     Reference data type:
		 * 8 types,                    unlimited: user defined
		 * store data,                 stores data & address
		 * hold one value	           can hold more than value
		 * faster                      slower
		 */
		//Primitive:
		/*
		Boolean a = true;
		int n = 22;
		char s = 's';
		//Reference:
		String x = "Abril";
		System.out.println(x+" number is "+n);
		*/
		
		// ***************** Scanner class: *****************
		/*
		Scanner scanner = new Scanner(System.in); 
		System.out.println("What's your name? ");
		String name = scanner.nextLine();  //two Next line methods don't work, when writing \n is added so the second reads this
		// solution: scanner.nextLine();
		System.out.println("Age?");
		int age = scanner.nextInt();     //if input not int, an exception appears
		System.out.println("Hello "+name);
		System.out.println("Age: "+age);  
		age++;
		System.out.println("Age: "+age);
		age--;
		System.out.println("Age: "+age);
		//Convert to double
		double num = (double) age + 4.5;
		System.out.println("Age + 4.5: "+num);
		*/
		
		// ***************** Small gui: graphical user interface *****************
		/*
		String name = JOptionPane.showInputDialog("Enter your name");
		JOptionPane.showMessageDialog(null,"hello "+ name);
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: ")); //parse in bc method returns string
		JOptionPane.showMessageDialog(null, "Hello "+name+ " you have "+age);
		*/
		// ***************** Math library *****************
		/*
		double x= 22.3;
		double y=10.0;
		System.out.println("max "+Math.max(x, y));
		System.out.println("sqrt of "+x + " is "+Math.sqrt(x));
		*/
		// ***************** Random    --> sudo-rnd variables *****************
		/*
		Random random = new Random(); 
		int limit = 10;
		int x = random.nextInt(limit); //nextDouble, nextBoolean etc
		System.out.println(x);
		*/
		// ***************** If statements *****************
		/*
		int x = 20;
		if(x >= 18) {
			System.out.println(x +" bigger than 18");
		}
		else {
			System.out.println(x + "not bigger than 18");
		}
		// ***************** Switch *****************
		String day = "Friday";
		switch(day) {
		case "Sunday": System.out.println("it'sw sunday");
		break; //go out from switch
		case "Friday": System.out.println("it's Friday yeaaah");
		break;
		default: System.out.println("in case no match");
		}
		*/
		// ***************** Logical operators ***************** 
			//  && = AND   || = OR          ! = NOT     
		/*
		System.out.println("write temperature");
		Scanner scanner = new Scanner(System.in);
		int temp = scanner.nextInt();
		if (temp > 18 && temp < 25) {
			System.out.println("Air conditionate is ok");
		}
		if (temp < 18 || temp > 24) {
			System.out.println("you're going crazy with the AC");
		}
		*/
		// ***************** While *****************
		/*
		Scanner scanner = new Scanner(System.in);
		String name= "";
		while (name.isBlank()) {
			System.out.print("Enter your name");
			name = scanner.nextLine();
		}
		System.out.println("hello "+ name);
		*/
		// ***************** Do -- While *****************
				// do loop -> the code is executed at least once!
		/*
		Scanner scanner = new Scanner(System.in);
		String name= "";
		do {
			System.out.print("Enter your name");
			name = scanner.nextLine();
		} while (name.isBlank());
		
		System.out.println("hello "+ name);
		}
		*/
		// ***************** For loops *****************
		/*
		for (int index = 0; index <= 10; index++) {
			System.out.println(index);
		}
		*/
		
		
	}
}
