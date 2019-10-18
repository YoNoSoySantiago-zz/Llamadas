package ui;
import model.*;
import java.util.Scanner;
public class Main{
	
	public Scanner sc;
	public LineaTelefonica linea = new LineaTelefonica();	
	
	public Main(){
		sc= new Scanner(System.in);
	}

	public void start(int menuChooser,int localMinutes,int cellphoneMinutes,int internationalMinutes){
		while (menuChooser != 4){
			showMenu();
			menuChooser=sc.nextInt();
			sc.nextLine();
		
			switch (menuChooser){
				case 1:
				System.out.println("Please write the total in minutes of your local calls");
				localMinutes= sc.nextInt();
				
				linea.addBasica(localMinutes);
				 break ; 

				case 2:
				System.out.println("Please write the total in minutes of your local calls");
				localMinutes= sc.nextInt();
				sc.nextLine();


				System.out.println("Please write the total in minutes of your cellphone calls");
				cellphoneMinutes= sc.nextInt();
				sc.nextLine();

				linea.addCelular(localMinutes,cellphoneMinutes);
				break;

				case 3: 
				System.out.println("Please write the total in minutes of your local calls");
				localMinutes= sc.nextInt();
				sc.nextLine();


				System.out.println("Please write the total in minutes of your cellphone calls");
				cellphoneMinutes= sc.nextInt();
				sc.nextLine();

				System.out.println("Please write the total in minutes of your international Calls");
				internationalMinutes= sc.nextInt();
				sc.nextLine();

				linea.addVozIP(localMinutes,cellphoneMinutes,internationalMinutes);
				break;

				case 4: 

				break;

				case 5:

				int result;

				result= linea.calcularCostos();

				System.out.println("Money to pay: "+result);

				break;
			}
		
		}

	}
	
	
	public static void main(String[] args){
		
		int menuChooser=0,localMinutes=0,cellphoneMinutes=0,internationalMinutes=0;
		

		Main principal= new Main();
	    System.out.println("Welcome new User");
	
		principal.start(menuChooser,localMinutes,cellphoneMinutes,internationalMinutes);
		

	}
	public void showMenu(){
		System.out.println("\n Please, write the option of your telephone line." 
							+"\n 1.Basic Line."
							+"\n 2.Cellphone Line." 
							+"\n 3.Voice Line." 
							+"\n 4.None,I want to close the app. "
							+"\n 5.Show value");

	}
}