
public class file11 {
public static void main(String[] args) {
	char a=args[0].charAt(0);
	String daystring;
	switch (a) { 
    case 'G': 
        System.out.println("Green");
        break; 
    case 'O': 
    	System.out.println("Orange");
        break; 
    case 'Y': 
    	System.out.println("Yellow");
        break; 
    case 'W': 
    	System.out.println("White"); 
        break; 
    case 'R': 
    	System.out.println("Red");
        break; 
    default:
    	System.out.println("Invalid code");
	}
}
}

