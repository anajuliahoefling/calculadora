package br.edu.ifcvideira.Calculadora;

public class CalculadoraMetodos {
	
	private double valor1;
	private double valor2;
	
	public double getValor1() {
		return valor1;
	}
	public void setValor1(double valor1) {
		this.valor1 = valor1;
	}
	public double getValor2() {
		return valor2;
	}
	public void setValor2(double valor2) {
		this.valor2 = valor2;
	}
		public double adicao(){
		return this.getValor1()+this.getValor2();
	}
	public double subtracao(){
		return this.getValor1()-this.getValor2();
	}
	public double multiplicacao(){
		return this.getValor1()*this.getValor2();
	}
	public double divisao(){
		return this.getValor1()/this.getValor2();
	}
}
