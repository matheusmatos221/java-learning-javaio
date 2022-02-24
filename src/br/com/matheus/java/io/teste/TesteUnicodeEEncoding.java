package br.com.matheus.java.io.teste;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEEncoding {
	public static void main(String[] args) throws IOException {
		String s = "C";
		// "Printa" o código decimal ASCII
		System.out.println(s.codePointAt(0)); //67 = Letra C
		
		// Charset padrão do sistema operacional
		Charset charset = Charset.defaultCharset();
		System.out.println(charset.displayName()); //UTF-8
		
		// Guarda os bytes em um array com charset forçado para 'windows-1252'
		byte[] bytes = s.getBytes("windows-1252");
		System.out.println(bytes.length + ", windows-1252");
		String sNovo = new String(bytes, "windows-1252");
		System.out.println(sNovo);		
		
		// Guarda os bytes em um array com charset forçado para 'UTF-16'
		bytes = s.getBytes("UTF-16");
		System.out.println(bytes.length + ", UTF-16");
		sNovo = new String(bytes, "windows-1252");
		System.out.println(sNovo);
		
		// Guarda os bytes em um array com charset forçado para 'US_ASCII'
		bytes = s.getBytes(StandardCharsets.US_ASCII);
		System.out.println(bytes.length + ", US_ASCII");
		sNovo = new String(bytes, "windows-1252");
		System.out.println(sNovo);
		
	}
}
