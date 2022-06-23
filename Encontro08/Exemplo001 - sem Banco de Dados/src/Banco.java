
public class Banco {
	
	public void incluir(Pessoa pessoa) {
		System.out.println("ID: " + pessoa.getId());
		System.out.println("Nome: " + pessoa.getNome());
	}
	
	public void excluir(Pessoa pessoa) {
		System.out.println("Excluir funcionando");
	}
	
	public void alterar(Pessoa pessoa) {
		System.out.println("Alterar funcionando");
	}
	
	public Pessoa consultar(Pessoa pessoa) {
		System.out.println("Consultar funcionando");
		return null;
	}

}
