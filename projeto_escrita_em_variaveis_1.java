package projeto_em_java_1;
import java.util.Scanner;

public class projeto_escrita_em_variaveis_1 
{
	public static void main (String args[])
	{
		int i =0;
		int j = 10;
		boolean c1=true;
		String [] nome1 = new String [j+1];
		char  [] s = new char [j+1];
		Scanner in = new Scanner(System.in);
		
		System.out.println ("Programa leitura para variaveis");
					for (i=0;i<=5;i++)
		
					{
						boolean c = true;
						String a1 = "*";
						String ar=a1.repeat(i);
						System.out.println(ar);
					};
		
					if(c1!=false)
					{
						int j1=nome1.length;
						//j1--;
						System.out.println("j1 "+j1);
						int j2 = 0;
						boolean d = true;
						
									while (d != false)
									{	
										System.out.println("j1 "+j1+" j "+j+" j2 "+j2);
										System.out.println("Escreva o nome para a posição "+j2+"°");
										nome1[j2] = in.nextLine();
										j1--;
										j2++;
										
													if(j1<= 1)
													{
															d=false;
													}
									}
									if(d==false)
									{
										c1=false;
									}
						}
			
				
			for (int i2 = nome1.length; i2>= 0; i2--)
			{
				System.out.println("valor de nome "+i2+":"+nome1[i2]);
			}
			
	System.exit(0);
	}
			
}

//i++;
//System.out.print("/-*+");

//String t1 = null;

//while  (i>= 5) 
//for(i=0;  i==5 || i <5; i++)
//if (i >5 && i==5)