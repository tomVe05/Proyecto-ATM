
public class CuentaBancaria 

{
	
	private String numeroCuenta;
	
	private double saldo;

	public CuentaBancaria(String numeroCuenta, double saldo) 
	{
		
		super();
		
		this.numeroCuenta = numeroCuenta;
		
		this.saldo = saldo;
		
	}
	
	public double consultarSaldo()
	
	{
		
		return saldo;
		
	}
	
	public void retirar(double monto)
	
	{
		
		if (monto > saldo)
			
		{
			
			System.out.println("Error, saldo insuficiente.");
			
		}
		
		else
			
		{
			
			saldo -= monto;
			
			System.out.println("Retiro aceptado. Su saldo actual es: " + saldo);
			
		}
		
	}
	
	public void depositar (double monto)
	
	{
		
		saldo += monto;
		
		System.out.println("Depósito aceptado. Su saldo actual es: " + saldo);
		
	}

}
