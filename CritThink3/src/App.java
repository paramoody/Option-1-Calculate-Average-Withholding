import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your weekly income");
		double income = 0;
		try {
			income = scanner.nextDouble();
			scanner.nextLine();
		} catch (Exception e) {
			System.out.println("not a valid input");
			System.exit(0);
		}
		
		double taxRate = 0;
		String taxString = "0%";
		if (income < 0) {
			System.out.println("income cannot be less than zero");
			System.exit(0);
		}
		if (income < 500) {
			taxRate = 0.1;
			taxString = "10%";
		}else if (income < 1500) {
			taxRate = 0.15;
			taxString = "15%";
		}else if (income < 2500) {
			taxRate = 0.20;
			taxString = "20%";
		}else{
			taxRate = 0.3;
			taxString = "30%";
		}
		
		
		System.out.println("Your tax rate is " + taxString + ". Your tax withholding is " 
							+ String.format("%.2f", (income * taxRate)) );
		
		scanner.close();
		
	}
}
