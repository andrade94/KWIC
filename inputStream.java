import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class inputStream {

    public static void main(String[] args) {
       	Scanner scanner = new Scanner(System.in);
    	System.out.print("File: Leer archivo\nConsola: Leer de consola\nExit: Si deseas terminar.\n");
    	List<String> Sentences = new ArrayList<String>();
    	boolean cycle = true;
    	while (cycle) {
	    	String input = scanner.nextLine();
	 		switch (input.toLowerCase()) {
	 			case "consola":
	 				Sentences = new inputStream().readLinesFromConsole();
	 				cycle = false;
	 				break;
	 			case "file":
	 				System.out.print("File.\n");
	 				cycle = false;
	 				break;
	 			case "exit":
	 				System.out.print("Hasta luego.\n");
	 				return;
	 			default:
	 				System.out.print("Inválido.\n");
	 				break;
	 		}
    	}
    	System.out.println(Sentences);
    }

    private List<String> readLinesFromConsole() {
    	List<String> sentences = new ArrayList();
    	String sentence = "";
    	while (!sentence.toLowerCase().equals("exit")) {
    		System.out.print("Escribe una oración ó exit para salir:");
            Scanner scanner = new Scanner(System.in);
            sentence = scanner.nextLine();
            if (!sentence.toLowerCase().equals("exit") && !sentence.isEmpty()) {
                sentences.add(sentence);
            }
    	}
    	return sentences;
    }
}