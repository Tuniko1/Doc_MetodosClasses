package entities;

public class Pessoa {
	public String nome;
	public int idade;
	public char sexo;
	
		
	 public void retornaIdade(int anoInserido, int anoAtual) {
		 anoAtual = 2023;
		 idade = anoAtual - anoInserido;
			
		}
	 public void atualizaNome(String nomeInserido) {
		 nome =  nomeInserido + " Pereira";
			
		}
	
}
