
import java.util.Scanner;

public class ClaseMain extends Cajero 

{
	
	 private Cliente cliente;
	    
	    private Tarjeta tarjeta;
	    
	    private CuentaBancaria cuenta;

	    public ClaseMain(Cliente cliente, Tarjeta tarjeta, CuentaBancaria cuenta, int idCajero) 
	    
	    {
	        
	        super(idCajero);
	        
	        this.cliente = cliente;
	        
	        this.tarjeta = tarjeta;
	        
	        this.cuenta = cuenta;
	        
	    }
	    
	    public void inicializacion()
	            
	    {
	        
	        Scanner lectura = new Scanner(System.in);
	        
	        int opciones;
	        
	        do
	            
	        {
	            
	            mostrarMenu();
	            
	            opciones = lectura.nextInt();
	            
	            switch (opciones)
	                
	            {
	                
	                case 1:
	                    
	                    cliente.ingresarClave();
	                    
	                    cliente.ingresarTarjeta();
	                    
	                    if (tarjeta.validarTarjeta())
	                        
	                    {
	                        
	                        cliente.seleccionarOperacion();
	                        
	                        realizarOperacion();
	                        
	                    }
	                    
	                    else
	                        
	                    {
	                        
	                        System.out.println("Tarjeta no válida.");
	                        
	                    }
	                    
	                    break;
	                    
	                case 2:
	                    
	                    double saldo = cuenta.consultarSaldo();
	                    
	                    System.out.println("Saldo actual: " + saldo);
	                    
	                    break;
	                    
	                case 3:
	                    
	                    System.out.println("Ingrese el monto a retirar:\r");
	                    
	                    double montoRetiro = lectura.nextDouble();
	                    
	                    cuenta.retirar(montoRetiro);
	                    
	                    break;
	                    
	                case 4:
	                    
	                    System.out.println("Ingrese el monto a depositar:\r");
	                    
	                    double montoDeposito = lectura.nextDouble();
	                    
	                    cuenta.depositar(montoDeposito);
	                    
	                    break;
	                    
	                case 5:
	                    
	                    System.out.println("Finalizando interacción...");
	                    
	                    break;
	                    
	                default:
	                    
	                    System.out.println("Opción no válida.");
	                
	            }
	            
	        }
	        
	        while (opciones != 5);
	        
	        lectura.close();
	        
	    }
	    
	    private void mostrarMenu()
	            
	    {
	        
	        System.out.println("Menú:\r");
	        
	        System.out.println("1. Realizar operación.");
	        
	        System.out.println("2. Consultar saldo.");
	        
	        System.out.println("3. Retirar dinero.");
	        
	        System.out.println("4. Depositar dinero.");
	        
	        System.out.println("5. Finalizar interacción.\r");
	        
	        System.out.println("Por favor, digite cualquiera de las opciones que quiera realizar.");
	        
	    }
	    
	    private void realizarOperacion()
	            
	    {
	        
	        System.out.println("Operación finalizada con éxito.");
	        
	    }
	    
	    public static void main(String[] args)
	            
	    {
	        
	        Cliente cliente = new Cliente(123);
	        
	        Tarjeta tarjeta = new Tarjeta("1126564173", "Débito");
	        
	        CuentaBancaria cuenta = new CuentaBancaria("789456123", 1400000);
	        
	        ClaseMain cajeroAutomatico = new ClaseMain(cliente, tarjeta, cuenta, 1);
	        
	        cajeroAutomatico.inicializacion();
	        
	    }
	    
	}



