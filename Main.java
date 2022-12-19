package assignment_1;

import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Functions obj = new Functions();
		
		//----------- Question(1) -----------
		System.out.print("Enter a string: ");  
		String str= sc.nextLine(); 
		System.out.print("Sorted string : ");
		obj.sort(str.toCharArray());
		//------------------------------------
		
		sc.close();
		System.out.println();
		
		//----------- Question(2) ------------
		try{  
			Functions.Student s1=obj.new Student(3154,"Karan");  
			  
			Functions.Student s2=(Functions.Student)s1.clone();  
			  
			System.out.println(s1.rollno+" "+s1.name);  
			System.out.println(s2.rollno+" "+s2.name);  
			  
			}catch(CloneNotSupportedException c){} 
		//------------------------------------
		
		//----------- Question(3) ------------
		obj.for_to_while();
		//------------------------------------
				
		//----------- Question(4(i)) ------------
		@SuppressWarnings("unused")
		Child cobj = new Child();
		//------------------------------------	
		
		//----------- Question(4(ii)) ------------
		obj.ids();
		//------------------------------------
		
		//----------- Question(5) ------------
		obj.formatted_output();
		//------------------------------------
		
		//----------- Question(6) ------------
		obj.substring();
		//------------------------------------
	}
}