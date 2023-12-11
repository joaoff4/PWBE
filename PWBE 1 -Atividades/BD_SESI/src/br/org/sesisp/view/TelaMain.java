package br.org.sesisp.view;

import java.util.Scanner;
import br.org.sesisp.dao.CrudDAO;
import br.org.sesisp.model.Aluno;

public class TelaMain {

public static void main(String[] args) {
	/* EXEMPLO APRESENTADO EM SALA
	//instanciar um obj da class CrudDAO
	CrudDAO inserir_aluno = new CrudDAO();
	//instanciar um obj aluno
	Aluno aluno1 = new Aluno();
	aluno1.setNome("Antonio");
	aluno1.setIdade(23);
	inserir_aluno.create(aluno1);
	System.out.println("Nome: " + aluno1.getNome());
	System.out.println( "Idade: " + aluno1.getIdade());
	//************************************************
	//Atualizar valores
	aluno1.setNome("Marcelo Vieira");
	aluno1.setIdade(18);
	aluno1.setRa(1);
	inserir_aluno.update(aluno1);
	System.out.println("Nome: " + aluno1.getNome());
	System.out.println( "Idade: " + aluno1.getIdade());
	//************************************************
	//varrendo a lista
	System.out.println("Lendo a lista..");
	for(Aluno olho : inserir_aluno.read()){
	System.out.println("Dados do aluno: " + olho.getRa() + olho.getNome() + olho.getIdade());
	}
	//************************************************
	//excluindo
	CrudDAO remover_aluno = new CrudDAO();
	remover_aluno.delete(1);
	//ALTER TABLE alunos AUTO_INCREMENT = 1;*/
	
	//FEITO COM O CONTEÙDO APRENDIDO
	Scanner entrada = new Scanner(System.in);
	CrudDAO  iA = new CrudDAO();
	Aluno a1 = new Aluno();
	int i = 0;
	while(i<5) {
		System.out.println("O que voce deseja realizar?" + "\n1-Adicionar Aluno" + "\n2-Atualizar Aluno"
				+ "\n3-Lista de Alunos" + "\n4-Excluir aluno" + "\n5-Parar programa");
		i = entrada.nextInt();
		switch(i) {
		case 1:
		System.out.println("Insira o nome do aluno: ");
		a1.setNome(entrada.next());
		System.out.println("Insira a idade do aluno: ");
		a1.setIdade(entrada.nextInt());
		System.out.println("Nome: " + a1.getNome() + "\nIdade: " + a1.getIdade() /*+ "\nRA: " + a1.getRa()*/);
		iA.create(a1);
		break;
		case 2:
		System.out.println("Insira o nome do aluno: ");
		a1.setNome(entrada.next());
		System.out.println("Insira a idade do aluno: ");
		a1.setIdade(entrada.nextInt());
		System.out.println("Insira o RA do aluno: ");
		a1.setRa(entrada.nextInt());
		iA.update(a1);
		System.out.println("Nome: " + a1.getNome() + "\n Idade: " + a1.getIdade() + "\nRA: " + a1.getRa());	
		break;
		case 3:
		for(Aluno obs : iA.read()) {
		System.out.println("Dados do aluno: \nRA: " + obs.getRa() + "\nNome: " + obs.getNome() + "\nIdade: " +  obs.getIdade());
		}
		break;
		case 4:
		System.out.println("Qual o RA do aluno que voce deseja excluir:");
		int a = 0;
		a =entrada.nextInt();
		CrudDAO remover_aluno = new CrudDAO();
		remover_aluno.delete(a);
		break;
		case 5:
		break;
		}
	}
	}
}
