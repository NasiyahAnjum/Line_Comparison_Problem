package com.java.linecomparisonproblem;
import java.util.Scanner;
public class Line_Comparison_Problem {
	
	void lengthCalculate() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculate length of first line");
        System.out.println("Enter x1 co-ordinate : ");
        int x1 = sc.nextInt();
        System.out.println("Enter x2 co-ordinate : ");
        int x2 = sc.nextInt();
        System.out.println("Enter y1 co-ordinate : ");
        int y1 = sc.nextInt();
        System.out.println("Enter y2 co-ordinate : ");
        int y2 = sc.nextInt();

        Double lenOfLineFirst = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println("Length of first line is " + lenOfLineFirst);
        
        System.out.println("Calculate length of second line");
        System.out.print("Enter x3 co-ordinate: ");
        int x3 = sc.nextInt();
        System.out.print("Enter x4 co-ordinate: ");
        int x4 = sc.nextInt();
        System.out.print("Enter y3 co-ordinate: ");
        int y3 = sc.nextInt();
        System.out.print("Enter y4 co-ordinate: ");
        int y4 = sc.nextInt();
        
        Double lenOfLineSecond = Math.sqrt(Math.pow((x4 - x3), 2) + Math.pow((y4 - y3), 2));
        System.out.println("Length of Second line is " + lenOfLineSecond);
        
        if (lenOfLineFirst.equals(lenOfLineSecond))
            System.out.println("Lines are equal");
        else
        	 System.out.println("Lines are not equal");
        
        int value = lenOfLineFirst.compareTo(lenOfLineSecond);
        if (value < 0) {
            System.out.println("Length of first line less than second line");
        } else if (value > 0) {
            System.out.println("Length of second line greater than first line");
        } else {
            System.out.println("Both lines are equal");
        }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Welcome to Line Comparison Computation Program");
		 Line_Comparison_Problem checkEquality = new Line_Comparison_Problem();
	        checkEquality.lengthCalculate();
	}

}
