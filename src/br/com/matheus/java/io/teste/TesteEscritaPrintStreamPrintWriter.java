package br.com.matheus.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;

public class TesteEscritaPrintStreamPrintWriter {

	public static void main(String[] args) throws IOException {
//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);

		PrintStream ps = new PrintStream("lorem2.txt");
		
		for(int i = 1; i<8; i++) {
			ps.println("Linha - " + i);
		}
		ps.close();
		
	}

}
