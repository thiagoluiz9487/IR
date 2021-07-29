
public class calculoImposto {
	
	public static void main(String[] args) {
		
		String nome = "";
		String cpf = "";
		int salario;
		double faixa1;
		double faixa2;
		double faixa3;
		int deducao1;
		int deducao2;
		int deducao3;
		
		
		nome = "Thiago";
		cpf = "999.999.999-99";
		salario = 4000;
		faixa1 = 0.075;
		faixa2 = 0.15;
		faixa3 = 0.225;
		deducao1 = 142;
		deducao2 = 350;
		deducao3 = 636;
				
		
		
		if(salario < 1900) {
			System.out.println("Olá "+ nome + "você esta ISENTO da declaração de Imposto de renda");
		}else if (salario >=1900 && salario <= 2799) {
			System.out.println("Olá "+ nome + ". O valor do imposto de renda a ser pago é: "+ (salario*faixa1));
			System.out.println("podendo ser deduzido até R$"+deducao1);
		}else if (salario >=2800 && salario <= 3750) {
			System.out.println("Olá "+ nome + ". O valor do imposto de renda a ser pago é: "+ (salario*faixa2));
			System.out.println("podendo ser deduzido até R$"+deducao2); 
		}else if (salario >=3751 && salario <= 4664) {
			System.out.println("Olá "+ nome + ". O valor do imposto de renda a ser pago é: "+ (salario*faixa3));
			System.out.println("podendo ser deduzido até R$"+deducao3);
		}
	}

}
