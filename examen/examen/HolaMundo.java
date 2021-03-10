// ** IMPORTANTE ** //
// Entradas se encuentras deshabilitadas //
// codigo fue creado y compilado en sublimetext //
// solo activar las entradas al ejecutar en IDE //
// variables asignadas por defecto para motivo de prueba y gestion de errores //

import java.util.Scanner;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;



public class HolaMundo {

	public static void main(String[] args) {
		System.out.println("hola");	
		System.out.println("Hola Mundo");
		int uwu = hola(10);

		System.out.println(uwu);
		Scanner sc = new Scanner(System.in);
		// entrada de name
        //String name = sc.nextLine();
        String name = "Javier";
        System.out.println(name + " " + uwu);
        data();
        System.out.println(uwu);

	}

	public static int hola(int num){
		int total;
		total = num-3;
  	//funcionamiento debe ser escrito aqui....
		System.out.println("enviando total....");
  		return total;
	}

	public static void data(){
		try {
            String ruta = "folder/filename.txt";
            String contenido = "Contenido de ejemplo";
            File file = new File(ruta);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
        	}
        	String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        	FileWriter fw = new FileWriter(file);
	        BufferedWriter bw = new BufferedWriter(fw);
			for (String i : cars) {
	  			System.out.println(i);
	  			
	            bw.write(i);
	             
	            
			}
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
	}

	public static void formet(){
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		for (String i : cars) {
  		System.out.println(i);
		}

	}
}

