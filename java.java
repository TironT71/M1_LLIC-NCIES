package projecte23;

import java.util.Scanner;

public class pr23 {

	public static void main(String[] args) {
		
		int num1;
		int num2;
		int num3;
		Scanner lector = new Scanner(System.in);
		int random1 = (int)Math.floor(Math.random()*10);
		int random2 = (int)Math.floor(Math.random()*10);
		int random3 = (int)Math.floor(Math.random()*10);
		int pts = 0;
		
		
		System.out.println("JOC DEL BINGO");
		System.out.println("Has de escriure 3 numeros del 1-10");
		System.out.println("");
		System.out.print("Escriu el primer numero: ");
		num1 = lector.nextInt();
		System.out.print("Escriu el segon numero: ");
		num2 = lector.nextInt();
		System.out.print("Escriu el tercer numero: ");
		num3 = lector.nextInt();
		

		System.out.println("");
		System.out.println("Han surtit els numeros: " + random1 + "," + random2 + "," + random3);
		System.out.println("");
	
		
		if (num1 == random1 || num1 == random2 || num1 == random3) {
			System.out.println("+ 10 pts");  pts = pts + 10;
		} else {
			System.out.println("+ 0 pts");
		}
		
		
		if (num2 == random1 || num2 == random2 || num2 == random3) {
			System.out.println("+ 5 pts"); pts = pts + 5;
		} else {
			System.out.println("+ 0 pts");
		}
		
			
		if (num3 == random1 || num3 == random2 || num3 == random3) {
			System.out.println("+ 3 pts"); pts = pts + 3;
		} else {
			System.out.println("+ 0 pts");
		}
		
		System.out.println("");
		System.out.println("Total de punts: " + pts);
		
		if (pts == 18) {
			System.out.println("BINGO!!");
		}
		
		
	}

}
