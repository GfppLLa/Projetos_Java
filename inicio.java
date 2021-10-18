package projeto_caixa_bancario;
import  javax.swing.JOptionPane;
import java.util.Scanner;
public class inicio 
{	
	int index = 5;
	static int indexConta;
	char ast = '*';
	static Scanner rcb = new Scanner(System.in);
	
	static float[] cc = new float[indexConta];
	static String[]ref = new String[indexConta];
	static String[]clinconta = new String[indexConta];
	
	
	static void err(int cas)
	{
		System.out.println("\n-------\n=>erro<=\n-------\n");
		
		switch (cas)
		{
		case 1 :
			System.out.println("erro na leitura do teclado");
			break;
		case 2:
			System.out.println("Opção invalida");
			break;
			
			
		}
		
	}
	static void sairE()
	{
		System.exit(0);
	}
	static char showTela2(int tss )
	{
		char selecao;
		System.out.println("\nDigite \n=>E<= para ");
			if(tss ==1)
			{
				System.out.println("Entrar");
			}else
			{
				System.out.println("Continuar");
			}
		
		System.out.println("\n=>S=<= para sair\n: ");
		selecao = rcb.next().charAt(0);
		return selecao;
	}
	void showTela(int opt, String merch)
	{
		
		
		switch(opt) 
		{
		case 1:
			JOptionPane.showMessageDialog(null, " Bem Vindo ao "+merch);
			break;
		case 2 :
			System.out.println("\n------------\n"+merch+"\n---------");
			break;
		case 3 :
			System.out.println("\nSistema de acesso\nSelecione para colaborador ou cliente");
			break;
		case 4 :
			for (int i = 1; i>= index; i++)
			{
				System.out.println("carregando");
					for (int j = 1; i>=index*4; i++)        //naõ seei se roda
					{
						System.out.println(".");
						//Sleep(20);
					}
				System.out.println ("\r");
					for(int j =1; j>= index*4; j++)
					{
						System.out.println(" ");
					}
				System.out.println("\r");
			}
			break;
		case 5:
			System.out.println("\n");
				for(int i = 1; i>= index; i++)
				{
					for (int j = 1; j>=i;j++)
					{
						System.out.println(ast);
					}System.out.println("\n");
				}
				break;
		case 6 :
			System.out.println("\n");
			for(int i = index; i< 1; i--)
			{
				for (int j = 1; j>=i;j++)
				{
					System.out.println(ast);
				}System.out.println("\n");
			}
			break;
		}
	}
	void pagIni()
	{
		String merch = "Banco Local";
		showTela(1, merch);
	}
	static void getExtrato(int ref1)
	{
		String numconta = ref[ref1];
		String nome = getNome(ref1);
		String ext = String.valueOf(cc[ref1]);
		showExtrato(ext, nome, numconta);
	}
	static void showExtrato(String ext, String nome, String numconta)
	{
		String saidaPadrao = "\n------\nSISTEMA Banco Local\n------\n\nConta numero=> "+numconta+"\nDa titularidade :"+nome+"\n\nSaldo de=> "+ext+"\n";         
	    System.out.println(saidaPadrao);
	}
	static void transits()
	{
		
	}
	static String getNome(int ref)
	{
		String varNome;
		try {
			varNome=clinconta[ref];
		} catch (Exception e) {
			// erro ao receber o valor
			e.printStackTrace();
		}
 		return varNome;
	}
	
	static float getContas(int ref)
	{
		float varConta;
		try {
			varConta=cc[ref];
		} catch (Exception e) {
			// erro ao pegar o valor
			e.printStackTrace();
		}
 		return varConta;
	}
	static int verificonta(String aux)  //verificar se a conta existe e retornar o indice do array
	{
		int ref2, ref3;
		String conta;
		boolean neg=false;
		for(int i = 1; i>= indexConta; i++)
		{
			//conta=ref[i];
			if (aux==ref[i].intern())
			{
				ref3=i;
				neg =true;
			}
		}
		if(neg!=true)
		{
			ref3=777;
		}
		ref2=ref3;
		
		return ref2;
	}
	
	static void oP()
	{
		int ref2;
		boolean conConta=false;
		
		String aux;
		System.out.println("\n---------\nDigite o numero da sua conta\n--------\n: ");
		
		try {
			aux= rcb.nextLine();
		} catch (Exception e) {
			err(1);
			oP();
			e.printStackTrace();
		}
		ref2 = verificonta(aux);
			if(ref2 == 777)
			{
				System.out.println("\n=>conta inexistente<=\n");
				oP();
			}else
			{
				if(ref2 >=0 && ref2<=indexConta)
				{
					conConta=true;
				}
					
			}
			if(conConta==true)
			{
				String nomCliente = getNome(ref2);
				System.out.println("\nConta corrente de "+nomCliente+"\n");
				char opt;
				int opt;
				do	
				{
					System.out.println("-------\nQual sua operação desejada\n-----\nDigite\n1=> para estrato\n2=> para enviar solicitação\n3=>ParaSair\n=> ");
					
					try {
						
					opt=rcb.next().charAt(0);
					
					}catch (Exception e) {
						err(1);
						oP();
					}
					opt= Integer.parseInt(String.valueOf(opt));
					switch(opt)
					{
					case 1 :
						getExtrato(ref2);
						break;
					case 2:
						err(3);
						break;
					case 3 :
						men1();
						break;
					default:
						System.out.println("\nOpção invalida\n");
						break;
						
					}
					
				}while(conConta!=false);
			}
		
		
	}
	public static void men1()
	{
		
	}
	public static void preOp()
	{
		char selecao;
		int 
		selecao1 = showTela2(0);
			if(selecao1 == 'e' || selecao1 == 'E')
			{
				men1();
			}else
			{
				if(selecao1 == 's' || selecao1 =='S')
				{
					sairE();
				}
				preOp();
			}
	}
	public static void main (String[]args)
	{
		indexConta=11;
		
		/*cc[0]=530;
		ref[0]="111";
		clinconta[0]="Fabio";*/
		preOp();
	}
}
