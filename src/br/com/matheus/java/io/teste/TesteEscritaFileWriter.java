package br.com.matheus.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {
//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);

		FileWriter fw = new FileWriter("lorem2.txt");
		// FileWriter is a Writer
		// we use BufferedWriter to get .newline() and other methods
		BufferedWriter bw = new BufferedWriter(fw);
		
		for(int i = 1; i<10; i++) {
			bw.write("Linha - " + i);
			bw.write(System.lineSeparator());
		}
		bw.close();
		
	}

}
