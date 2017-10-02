import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class inputStream {

    public static void main(String[] args) {
        new inputStream().start();
    }

    public void start() {
    	Scanner scanner = new Scanner(System.in);
    	System.out.print("Escribe --file-- si leerás de archivo o --consola-- si escribirás.\n");
    	String input = scanner.nextLine();
    	List<String> sentences;
 		switch (input.toLowerCase()) {
 			case "consola":
 				sentences = readInput();
 				break;
 			case "file":
 				System.out.print("File\n");
 				break;
 			default:
 				System.out.print("Invalido.\n");
 				break;
 		}
    	System.out.print(sentences);
    }

    private List<String> readInput() {
    	List<String> sentences = new ArrayList();
    	String sentence = "";
    	while (!sentence.equalsIgnoreCase("q")) {
    		System.out.print("Escribe una oración (o 'q' para salir) => ");
            Scanner input = new Scanner(System.in);
            sentence = input.nextLine();
            if (!sentence.equalsIgnoreCase("q") && !sentence.isEmpty()) {
                sentences.add(sentence);
            }
    	}
    	return sentences;
    }
}