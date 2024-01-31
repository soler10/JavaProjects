import java.util.Scanner;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Random;
import java.util.*;


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
		// ***************** Arrays *****************
		/*
		String[] cars= {"A", "B", "C"};
		String[] letters= new String[3];
		letters[0]="a";
		letters[1]="b";
		letters[2]="c";
		System.out.println(cars[2]);
		System.out.println(letters[2]);
		*/
		// ***************** 2D Arrays *****************
		/*
		String[][] a = new String[2][2];
		a[0][0]="aa";
		a[0][1]="aa";
		a[1][0]="aa";
		a[0][1]="aa";
		System.out.println(a[0][0]);
		*/
		// ***************** string methods *****************
		/*
		String name = "Abril";
		System.out.println(name.equals("abril"));
		System.out.println(name.equals("Abril"));
		System.out.println(name.length());
		System.out.println(name.charAt(0));
		System.out.println(name.indexOf("b"));
		*/
		// ***************** wrapper classes  *****************
		/*
		//Primitive faster, reference data type have methods (like stings)
		//Primitive            Wrapper
		//boolean              Boolean
		//char                 Character
		//int                  Integer ...
		//Autoboxing: automatic conversion btwn primitive types and their corresponding obj wrapper class
		Boolean a = true;
		Character b = '@';
		Integer c =  123;
		Double d=3.14;
		// a. gives you the methods accessible
		//Unboxing: reverse of autoboxing. Automatic conversion of wrapper class to primitive
		*/
		// ***************** AraayList  *****************
		/*
		//stores wrapper classes. Elements can be added or removed after compilation phase
		ArrayList<String> food = new ArrayList<String>();
		food.add("pizza");
		food.add("donut");
		food.add("noodels");
		
		food.set(0, "sushi");
		
		for (int i=0; i<food.size(); i++) {
			System.out.println(food.get(i));
		}
		
		//java.util.*
		System.out.println(food);
		ArrayList<String> drink = new ArrayList<String>();
		drink.add("beer");
		drink.add("coffee");
		
		ArrayList<ArrayList<String>> grocery = new ArrayList<ArrayList<String>>();
		grocery.add(food);
		grocery.add(drink);
		System.out.println(grocery);
		System.out.println(grocery.get(0).get(0));
		
		// ***************** foreach loop *****************
		//less steps but less flexible
		String[] animals= {"a", "b", "cat"};
		
		ArrayList<String> gats = new ArrayList<String>();
		gats.add("Miquel");
		gats.add("Linux");
		gats.add("Maggie");
		
		for(String i : animals) {
			System.out.println(i);
		}for(String i : gats) {
			System.out.println(i);
		}
		*/
		// ***************** creating a method outside main *****************
		/*
		String name= "Abril";
		hello(name);  //arguments
		int years = 27;
		age(years);
		int aa = age(years);
		*/
		// ***************** overloaded methods *****************
		/*
		//methods that share the same name by t have different parameters
		//       method name + parameters + method signature
		System.out.println(add(2, 3));
		System.out.println(add(2, 3, 4));
		System.out.println(add(2, 3, 4, 5));
		*/
		// ***************** printf *****************
		/*
		//Control the printing --> format specifier i més coses!!!!
		System.out.printf("Aixo %c es un format d'string %d",'@', 123);
		*/
		// ***************** final declaration *****************
		final double PI =3.14158; //can not be changed
		
		// ***************** printf *****************
		
		
		// ***************** constructors, classes and methods *****************
		
		//Car myCar = new Car();
		Car myCar = new Car("Tesla", 2022, 70000);
		System.out.println(myCar.make);
		myCar.drive();
		myCar.brake();
		
		// ***************** global vs local *****************
		//local: declared inside a method, visible onli to that method
		//global = declared outside a method, but within class, visible to all parts of the class
		DiceRoller mydice = new DiceRoller();
		
		// ***************** overload constructors *****************
		//same name parameters but different parameters (unique signature
		myCar.drive();
		myCar.drive(3);
		
		// ***************** toString method *****************
		System.out.println(myCar);   //  = address of the memory
		//when override the toString method in the class car
		System.out.println(myCar.toString());
		
		// ***************** array of objects *****************
		
		Car myCar1 = new Car("Tesla", 2022, 70000);
		Car myCar2 = new Car("WW", 2000, 50000);
		Car myCar3 = new Car("WMV", 2001, 80000);
		//Car[] garage = new Car[3];
		//garage[0]=myCar1;
		//garage[1]=myCar2;
		//garage[2]=myCar3;
		Car[] garage = {myCar1, myCar2, myCar3};
		System.out.println(garage[2].toString()+"\n");
		
		
		// ***************** static *****************
		//Static = modifier. A single copy of a variable/method is created and shared. 
					// the class "owns" the static memeber
		Friend f1 = new Friend("Spongebob");
		Friend f2 = new Friend ("Dora");
		Friend f3 = new Friend ("Patricio");
		
		System.out.println(f1.numberOfFriends);
		System.out.println(Friend.numberOfFriends);
		
		System.out.println(f1.numberOfFriends2);
		
		//static method
		Friend.displayFriends();
		
		
	}
	//overloaded methods
	static int add(int a, int b) {
		System.out.println("1st");
		return a+b;
	}
	static int add(int a, int b, int c) {
		System.out.println("2nd");
		return a+b+c;
	}
	static int add(int a, int b, int c, int d) {
		System.out.println("3rd");
		return a+b+c+d;
	}
	
	
	
	//crrating a method Static -- bc we call hello method from a static method??
	static void hello(String name) {
		System.out.println("Hello "+name);
	}
	static int age(int y) {
		System.out.println("you are "+y+" years old");
		return y;
	}
	}
