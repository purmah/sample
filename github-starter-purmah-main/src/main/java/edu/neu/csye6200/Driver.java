package edu.neu.csye6200;

/**
 * 
 * @author Ruchika Sharma
 * 
 */

public class Driver {
	public static void main(String[] args) {
		System.out.println("============Main Execution Start===================\n\n");
		Sample s=new Sample();
		s.demo(15,6);
         //Add your code in between these two print statements
		 
		System.out.println("\n\n============Main Execution End===================");
	}

}
class Sample{
	static void demo(int a, int b){
		System.out.println(a-b);

	}
}