package modelo;

import static javax.swing.JOptionPane.*;
import java.util.Scanner;

public class Principal {
	static	final String []normal={
			"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U",
			"V","W","X","Y","Z",
			" ",
			"1","2","3","4","5","6","7","8","9","0"
			};
	
	static final String []morse={
		".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.",
		"---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..",
		"  ",
		".----","..---","...--","....-",".....","-....","--...","---..","----.","-----"
		};
	
	static char [] letra;
   	static String [] simbolo;
	
	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
	    String cadena;
	    
		   System.out.println("__Menu__\n 1.-Texto a Codigo Morse\n 2.- Codigo Morse a Texto\n");
		   int opcion=Integer.parseInt(escaner.nextLine());
		   switch (opcion) {
				case 1:
					System.out.println("Ingrese una cadena (puede incluir numeros): ");
					cadena=escaner.nextLine().toUpperCase();
					System.out.println(Principal.txtMorse(cadena));
					break;
				case 2:
					System.out.println("Ingrese una cadena morse (puede icluir numeros): ");
					cadena=escaner.nextLine().toUpperCase();
					System.out.println(Principal.morseTxt(cadena));
					break;
				default:
					System.out.println("Opcion no valido ");
			}
	    
	}
	
	private static String txtMorse (String cadena){
		String txtMorse="";
		letra=cadena.toCharArray();
		for(int i=0;i<letra.length;i++){
			switch(letra[i]) {
				case 'A':
					txtMorse=txtMorse+" "+morse[0];
					break;
				case 'B':
					txtMorse=txtMorse+" "+morse[1];
					break;
				case 'C':
					txtMorse=txtMorse+" "+morse[2];
					break;
				case 'D':
					txtMorse=txtMorse+" "+morse[3];
					break;
				case 'E':
					txtMorse=txtMorse+" "+morse[4];
					break;
				case 'F':
					txtMorse=txtMorse+" "+morse[5];
					break;
				case 'G':
					txtMorse=txtMorse+" "+morse[6];
					break;
				case 'H':
					txtMorse=txtMorse+" "+morse[7];
					break;
				case 'I':
					txtMorse=txtMorse+" "+morse[8];
					break;
				case 'J':
					txtMorse=txtMorse+" "+morse[9];
					break;
				case 'K':
					txtMorse=txtMorse+" "+morse[10];
					break;
				case 'L':
					txtMorse=txtMorse+" "+morse[11];
					break;
				case 'M':
					txtMorse=txtMorse+" "+morse[12];
					break;
				case 'N':
					txtMorse=txtMorse+" "+morse[13];
					break;
				case 'O':
					txtMorse=txtMorse+" "+morse[14];
					break;
				case 'P':
					txtMorse=txtMorse+" "+morse[15];
					break;
				case 'Q':
					txtMorse=txtMorse+" "+morse[16];
					break;
				case 'R':
					txtMorse=txtMorse+" "+morse[17];
					break;
				case 'S':
					txtMorse=txtMorse+" "+morse[18];
					break;
				case 'T':
					txtMorse=txtMorse+" "+morse[19];
					break;
				case 'U':
					txtMorse=txtMorse+" "+morse[20];
					break;
				case 'V':
					txtMorse=txtMorse+" "+morse[21];
					break;
				case 'W':
					txtMorse=txtMorse+" "+morse[22];
					break;
				case 'X':
					txtMorse=txtMorse+" "+morse[23];
					break;
				case 'Y':
					txtMorse=txtMorse+" "+morse[24];
					break;
				case 'Z':
					txtMorse=txtMorse+" "+morse[25];
					break;
				case ' ':
					txtMorse=txtMorse+morse[26];
					break;
				case '1':
					txtMorse=txtMorse+" "+morse[27];
					break;
				case '2':
					txtMorse=txtMorse+" "+morse[28];
					break;
				case '3':
					txtMorse=txtMorse+" "+morse[29];
					break;
				case '4':
					txtMorse=txtMorse+" "+morse[30];
					break;
				case '5':
					txtMorse=txtMorse+" "+morse[31];
					break;
				case '6':
					txtMorse=txtMorse+" "+morse[32];
					break;
				case '7':
					txtMorse=txtMorse+" "+morse[33];
					break;
				case '8':
					txtMorse=txtMorse+" "+morse[34];
					break;
				case '9':
					txtMorse=txtMorse+" "+morse[35];
					break;
				case '0':
					txtMorse=txtMorse+" "+morse[36];
					break;
		    }
		}
		return txtMorse;
	} 
	
	private static String morseTxt (String cadena){
		String morseTxt="";
		simbolo=cadena.split(" ");
		for(int i=0;i<simbolo.length;i++){
			switch (simbolo[i]) {
			case ".-":
				morseTxt=morseTxt+normal[0];
				break;
			case "-...":
				morseTxt=morseTxt+normal[1];
				break;
			case "-.-.":
				morseTxt=morseTxt+normal[2];
				break;
			case "-..":
				morseTxt=morseTxt+normal[3];
				break;
			case ".":
				morseTxt=morseTxt+normal[4];
				break;
			case "..-.":
				morseTxt=morseTxt+normal[5];
				break;
			case "--.":
				morseTxt=morseTxt+normal[6];
				break;
			case "....":
				morseTxt=morseTxt+normal[7];
				break;
			case "..":
				morseTxt=morseTxt+normal[8];
				break;
			case ".---":
				morseTxt=morseTxt+normal[9];
				break;
			case "-.-":
				morseTxt=morseTxt+normal[10];
				break;
			case ".-..":
				morseTxt=morseTxt+normal[11];
				break;
			case "--":
				morseTxt=morseTxt+normal[12];
				break;
			case "-.":
				morseTxt=morseTxt+normal[13];
				break;
			case "---":
				morseTxt=morseTxt+normal[14];
				break;
			case ".--.":
				morseTxt=morseTxt+normal[15];
				break;
			case "--.-":
				morseTxt=morseTxt+normal[16];
				break;
			case ".-.":
				morseTxt=morseTxt+normal[17];
				break;
			case "...":
				morseTxt=morseTxt+normal[18];
				break;
			case "-":
				morseTxt=morseTxt+normal[19];
				break;
			case "..-":
				morseTxt=morseTxt+normal[20];
				break;
			case "...-":
				morseTxt=morseTxt+normal[21];
				break;
			case ".--":
				morseTxt=morseTxt+normal[22];
				break;
			case "-..-":
				morseTxt=morseTxt+normal[23];
				break;
			case "-.--":
				morseTxt=morseTxt+normal[24];
				break;
			case "--..":
				morseTxt=morseTxt+normal[25];
				break;
			case "   ":
				morseTxt=morseTxt+normal[26];
				break;
			case ".----":
				morseTxt=morseTxt+normal[27];
				break;
			case "..---":
				morseTxt=morseTxt+normal[28];
				break;
			case "...--":
				morseTxt=morseTxt+normal[29];
				break;
			case "....-":
				morseTxt=morseTxt+normal[30];
				break;
			case ".....":
				morseTxt=morseTxt+normal[31];
				break;
			case "-....":
				morseTxt=morseTxt+normal[32];
				break;
			case "--...":
				morseTxt=morseTxt+normal[33];
				break;
			case "---..":
				morseTxt=morseTxt+normal[34];
				break;
			case "----.":
				morseTxt=morseTxt+normal[35];
				break;
			case "-----":
				morseTxt=morseTxt+normal[36];
				break;

			default:
				break;
			}
		}
		return morseTxt;
	} 

}

