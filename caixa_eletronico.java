package projeto_caixa_eletronico_1;
import java.util.Scanner;

public class caixa_eletronico 
{		
	static Scanner entrada = new Scanner(System.in);
	public static int conta;
	public static int senha;
	private static int cc1 = 555, psw1=999;
	public static int index = 5;
	public static char ast = '*';
	
	public static int Conta()
	{
		System.out.println("Insira o numero da conta: ");
		conta = entrada.nextInt();
		return conta;
	}
	
	public static int Senha ()
	{
		System.out.println("Insira sua senha: ");
		senha = entrada.nextInt();
		return senha;
	}
	
	private static void preOp(int cc2, int psw2)
	{
		if (cc2==cc1)
		{
			if (psw2 == psw1)
			{
				preOp2();
			}else 
			{
				acao99();
			}
		}else
		{
			acao99();
		}
	}
	private static void preOp2()
	{
		Escreva(4);
		Escreva(2);
		Escreva(4);
		Operacao();
	}
	
	private static void Operacao()
	{
		int saida;
		boolean crt = false;
		do {
		Escreva(6);
		Escreva(1);
		saida = entrada.nextInt();
		
				switch (saida)
				{
				case 1 :
					//ver conta
					break;
				case 2 :
					//retirar dinheiro
					break;
				case 3:
					//adicionar dinheiro
					break;
				case 4:
					//sair
				default :
					pJ();
					System.out.println("Escolha um numero valido!");
					break;
						
				}
		}while (crt != true);
		
	}
	
	public static void acao99()
	{
		System.out.println("\n não foi porssivel realizar a operação ");
		System.exit(0);
	}
	public static void Escreva(int opt)
	{
		
		pJ();
		
		switch (opt)
		{
		case 1 :
			System.out.println("1 - ver conta ");
			System.out.println("2 - retirar fundos");
			System.out.println("3 - adicionar fundos");
			System.out.println("4 - terminar trasnação ");
			System.out.println("escolha:");
			break;
		case 2 :
			System.out.println("ATM machine");
			break;
		case 3 :
			System.out.println("Obrigado por usar nossos serviços");
			break;
		case 4:
			pJ();
			for (int i = 1; i>= index; i++)
			{
				for (int j =1 ; j >= i ;j++ )
				{
					System.out.println(ast);
				}
			}pJ();
			break;
		case 5 :
			System.out.println("Algum erro foi detectado");
			break;
		case 6 : 
			for (int i = 1 ; i>= index; i++) {System.out.println(ast); pJ();}
			break;
		
		}
	}
	
	public static void pJ()
	{
		System.out.println("\n");
	}
	public static void iniciarAtm()
	{
		int conta1;
		int senha1;
		conta1 = Conta();
		senha1 = Senha();
		preOp(conta1, senha1);
	
	}
	public static void main (String [] args)
	{
		//Scanner in = new Scanner(System.in);
		
		System.out.println("Caixa eletronico 1 \n");
		iniciarAtm();
		
		
		
	}

}
