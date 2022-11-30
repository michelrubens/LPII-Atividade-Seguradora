package classes;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcao = 1;

		String nome = "";
		int numApolice = 0;
		String endereco = "";
		String cidade = "";
		String estado = "";
		String cep = "";
		float valor = 0;
		float premio = 0;
		String beneficiario = "";
		int dia = 0;
		int mes = 0;
		int ano = 0;
		int deducaoAutomovel = 0;
		int numLicenca = 0;
		String estadoAuto = "";
		String modelo = "";
		int anoAuto = 0;
		int deducaoCasa = 0;
		int anoConstrucao = 0;
		
		ArrayList<SeguroVida> sv = new ArrayList<SeguroVida>();
		ArrayList<SeguroAuto> sa = new ArrayList<SeguroAuto>();
		ArrayList<SeguroCasa> sc = new ArrayList<SeguroCasa>();

		Scanner ler = new Scanner(System.in);

		do {
			System.out.println("1. Cadastrar Seguro de Vida\n" +
					"2. Cadastrar Seguro de Auto\n" +
					"3. Cadastrar Seguro da Casa\n" +
					"4. Imprimir Seguros de Vida\n" +
					"5. Imprimir Seguros de Auto\n" +
					"6. Imprimir Seguros de Casa\n" +
					"0. Sair");
			opcao = ler.nextInt();

			if (opcao == 1 ) {
				
				System.out.println("N� Apolice: ");
				numApolice = ler.nextInt();
				System.out.println("Nome: ");
				nome = ler.next();
				System.out.println("Endere�o: ");
				endereco = ler.next();
				System.out.println("Cidade: ");
				cidade = ler.next();
				System.out.println("Estado: ");
				estado = ler.next();
				System.out.println("CEP: ");
				cep = ler.next();
				System.out.println("Valor: ");
				valor = ler.nextFloat();
				System.out.println("Pr�mio: ");
				premio = ler.nextFloat();
				System.out.println("Benefici�rio: ");
				beneficiario = ler.next();
				System.out.println("Data de nascimento:");
				System.out.println("\nDia: ");
				dia = ler.nextInt();
				System.out.println("M�s: ");
				mes = ler.nextInt();
				System.out.println("Ano: ");
				ano = ler.nextInt();
				
				sv.add(new SeguroVida(numApolice, nome, new Endereco(endereco, cidade, estado, cep),
						valor, premio, beneficiario, new Data(dia, mes, ano)));

			}
			if (opcao == 2) {
				
				System.out.println("N� Apolice: ");
				numApolice = ler.nextInt();
				System.out.println("Nome: ");
				nome = ler.next();
				System.out.println("Endere�o: ");
				endereco = ler.next();
				System.out.println("Cidade: ");
				cidade = ler.next();
				System.out.println("Estado: ");
				estado = ler.next();
				System.out.println("CEP: ");
				cep = ler.next();
				System.out.println("Valor: ");
				valor = ler.nextFloat();
				System.out.println("Pr�mio: ");
				premio = ler.nextFloat();
				System.out.println("Dedu��o Autom�vel: ");
				deducaoAutomovel = ler.nextInt();
				System.out.println("N�mero da Licen�a: ");
				numLicenca = ler.nextInt();
				System.out.println("Estado: ");
				estadoAuto = ler.next();
				System.out.println("Modelo: ");
				modelo = ler.next();
				System.out.println("Ano: ");
				anoAuto = ler.nextInt();

				sa.add(new SeguroAuto(numApolice, nome, new Endereco(endereco, cidade, estado, cep),
						valor, premio, deducaoAutomovel, numLicenca, estadoAuto, modelo, anoAuto));

			}
			if (opcao == 3) {	
				
				System.out.println("N� Apolice: ");
				numApolice = ler.nextInt();
				System.out.println("Nome: ");
				nome = ler.next();
				System.out.println("Endere�o: ");
				endereco = ler.next();
				System.out.println("Cidade: ");
				cidade = ler.next();
				System.out.println("Estado: ");
				estado = ler.next();
				System.out.println("CEP: ");
				cep = ler.next();
				System.out.println("Valor: ");
				valor = ler.nextFloat();
				System.out.println("Pr�mio: ");
				premio = ler.nextFloat();
				System.out.println("Dedu��o: ");
				deducaoCasa = ler.nextInt();
				System.out.println("Ano de Constru��o: ");
				anoConstrucao = ler.nextInt();
				
				sc.add(new SeguroCasa(numApolice, nome, new Endereco(endereco, cidade, estado, cep),
						valor, premio, deducaoCasa, anoConstrucao));

			}	
			if (opcao == 4) {
				mostrarSV(sv);
			}
			if (opcao == 5) {
				mostrarSA(sa);
			}
			if (opcao == 6) {
				mostrarSC(sc);
			}
		} while (opcao != 0);
	}
	
	public static void mostrarSV(ArrayList<SeguroVida> lista) {
		for (SeguroVida item : lista) {
			System.out.printf("%s\n", item.toString());
		}
	}
	public static void mostrarSA(ArrayList<SeguroAuto> lista) {
		for (SeguroAuto item : lista) {
			System.out.printf("%s\n", item.toString());
		}
	}
	public static void mostrarSC(ArrayList<SeguroCasa> lista) {
		for (SeguroCasa item : lista) {
			System.out.printf("%s\n", item.toString());
		}
	}
}
