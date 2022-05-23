package com.task;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Compare {
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the Size:");
			int n = sc.nextInt();
			int[] arr= new int[n];
			int k=3;

			System.out.println("Enter the Elements :");

			for(int i = 0; i<arr.length;i++) {
				arr[i]=sc.nextInt();
				//System.out.println(a[i]);
			}
					
			LinkedHashSet<Integer> newset = new LinkedHashSet<Integer>();
			for(int i = 0;i<arr.length;i++) {
				
				newset.add(arr[i]);
				
			}
			
			int setsize = newset.size();
			int[] temp = new int[setsize];
			int count=0;
			for (int i : newset) {
				
				temp[count++]=i;
				
			}
			for(int i = 0;i<temp.length;i++) {
				System.out.println(temp[i]);
			}
			
			int add=0;
			for(int i = 1;i<temp.length;i++) {
				if(temp[i]-temp[0]>=k) {
					add++;
				}else {
					continue;
				}
			}
			System.out.println("the total number of such longest sequence is possible:" +add);
		}
		
	}

}
