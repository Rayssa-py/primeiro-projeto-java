package br.edu.principal;

public class principal {
  public static void main(String[] args) {
		String nome, situacao;
		double n1, n2,af,mf, media;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		nome = sc.next();
		System.out.println("digite N1: ");
		n1 = sc.nextDouble();
		System.out.println("digite N2: ");
		n2 = sc.nextDouble();
		media = (n1+n2)/2;
		
		if (media>= 6) {
			situacao = "aprovado";
		}
		else {
			if (media >= 3) {
				situacao = "recuperação";
				System.out.println("situação: " + situacao);
				System.out.println("Digite a nota da AF : ");
				af = sc.nextDouble();
				mf = (af+media)/2;
				
				if (mf>= 5) {
					situacao = "aprovado na recuperação";
			
				}
				else {
					situacao = "reprovado na recuperação";
				}
				
					}
				
			else {
				situacao = "Reprovado";
			}
		}
		
		System.out.println("Nome: " + nome + " | Média: " + media);
		System.out.println("Você está: " + situacao);
	}
}
