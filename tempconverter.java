# submit-first-app-jakemcd2001
submit-first-app-jakemcd2001 created by GitHub Classroom

import java.util.Scanner;
//intputs can be any interger above 273//
public class Program
{
	public static void main(String[] args) {
	
	
	Scanner sc = new Scanner(System.in);
         int tempc = sc.nextInt();	
         int tempk = tempc + 273;
         int tempf = tempc * 9/5 + 32;
        System.out.println("The Celcius Converter!");
        System.out.println("");
        System.out.println(tempc+" Degrees Celcius"+" --> "+tempf+" Degrees Fahrenheit");
        System.out.println(tempc+" Degrees Celcius"+" --> "+tempk+" Kelvin");
        System.out.println("");
        System.out.println("What's the next celius reading you want to be translated into fahrenheit and kelvin?");
}
}
