package br.com.caelum.empresa;

import br.com.caelum.empresa.modelo.Funcionario;
import java.util.Calendar;
import java.util.GregorianCalendar;



public class Principal {
	
	public static void main(String[] args) {
		Calendar data = new GregorianCalendar(21, 02, 2000);
		Funcionario Jubileu = new Funcionario("Jubileu", 25, null);
		System.out.println(Jubileu);
	}

}
