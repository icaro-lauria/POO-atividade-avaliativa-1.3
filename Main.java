
public class Main {

	public static void main(String[] args) {
		ContaBancaria conta1 = new ContaBancaria(20241, "João de Almeida", 0);
		conta1.sacar(100);
		System.out.println("O saldo da conta é: "+conta1.getSaldo());
		
		conta1.depositar(1500);
		System.out.println("O saldo da conta é: "+conta1.getSaldo());
		
		conta1.sacar(100);
		System.out.println("O saldo da conta é: "+conta1.getSaldo());
	}

}
