package br.com.caelum.empresa;

import java.util.Calendar;
import java.util.GregorianCalendar;

import br.com.caelum.empresa.modelo.Funcionario;
import br.com.caelum.empresa.modelo.Gasto;

public class TestaGasto {
	public static void main(String[] args) {
		Calendar data = new GregorianCalendar(20, 02, 1999);
		Funcionario funcionario = new Funcionario("Mateus", 30, data);
		
		Calendar hoje = Calendar.getInstance();
		Gasto gasto1 = new Gasto(40, "taxi", funcionario, hoje);
		Gasto gasto2 = new Gasto(200, "taxi", funcionario, hoje);
		Gasto gasto3 = new Gasto(45, "taxi", funcionario, hoje);
		System.out.println(gasto1);
		System.out.println(gasto2);
		System.out.println(gasto3);		
	}
}
