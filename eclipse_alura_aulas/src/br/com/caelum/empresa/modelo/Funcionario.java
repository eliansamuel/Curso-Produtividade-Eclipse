package br.com.caelum.empresa.modelo;

import java.util.Calendar;

public class Funcionario {
	
	private String name;
	private int matricula;
	private Calendar data;
	
	public Funcionario(String name, int mat, Calendar data) {
		this.name = name;
		this.matricula = mat;
		this.data = data;
	}
	@Override
	public String toString() {
		return "Funcionario: " + name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public Calendar getData() {
		return data;
	}
	public void setData(Calendar data) {
		this.data = data;
	}
	
}
