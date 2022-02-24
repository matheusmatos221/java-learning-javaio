package br.com.matheus.java.io.teste;

import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {
	public static void main(String[] args) throws IOException{
		//Scanner scan = new Scanner(new File("contas.csv"));
		Scanner scan = new Scanner(new File("contas.csv"), "UTF-8");
		
		while(scan.hasNextLine()) {
			String linha = scan.nextLine();
			// Printa linha
			//System.out.println(linha);
			
			Scanner linhaScanner = new Scanner(linha);
			linhaScanner.useDelimiter(",");
			linhaScanner.useLocale(Locale.US);
//			linhaScanner.useLocale(new Locale("pt", "BR"));
			
					
			String tipoConta = linhaScanner.next();
			int agencia = linhaScanner.nextInt();
			int numero = linhaScanner.nextInt();
			String titular = linhaScanner.next();
            double saldo = linhaScanner.nextDouble();
			
			String formatado = String.format("Tipo de Conta:%s | Agencia:%04d | Número:%08d "
					+ "| Titular:%s | Saldo:%05.2f", 
					tipoConta, agencia, numero, titular, saldo);
			
//			System.out.println(formatado);			
//			System.out.format("Tipo de Conta:%s | Agencia:%04d | Número:%08d "
//					+ "| Titular:%15s | Saldo:%8.2f%n", 
//					tipoConta, agencia, numero, titular, saldo);
			System.out.format(Locale.US ,"Tipo de Conta:%s | Agencia:%04d | Número:%08d "
					+ "| Titular:%15s | Saldo:%8.2f%n", 
					tipoConta, agencia, numero, titular, saldo);
			linhaScanner.close();
		}
		scan.close();
		
		
	}
}
