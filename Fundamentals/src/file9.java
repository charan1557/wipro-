
public class file9 {
	public static void main(String[] args) {
		String gender=args[0];
		int age=Integer.parseInt(args[1]);
		if((args[0].equals("female")) && (age>=1 && age<=58))
			System.out.println("The percentage of interest is 8.2% ");
		else if((args[0].equals("female")) && (age>=59 && age<=100))
			System.out.println("The percentage of interest is 9.2% ");
		else if((args[0].equals("male")) && (age>=1 && age<=58))
			System.out.println("The percentage of interest is 8.4% ");
		else if((args[0].equals("male")) && (age>=59 && age<=100))
			System.out.println("The percentage of interest is 10.5% ");
	}

}
