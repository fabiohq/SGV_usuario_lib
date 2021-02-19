package co.com.usuariolib.helpers;

import java.util.Calendar;

public class Util {
	private Util() {
		
	}
	public static String getPk(Calendar c) {
 
		return getInt()
				+getDia(c)
				+getMes(c)
				+getYear(c)
				+getHora(c)
				+getMinutos(c)
				+getSegundos(c)
				+getMiliSegundos(c);
		
				
	}
	
	//Retorna Valor entre 10 y 99, ambos incluidos.
	private static String getInt() {
		int valorEntero = (int) Math.floor(Math.random()*(10-99+1)+99);
		return valorEntero+"";
	}	
	private static String getYear(Calendar c) {
		return c.get(Calendar.YEAR)+"";
	}
	private static String getMes(Calendar c) {
		return (c.get(Calendar.MONTH)+1)+"";
	}
	private static String getDia(Calendar c) {
		return c.get(Calendar.DAY_OF_MONTH)+"";
	}
	private static String getHora(Calendar c) {
		return c.get(Calendar.HOUR_OF_DAY)+"";
	}
	private static String getMinutos(Calendar c) {
		return c.get(Calendar.MINUTE)+"";
	}
	private static String getSegundos(Calendar c) {
		return c.get(Calendar.SECOND)+"";
	}
	private static String getMiliSegundos(Calendar c) {
		return c.get(Calendar.MILLISECOND)+"";
	}
	
	public static void main(String[] args) {
		while(true) {
			/*
			 * System.out.println(getYear()); System.out.println(getMes());
			 * System.out.println(getDia()); System.out.println(getHora());
			 * System.out.println(getMinutos()); System.out.println(getSegundos());
			 * System.out.println(getMiliSegundos());
			 */
		//while(true) {
		Calendar c = Calendar.getInstance();
		String r = getPk(c);
		System.out.println(r);
		}
	}
	
	
}
