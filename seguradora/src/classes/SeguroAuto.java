package classes;

public class SeguroAuto extends Seguro {

	public SeguroAuto(int numApolice, String nome, Endereco endereco, float valor, float premio, 
			int deducaoAutomovel, int numLicenca, String estado, String modelo, int ano) {
		super();
		// TODO Auto-generated constructor stub
		this.numApolice = numApolice;
		this.nome = nome;
		this.endereco = endereco;
		this.valor = valor;
		this.premio = premio;
		this.deducaoAutomovel = deducaoAutomovel;
		this.numLicenca = numLicenca;
		this.estado = estado;
		this.modelo = modelo;
		this.ano = ano;
	}
	private int deducaoAutomovel;
	private int numLicenca;
	private String estado;
	private String modelo;
	private int ano;
	
	public int getDeducaoAutomovel() {
		return deducaoAutomovel;
	}
	public void setDeducaoAutomovel(int deducaoAutomovel) {
		this.deducaoAutomovel = deducaoAutomovel;
	}
	public int getNumLicenca() {
		return numLicenca;
	}
	public void setNumLicenca(int numLicenca) {
		this.numLicenca = numLicenca;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public void imprimirSeguro() {
		System.out.println("\nSeguro: " + getNome() + 
				   		   "\nApólice: " + getNumApolice() +
				   		   "\nLicença: " + getNumLicenca() +
				   		   "\nValor: " + getValor() +
				   		   "\nDedução: " + getDeducaoAutomovel() +
				   		   "\nModelo: " + getModelo() +
				   		   "\nAno: " + getAno());
	}
	@Override
	public String toString() {
		return "SeguroAuto [deducaoAutomovel=" + deducaoAutomovel + ", numLicenca=" + numLicenca + ", estado=" + estado
				+ ", modelo=" + modelo + ", ano=" + ano + ", numApolice=" + numApolice + ", nome=" + nome
				+ ", endereco=" + endereco + ", valor=" + valor + ", premio=" + premio + "]";
	}
}
