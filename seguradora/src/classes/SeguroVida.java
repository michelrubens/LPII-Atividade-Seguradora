package classes;

public class SeguroVida extends Seguro {

	public SeguroVida(int numApolice, String nome, Endereco endereco, float valor, float premio, String beneficiario, Data datanasc) {
		super();
		// TODO Auto-generated constructor stub
		this.numApolice = numApolice;
		this.nome = nome;
		this.endereco = endereco;
		this.valor = valor;
		this.premio = premio;
		this.beneficiario = beneficiario;
		this.datanasc = datanasc;
	}
	private String beneficiario;
	private Data datanasc;

	public String getBeneficiario() {
		return beneficiario;
	}
	public void setBeneficiario(String beneficiario) {
		this.beneficiario = beneficiario;
	}
	public Data getDatanasc() {
		return datanasc;
	}
	public void setDatanasc(Data datanasc) {
		this.datanasc = datanasc;
	}

	public void imprimirSeguro() {
		System.out.println("\nSeguro: " + getNome() + 
				"\nApólice: " + getNumApolice() +
				"\nBeneficiário: " + getBeneficiario() +
				"\nValor: " + getValor());
	}
	@Override
	public String toString() {
		return "SeguroVida [beneficiario=" + beneficiario + ", datanasc=" + datanasc + ", numApolice=" + numApolice
				+ ", nome=" + nome + ", endereco=" + endereco + ", valor=" + valor + ", premio=" + premio + "]";
	}
	
}
