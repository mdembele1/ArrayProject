package org.perscholas.arrayscore;

import java.util.Scanner;

public class TwoDimensions {

	public static void main(String[] args) {
		Scanner input= new Scanner (System.in);
		int[][] array2D=new int [3][3];
		
		for (int r=0; r<array2D.length; r++) 
			for (int c=0;c<array2D[r].length; c++) 
				array2D[r][c]=input.nextInt();
		
		for (int[] r:array2D) {
			System.out.println();
			for (int c: r)
				System.out.print(c+ " ");
		}
	}
}
