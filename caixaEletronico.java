package projeto_caixa_eletronico_1;
import java.util.Scanner;

public class caixaEletronico 
{
	private double totalBal = 100;
	Scanner input = new Scanner (System.in);
	
	public int userAccount()
	{
		System.out.println("entrar numero conta");
		int conta;
		conta= input.nextInt();
		return conta;
	}
	
	public int userPin()
	{
		System.out.println("digite o pin");
		int pin;
		pin =input.nextInt();
		return pin;
	}


	public void iniciarCaixa()
	{
		userAccount();
		userPin();
		drawMainMenu();
		
	}
	public void drawMainMenu()
	{
		int selection;
		System.out.println("\nATM main menu");
		System.out.println("1 - ver conta ");
		System.out.println("2 - retirar fundos");
		System.out.println("3 - adicionar fundos");
		System.out.println("4 - terminar trasnação ");
		System.out.println("escolha:");
		selection = input.nextInt();
		
		switch(selection)
		{
		case 1 :
			viewAccountInfo();
			break;
		case 2 :
			withdraw();
			break;
		case 3 :
			addFunds();
			break;
		case 4 :
			System.out.println("Fim da execução");
			
		}
	}
	
	public void viewAccountInfo()
	{
		System.out.println("info conta");
		System.out.println("\t--total balance:$"+totalBal);
		drawMainMenu();
	}
	public void deposit (int depAmount)
	{
		System.out.println("\n inserir valor: ");
		totalBal=totalBal+depAmount;
	}
	public void checkNsf(int withdrawAmount)
	{
		if(totalBal-withdrawAmount<0)
		{
			System.out.println("valores insuficientes");
			
		}else
		{
			totalBal=totalBal-withdrawAmount;
			System.out.println("tirar dinheiro agora");
		}
	}
	public void addFunds()
	{
		int addSelection;
		System.out.println("deposito");
		System.out.println("1 - 20");
		System.out.println("2 - 40");
		System.out.println("3- 60");
		System.out.println("4 - 100");
		System.out.println("5- voltar para menu");
		System.out.println("escolha: ");
		addSelection = input.nextInt();
		
		switch(addSelection)
		{
		case 1 :
			deposit(20);
			drawMainMenu();
			break;
		case 2 :
			deposit(40);
			drawMainMenu();
			break;
		case 3 :
			deposit(60);
			drawMainMenu();
			break;
		case 4:
			deposit (100);
			drawMainMenu();
			break;
		case 5:
			drawMainMenu();
			break;
		}
	}
	
	public void withdraw()
	{
		int withdrawSelection;
		
		System.out.println("\n dinherio a retirar");
		System.out.println("1- 20");
		System.out.println("2- 40");
		System.out.println("3- 60");
		System.out.println("4- 100");
		System.out.println("5- voltar ao menu");
		System.out.println("Escolha: ");
		withdrawSelection=input.nextInt();
		
		switch(withdrawSelection)
		{
		case 1:
			checkNsf(20);
			drawMainMenu();
			break;
		case 2:
			checkNsf(40);
			drawMainMenu();
			break;
		case 3 :
			checkNsf(60);
			drawMainMenu();
			break;
		case 4 :
			checkNsf(100);
			drawMainMenu();
			break;
		case 5:
			drawMainMenu();
			break;
		}
		
	}
	
	public static void main(String[]args)
	{
		caixaEletronico meuCaixa = caixaEletronico();
		meuCaixa.iniciarCaixa();
		
	}

	private static caixaEletronico caixaEletronico() 
	{
		// TODO Auto-generated method stub
		return null;
	}
}

