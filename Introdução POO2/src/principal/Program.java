package principal;

import java.util.Scanner;
import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o nome: ");
		p.nome = sc.nextLine();
		
		System.out.println("Insira o ano do nascimento: ");
		int ano = sc.nextInt();
		
		System.out.println("Insira o sexo: ");
		p.sexo = sc.next().charAt(0);
		
		p.retornaIdade(ano,2023);
		p.atualizaNome(p.nome);
		
		System.out.println("Nome: "+p.nome);
		System.out.println("Idade: "+p.idade);
		System.out.println("Sexo: "+p.sexo);
		sc.close();
	}

}
