package br.com.matheus.java.io.teste;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacaoCliente {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
// .1
		// Controi objeto
//		Cliente cliente = new Cliente();
//		cliente.setNome("Matheus");
//		cliente.setProfissao("Dev");
//		cliente.setCpf("12312312323");
		
		// ObjectWrite
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
//		oos.writeObject(cliente);
//		oos.close();
		
// .2
		// ObjectRead
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
		Cliente cliente = (Cliente) ois.readObject();
		ois.close();
		System.out.println(cliente.getNome());
		
		
	}
}
