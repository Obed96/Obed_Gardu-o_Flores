package modelo;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	      String unidad[]={"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
	      String decena[]={"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
	      String centena[]={"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
	      String millar[]={"","M","MM","MMM"};
	      
	      System.out.println("Ingresa numero entre 1 y 3999");
	      int N = sc.nextInt();
	      
	      int u=N%10;
	      int d=(N/10)%10;
	      int c=(N/100)%10;
	      int m=N/1000;
	      
	      if(N>=1000){         
	          System.out.println(millar[m]+centena[c]+decena[d]+unidad[u]);
	      }else{
	          if(N>=100){
	              System.out.println(centena[c]+decena[d]+unidad[u]);          
	          }else{
	        	  if (N>=10) {
					System.out.println(decena[d]+unidad[u]);
				} else {
		              System.out.println(unidad[N]);
				}
	          }          
	      }         
	}

}
