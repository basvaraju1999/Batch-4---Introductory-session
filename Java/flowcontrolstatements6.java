import java.util.*;  
class flowcontrolstatements6 {
public static void main(String[] args) {   
Scanner sc= new Scanner(System.in);      
String gender=sc.nextLine();
int age= sc.nextInt();  
	
		if(gender=="Female") {
		  if(age>=1&&age<=58)
		       System.out.println("8.2%");
			else if(age>58&&age<=100)
			    System.out.println("9.2%");	
		}
		else {
		       if(age>=1&&age<=58)
			      System.out.println("8.4%");
		       else if(age>58&&age<=100)
			       System.out.println("10.5%");
		}
   }
}