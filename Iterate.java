package com.task;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Iterate {
	public static void main(String[] args) {

		List<Integer> a = new ArrayList<Integer>(7);
		List<Integer> b = new ArrayList<Integer>(7);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		for(int i = 0; i < 7;i++) {	
			a.add(sc.nextInt());
		}

		int count =0;		
		for(int i= 0 ; i<a.size()-1;i++) {

			if(a.get(i) > a.get(i+1)) {
				b.add(a.get(i));
				a.remove(a.get(i));
			}
			else {
				a.remove(a.get(i+1));
				b.add(a.get(i));
			}
			count++;			
		}
		System.out.println(count-1);
	}
}
