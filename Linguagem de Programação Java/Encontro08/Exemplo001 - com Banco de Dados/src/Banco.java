import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Banco {
	
	public void incluir(Pessoa pessoa) {
		final String usuario = "postgres";
		final String senha = "aluno123";
		final String url = "jdbc:postgresql://localhost:5432/postgres";
		final String instrucao_insert = "INSERT INTO PESSOAS(id, nome) VALUES(?,?)";
		final String driverBanco = "org.postgresql.Driver";
		
		try {
			
			Class.forName(driverBanco);
			Connection conexao = DriverManager.getConnection(url, usuario, senha);
			PreparedStatement preparedStatement = conexao.prepareStatement(instrucao_insert);
			preparedStatement.setInt(1, pessoa.getId());
            preparedStatement.setString(2, pessoa.getNome());
            
            preparedStatement.executeUpdate();
			
            System.out.println("Inclusão realizada com sucesso");
			
		}catch(Exception exception){
            exception.printStackTrace();
        }
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
