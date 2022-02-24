package br.com.matheus.java.io.teste;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TesteLeitura2 {
	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(new File("contas.csv"));
		
		while(scan.hasNextLine()) {
			String linha = scan.nextLine();
			System.out.println(linha);
		}
		scan.close();
		
		
	}
}
