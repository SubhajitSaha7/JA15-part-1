package p1;

public class Account implements Cdm, Admin
{
	public double balance = 50000;
	
	@Override
	public void withdraw()
	{
		System.out.println("Withdraw");
	}
	
	@Override
	public void getBalance()
	{
		System.out.println("Get Balance");
	}
	
	@Override
	public void clearPdc()
	{
		System.out.println("claer pdc");
	}
	
	@Override
	public void deposit()
	{
		System.out.println("deposit");
	}

}
