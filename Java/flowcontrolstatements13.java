class flowcontrolstatements13
{
   public static void main (String[] args)
   {		
       int i =10;
       int num =0;
       String  un = "";
       for (i = 1; i <= 100; i++)         
       { 		  	  
          int myFlag=0; 	  
          for(num =i; num>=1; num--)
	  {
             if(i%num==0)
	     {
 		myFlag = myFlag + 1;
	     }
	  }
	  if (myFlag ==2)
	  {
	     un = un + i + " ";
	  }	
       }	
       System.out.println(un);
   }
}