package curso.java.executavel;

public class SplitArray {

	public static void main(String[] args) {

         String texto = "Jhonatan, curso Java, 80, 70, 90, 89";

         String valor[] = texto.split(",");
                  
         System.out.println("Nome: " + valor[0]);
         System.out.println("Curso: " + valor[1]);
         System.out.println("Nota 1: " + valor[2]);
         System.out.println("Nota 2: " + valor[3]);
         System.out.println("Nota 3: " + valor[4]);

	}

}
