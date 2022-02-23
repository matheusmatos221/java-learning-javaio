package br.com.matheus.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteLeitura {

	public static void main(String[] args) throws IOException {
		// Instancia inputs e readers
		InputStream fis = new FileInputStream("lorem.txt");
		Reader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		// lê primeira linha
		String linha = br.readLine();
				
		// "printa" enquanto readLine tiver dados
		while(linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		}
		// fecha o buffer
		br.close();
		
	}

}
