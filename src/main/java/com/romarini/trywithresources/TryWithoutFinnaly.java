package com.romarini.trywithresources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TryWithoutFinnaly {

	public static void main(String[] args) {

		/*
		 * Try With Resource Statement
		 * Não requer finally para executar o close()
		 * O recurso passa a ser gerenciado pelo próprio bloco try, que se encarrega
		 * de liberar recursos I/O utilizado na leitura do file.
		 * 
		 */
		try(FileInputStream ins = new FileInputStream("arquivo.txt")){
			ins.read();
		}catch(IOException  e){ 
			e.printStackTrace();
		}


		/*
		 * Tratamento de multiplas exceptions no bloco catch
		 */
		try{
			Class.forName("");
			DriverManager.getConnection("url");
			boolean file = new File("arq.txt").createNewFile();
			new Date();
		}catch(ClassNotFoundException | IOException | SQLException e){
			e.printStackTrace();
		}
		
		
		/*
		 * Simplified Generics 
		 */
		List<String> list7 = new ArrayList<>();
	}

}
