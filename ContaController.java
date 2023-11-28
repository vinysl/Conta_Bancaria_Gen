package Conta.controler;
import java.util.ArrayList;
import Conta.model.Conta;
import Conta.repository.ContaRepository;

public class ContaController implements ContaRepository {
	
	private ArrayList<Conta> listaContas = new ArrayList<Conta>();
	int numero = 0;

	@Override
	public void procurarPorNumero(int numero) {
		var conta = buscarNaCollection(numero);
		
		if(conta != null) {
			conta.visualizar();
		}else
			System.out.println("\nA conta número: "+numero+" não foi encontrada!");
		
	}

	@Override
	public void listarTodas() {
		for (var conta: listaContas) {
			conta.visualizar();
		}
		
	}

	@Override
	public void cadastrar(Conta conta) {
		listaContas.add(conta);
		System.out.println("\nA conta número: "+conta.getNumero()+" foi criada com sucesso!");
		
	}

	@Override
	public void atualizar(Conta conta) {
		var buscaConta = buscarNaCollection(conta.getNumero());
		
		if(buscaConta != null) {
			listaContas.set(listaContas.indexOf(buscaConta), conta);
			System.out.println("\nA conta número: "+conta.getNumero()+" foi atualizada com sucesso!");
		}else
			System.out.println("\nA conta número: "+conta.getNumero()+" não foi encontrada!");
		
	}

	@Override
	public void deletar(int numero) {
		var conta = buscarNaCollection(numero);
		
		if (conta != null) {
			if (listaContas.remove(conta) == true)
				System.out.println("\nA conta número: "+numero+" foi deletada com sucesso!");
		} else {
			System.out.println("\nA conta número: "+numero+" não foi encontrada!");
		}
		
	}

	@Override
	public void sacar(int numero, float valor) {
		var conta = buscarNaCollection(numero);
		
		if (conta != null) {
			if (valor > 0) {
				if (conta.sacar(valor) == true) {
					System.out.println("\nO saque na conta número: "+numero+" foi efetuado com sucesso!");
			}
			} else {
				System.out.println("\nNão é possível sacar um valor negativo!");
			}
		} else {
			System.out.println("\nA conta número "+numero+" não foi encontrada!");
		}
		
	}

	@Override
	public void depositar(int numero, float valor) {
		var conta = buscarNaCollection(numero);
		
		if (conta != null) {
			if (valor >0) {
				conta.depositar(valor);
				System.out.println("\nO depósito na conta número: "+numero+" foi efetuado com sucesso!");
			} else {
				System.out.println("\nNão é possível depositar um valor negativo!");
			}
		} else {
			System.out.println("\nA conta número: "+numero+" não foi encontrada ou conta destino não é uma conta corrente!");
		}
		
	}

	@Override
	public void transferir(int numeroOrigem, int numeroDestino, float valor) {
		var contaOrigem = buscarNaCollection(numeroOrigem);
		var contaDestino = buscarNaCollection(numeroDestino);
		
		if (contaOrigem != null && contaDestino != null) {
			if (valor > 0) {
				if (contaOrigem.sacar(valor) == true) {
					contaDestino.depositar(valor);
					System.out.println("\nA transferência foi efetuada com sucesso!");
				}
			} else {
				System.out.println("\nNão é possível transferir um valor negativo!");
			}
		} else {
			System.out.println("\nA conta de origem e/ou destino não foi encontrada!");
		}
		
	}
	
	public int gerarNumero() {
		return ++ numero;
	}
	
	public Conta buscarNaCollection(int numero) {
		for(var conta : listaContas) {
			if(conta.getNumero() == numero) {
				return conta;
			}
		}
		return null;

	}
}
