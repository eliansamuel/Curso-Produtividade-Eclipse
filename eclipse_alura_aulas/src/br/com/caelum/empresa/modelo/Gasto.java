package br.com.caelum.empresa.modelo;

import java.util.Calendar;
import java.util.Objects;

public class Gasto {
	private double valor;
	private String tipo;
    private Funcionario funcionario;
	private Calendar data;
	
	
	public Gasto(double valor, String tipo, Funcionario funcionario, Calendar data) {
		super();
		this.valor = valor;
		this.tipo = tipo;
		this.funcionario = funcionario;
		this.data = data;
		}

	@Override
	public int hashCode() {
		return Objects.hash(data, funcionario, tipo, valor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gasto other = (Gasto) obj;
		return Objects.equals(data, other.data) && Objects.equals(funcionario, other.funcionario)
				&& Objects.equals(tipo, other.tipo)
				&& Double.doubleToLongBits(valor) == Double.doubleToLongBits(other.valor);
	}

	@Override
	public String toString() {
		return "O gasto foi de R$ " + valor + " de " + tipo + " do " + funcionario;
	}
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	public Calendar getData() {
		return data;
	}
	public void setData(Calendar data) {
		this.data = data;
	}
}
