package com.personality;

import java.util.Scanner;

public class Person{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Question questions[] = new Question[10];
		for(int i=0; i<2; i++) {
			System.out.println("Enter Question "+(i+1)+":");
			questions[i].question = "trtt";
			for(int j=0; j<4; j++) {
				System.out.println("Enter option "+(j+1)+":");
				questions[i].options[j] = sc.next();
				System.out.println("Enter quality values:");
				for(int k=0; k<5; k++) {
					questions[i].ans[j][k] = sc.nextBoolean();
				}
			}
		}
		sc.close();
	}
}
