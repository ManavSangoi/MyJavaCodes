import java.util.*;
class pin
{
	int pin=1111,pass;
	Scanner input=new Scanner(System.in);
	public void pass()
	{
		System.out.println("Enter your pin");
	}	
}
class balance extends pin
{
	int bals=7500,balc=15000;
	public void balances()
	{
		System.out.println("Your balance is "+bals);
	}
	public void balancec()
	{
		System.out.println("Your balance is "+balc);
	}
}
class withdraw extends balance
{
	Scanner input=new Scanner(System.in);
	int amt;
	public void withs()
	{
		System.out.println("Enter the amount you want to withdraw");
		amt=input.nextInt();
		if(amt<bals)
		{
			System.out.println("Thankyou for using");
			bals=bals-amt;
			System.out.println("Your remaining balance is "+bals);
		}
		else
		{
			System.out.println("Insufficient balance");
		}
	}
	public void withc()
	{
		System.out.println("Enter the amount you want to withdraw");
		amt=input.nextInt();
		if(amt<balc)
		{
			System.out.println("Thankyou for using");
			balc=balc-amt;
			System.out.println("Your remaining balance is "+balc);
		}
		else
		{
			System.out.println("Insufficient balance");
		}
	}
}
class deposit extends balance
{
	int amt;
	Scanner input=new Scanner(System.in);
	public void deps()
	{
		System.out.println("Enter amount to deposit");
		amt=input.nextInt();
		System.out.println("Thankyou for using");
		bals=bals+amt;
		System.out.println("Your balance is "+bals);
	}
	public void depc()
	{
		System.out.println("Enter amount to deposit");
		amt=input.nextInt();
		System.out.println("Thankyou for using");
		balc=balc+amt;
		System.out.println("Your balance is "+balc);
	}
}
class ontransfer extends balance
{
	int amt,accno;
	Scanner input=new Scanner(System.in);
	public void ots()
	{
	System.out.println("Enter amount u want to transfer");
	amt=input.nextInt();
	if(amt<bals)
	{
		System.out.println("Enter the account number");
		accno=input.nextInt();
		if(accno>=100000 && accno<=999999)
		{
			System.out.println("Enter your pin");
			pass=input.nextInt();
			if(pass==pin)
			{
				System.out.println("Your transfer is succesfull");
				bals=bals-amt;
				System.out.println("Your balance is "+bals);
			}
		}
		else{System.out.println("Invalid account number");}
	}
	else 
	{
		System.out.println("Insufficient Balance");
	}
	} 
    public void otc()
	{
	System.out.println("Enter amount u want to transfer");
	amt=input.nextInt();
	if(amt<balc)
	{
		System.out.println("Enter the account number");
		accno=input.nextInt();
		if(accno>=100000 && accno<=999999)
		{
			System.out.println("Enter your pin");
			pass=input.nextInt();
			if(pass==pin)
			{
				System.out.println("Your transfer is succesfull");
				balc=balc-amt;
				System.out.println("Your balance is "+balc);
			}
		}
		else{System.out.println("Invalid account number");}
	}
	else 
	{
		System.out.println("Insufficient Balance");
	}
	}
}
class atm
{
	public static void main(String arg[])
	{
		int a,b,pin=1111,pass;
		withdraw obj1=new withdraw();
		deposit obj2=new deposit();
		ontransfer obj3=new ontransfer();
		Scanner input=new Scanner(System.in);
		obj1.pass();
		pass=input.nextInt();
		if(pass==pin)
		{
		System.out.println("1.Saving\n2.Current\nEnter your choice");
		a=input.nextInt();
		switch(a)
		{
		case 1:System.out.println("Welcome to your saving account\n1.Withdraw\n2.Deposit\n3.Checkbalance\n4.Online Transfer");
		b=input.nextInt();
		switch(b)
		{
			case 1:obj1.withs();
			break;
			case 2:obj2.deps();
			break;
			case 3:obj1.balances();
			break;
			case 4:obj3.ots();
			break;
			default:System.out.println("Invalid input");
			break;	
		}
		break;
		case 2:System.out.println("Welcome to your current account\n1.Withdraw\n2.Deposit\n3.Checkbalance\n4.Online Transfer");
		b=input.nextInt();
		switch(b)
		{
			case 1:obj1.withc();
			break;
			case 2:obj2.depc();
			break;
			case 3:obj1.balancec();
			break;
			case 4:obj3.otc();
			break;
			default:System.out.println("Invalid input");
			break;
		}
		break;
		default:System.out.println("Invalid output");
		break;
		}
		}
		else
		{
			System.out.println("Invalid pin");
		}
	}
}