package curso.java.executavel;

import java.util.Arrays;
import java.util.List;

public class SplitArray {

	public static void main(String[] args) {

         String texto = "Jhonatan, curso Java, 80, 70, 90, 89";

         /*Convertendo um String em uma array*/
         String valor[] = texto.split(",");
                  
         System.out.println("Nome: " + valor[0]);
         System.out.println("Curso: " + valor[1]);
         System.out.println("Nota 1: " + valor[2]);
         System.out.println("Nota 2: " + valor[3]);
         System.out.println("Nota 3: " + valor[4]);

         /*Convertendo uma array em uma lista*/
         
         List<String> list = Arrays.asList(valor);
         
         for (String valorString : list) {
			System.out.println(valorString);
		}
         
         /*Converter uma lista para Array*/
         
         String [] conversaoArray = list.toArray(new String [6]);
         System.out.println(conversaoArray);
         
         for(int pos = 0; pos < conversaoArray.length;pos++) {
        	 System.out.println(conversaoArray[pos]);
         }
	}

}
