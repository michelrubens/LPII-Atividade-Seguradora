package classes;

import java.util.Calendar;

public class Data {

	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		// TODO Auto-generated constructor stub
	}
	private int dia;
	private int mes;
	private int ano;
	
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public void imprimirData() {
		System.out.println(getDia() + "/" + getMes() + "/" + getAno());
	}
	
	public Data() {
		Calendar hoje = Calendar.getInstance();
		dia = hoje.get(Calendar.DAY_OF_MONTH);
		mes = hoje.get(Calendar.MONTH)+1;
		ano = hoje.get(Calendar.YEAR);
	}

}
