
public class ContaBancaria {

	private int numero;
	private String titular;
	private double saldo;
	
	public ContaBancaria(int numero, String titular, double saldo) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}
	
	public void depositar(double valor) {
		this.saldo+=valor;
	}

	public void sacar(double valor) {
		if(this.saldo >= valor) {
			this.saldo-=valor;
		}else {
			System.out.println("Impossível sacar: valor superior ao saldo.");
		}
	}
	
	public int getNumero() {
		return this.numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getTitular() {
		return this.titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
