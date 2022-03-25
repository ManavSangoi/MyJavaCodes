import java.util.*;

class menu
{
	public static void main(String arg[])
	{
		Scanner obj1=new Scanner(System.in);
		int x;
		double num1,num2,num3,num4,avg,area,tax,cost;
		System.out.println("1.Area of circle\n2.Average of 4 numbers\n3.Check number is positive or negative\n4.Ola");
		x=obj.nextInt();
		switch(x)
		{
			case 1:System.out.println("Enter the radius of circle");
			       num1=obj.nextDouble();
				   area=num1*num1*3.14;
				   System.out.println("Area of the circle is "+area);
				   break;
			case 2:System.out.println("Enter four numbers");
		           num1=obj.nextDouble();
				   num2=obj.nextDouble();
				   num3=obj.nextDouble();
				   num4=obj.nextDouble();
				   avg=(num1+num2+num3+num4)/4;
				   System.out.println("The average is "+avg);
				   break;
			case 3:System.out.println("Enter a number");
			       num1=obj.nextDouble();
				   if(num1>=0)
				   {
					   System.out.println("Your number is positive");
				   }
				   else
				   {
					   System.out.println("Your number is negative");
				   }
				   break;
			case 4:System.out.println("Enter the number of kms u want to travel");
			       num1=obj.nextDouble();
				   if(num1>=0 && num1<100)
				   {
					   num2=num1*7;
					   tax=num2*0.18;
					   cost=num2+tax;
					   System.out.println("This is the total cost of the trip "+cost);
					   
				   }
				   else if(num1>=100 && num1<250)
				   {
					   num2=num1*13.5;
					   tax=num2*0.12;
					   cost=num2+tax;
					   System.out.println("This is the total cost of the trip "+cost);
				   }
				   else if(num1>=250 && num1<475)
				   {
					   num2=num1*16.5;
					   tax=num2*0.09;
					   cost=num2+tax;
					   System.out.println("This is the total cost of the trip "+cost);
				   }
				   else if(num1>=475)
				   {
					   num2=num1*19.75;
					   tax=num2*0.05;
					   cost=num2+tax;
					   System.out.println("This is the total cost of the trip "+cost);
				   }
				   else 
				   {
					   System.out.println("enter valid kms");
				   }
				   break;
			default: System.out.println("Invalid choice");
			         break;
 		}
	}
}