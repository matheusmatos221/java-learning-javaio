package br.com.matheus.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {
//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);

		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
		
		for(int i = 1; i<5; i++) {
			bw.write("Linha - " + i);
			bw.write(System.lineSeparator());
		}
		bw.close();
		
	}

}
