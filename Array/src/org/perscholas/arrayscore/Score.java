package org.perscholas.arrayscore;

import java.util.Scanner;

public class Score {

	
	    public static void main(String[] args) {
//	      int[] arr1d = {1,2,3};
//	      System.out.println(arr1d);
//	      
//	      // Printout Array elements
//	      //Way 1 
//	      System.out.println(arr1d[0]);
//	      System.out.println(arr1d[1]);
//	      System.out.println(arr1d[2]);
//	      //way2
//	      for(int i=0; i<arr1d.length; i++)
//	          System.out.println(arr1d[i]);
//	      //way3
//	      for(int x : arr1d)
//	          System.out.println(x);
//	      
//	      // Change Array elements values
//	      for(int i=0; i<arr1d.length;i++)
//	          arr1d[i] = 0;
//	      //printout
//	      for(int t : arr1d)
//	          System.out.println(t);
	        // Application: Change one element vlaue
	        Scanner in = new Scanner(System.in);
	        System.out.println("How many students: ");
	        int size = in.nextInt();
	        double[] scores = new double[size];
	        double[] scores1 = new double[size];
	        
	        System.out.println("----------------------Exam 1---------------");
	        
	        System.out.println("Enter student score Exam 1: ");
	        for (int i = 0; i < scores.length; i++)
	            scores[i] = in.nextDouble();
	        System.out.println("Do you want to change a score?(Y/N)");
	        String answer = in.next();
	        if (answer.equals("Y")) {
	            System.out.println("Enter the student number:");
	            int studNum = in.nextInt();
	            System.out.println("Enter the new score:");
	            scores[studNum - 1] = in.nextDouble();
	            for (double d : scores)
	                System.out.println(d);
	            avg(scores);
	        } else {
	            avg(scores);
	        }
	        
	        System.out.println("----------------------Exam 2---------------");
	        
	        
	        System.out.println("Enter student score Exam 2: ");
	        for (int i = 0; i < scores.length; i++)
	            scores1[i] = in.nextDouble();
	        System.out.println("Do you want to change a score?(Y/N)");
	        String answer1 = in.next();
	        if (answer.equals("Y")) {
	            System.out.println("Enter the student number:");
	            int studNum1 = in.nextInt();
	            System.out.println("Enter the new score:");
	            scores[studNum1 - 1] = in.nextDouble();
	            for (double d1 : scores)
	                System.out.println(d1);
	            avg2(scores1);
	        } else {
	            avg2(scores1);
	        }
	        
	        
	        
//	      int[] arr1d2 = new int[3];
//	      System.out.println(arr1d2);
	    }
	    public static void avg(double[] scores) {
	        double sum = 0.0, avg = 0.0;
	        for (int i = 0; i < scores.length; i++) {
	            sum += scores[i]; // <=> sum = sum + scores[i];
	        }
	        avg = sum / scores.length;
	        System.out.println("The avg of scores is: " + avg);
	    }
	
	    public static void avg2(double[] scores1) {
	        double sum = 0.0, avg = 0.0;
	        for (int i = 0; i < scores1.length; i++) {
	            sum += scores1[i]; // <=> sum = sum + scores[i];
	        }
	        avg = sum / scores1.length;
	        System.out.println("The avg of scores is: " + avg);
	    }
	    

	}


