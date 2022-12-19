package assignment_1;

import java.util.Scanner;

public class Functions {
	Scanner sc= new Scanner(System.in);
	
// 1. Sorting string without using string Methods.
//----------------------------------------------------------
	public void sort(char[] chars) {
		int n = chars.length;
		char t= 0;
		for(int i=0; i<n; i++) {
			for(int j=i; j<n; j++) {
				if(chars[j]<chars[i]) {
					t = chars[i];
					chars[i] = chars[j];
					chars[j] = t;
				}
			}
		}
		for(int i=0; i<n; i++)
			System.out.print(chars[i]);
	}
//----------------------------------------------------------

// 2. WAP to show object cloning in java using 
//	clone-able and copy constructor both.
//----------------------------------------------------------
	class Student implements Cloneable{  // Nested class
		int rollno;  
		String name;  
		  
		Student(int rollno,String name){  
		this.rollno=rollno;  
		this.name=name;  
		}  
		  
		public Object clone()throws CloneNotSupportedException{  
		return super.clone();  
		}   
	} 
//----------------------------------------------------------	

		
// 3. Convert nested while statements instead of for statements.
//----------------------------------------------------------
	void for_to_while() {
		int s = 0;
		int t = 1;
		
		int i = 0;
		while(i<10) {
			s=s+i;
			
			int j=i;
			while(j>0) {
				t=t*(j-i);
				j--;
			}
			s=s*t;
			System.out.println("T is"+t);
			i++;
		}
		System.out.println("S is"+s);
	}
//----------------------------------------------------------
	
	
// 4(ii). Read an integer, a double, and a String, then print the values.
//----------------------------------------------------------
	void ids() {
		//Read
		System.out.print("Enter a integer	:");
		int i = sc.nextInt();
		System.out.print("Enter a double	:");
		double d = sc.nextDouble();
		sc.nextLine();
		System.out.print("Enter a String	:");
		String s = sc.nextLine();
		
		//Print
		System.out.println("String	: " + s);
        System.out.println("Double	: " + d);
        System.out.println("Int	: " + i);
	}
//----------------------------------------------------------
	
// 5. Understanding of formatting output using print f
//----------------------------------------------------------
	void formatted_output() {
		System.out.println("Enter string followed by an integer");
		String[] s = new String[3];
		int[] x = new int[3];
		
		for(int i=0; i<3; i++) {
			System.out.print(i+1+" - ");
			s[i] = sc.next();
			x[i] = sc.nextInt();
		}
		System.out.println("======================");
		for(int i=0; i<3; i++) {
			System.out.printf("%-15s%03d\n",s[i],x[i]);
		}
		System.out.println("======================");		
	}
//----------------------------------------------------------

// 6. Given a string, s , and two indices, start and end , 
//	print a substring consisting of all characters in the inclusive range
//----------------------------------------------------------
	void substring() {
		System.out.print("Enter String : ");
		String s = sc.next();
		System.out.print("Start : ");
		int start = sc.nextInt();
		System.out.print("End : ");
		int end = sc.nextInt();
		System.out.println(s.substring(start,end));
	}
//----------------------------------------------------------
}

//4(i). What is output on new child() ?
//----------------------------------------------------------
	class Grandparent {

		static {
			System.out.println("static - grandparent");
		}
		{
			System.out.println("instance - grandparent");
		}
		public Grandparent() {
			System.out.println("constructor - grandparent");
		}
	}

	class Parent extends Grandparent {
		 {
		 System.out.println("instance - parent");
		 }
		 public Parent() {
		 System.out.println("constructor - parent");
		 }
		 static {
		 System.out.println("static - parent");
		 }
	}

		 
	class Child extends Parent {
		 int i = 0;
		 public Child() {
		 System.out.println("constructor - child");
		 }

		 static {
		 System.out.println("static - child");
		 }
		 {
		 System.out.println("instance - child");
		 }
	}
//----------------------------------------------------------