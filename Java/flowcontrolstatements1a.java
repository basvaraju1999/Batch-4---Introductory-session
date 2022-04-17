import java.util.Scanner; 
class flowcontrolstatements1a {
  public static void main(String[] args) {
    int a;
     Scanner sc = new Scanner(System.in); 
    a = sc.nextInt(); 
    if(a>0)
     System.out.println("Positive"); 
	else if(a<0)
	 System.out.println("Negative"); 
	else
	 System.out.println("Zero");
    
  }
} 