package threeway.projeto.service.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import threeway.projeto.service.model.Livro;

public class LivroDao {
	private static final String CONSULTAR_SQL = "SELECT * FROM LIVRO WHERE TITULO LIKE ?";
	private static final String CONSULTAR_SQL_COD ="SELECT * FROM LIVRO WHERE COD_LIVRO = ?";
	private static final String APAGAR_SQL = "DELETE FROM LIVRO WHERE COD_LIVRO =?";
	private static final String ALTERAR_SQL = "UPDATE  LIVRO SET TITULO = ?, AUTOR = ? WHERE COD_LIVRO = ?";
	private static final String INSERIR_SQL =" INSERT INTO LIVRO(nome, idade, dataCadastro)" + "VALUES(?,?,?)";
	
	public List<Livro> consultar(String titulo){
		//OBJETO RETORNO
		ArrayList<Livro> lista = new ArrayList<Livro>();
		try(Connection conexao = FabricaConexao.getConexao();
				PreparedStatement consulta = conexao.prepareStatement(CONSULTAR_SQL)){
					consulta.setString(1, "%" + titulo.toUpperCase() + "%");
					
					ResultSet resultado = consulta.executeQuery();
							
							while(resultado.next()) {
								Livro livro = new Livro();
								livro.setAutor(resultado.getString("AUTOR"));
								livro.setCodigo(resultado.getInt("COD_LIVRO"));
								livro.setImagem(resultado.getString("IMAGEM"));
								livro.setPreco(resultado.getDouble("PRECO"));
								livro.setTitulo(resultado.getString("TITULO"));
								livro.setDescricao(resultado.getString("DESCRICAO"));
								lista.add(livro);
							}
					resultado.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
				return lista;
	}
	public Livro consultar(int codigo) {
		//OBJETO RETORNO
		Livro livro = null;
		try (Connection conexao = FabricaConexao.getConexao();
				PreparedStatement consulta = conexao.prepareStatement(CONSULTAR_SQL_COD)){
			
			
		consulta.setInt(1, codigo);
		ResultSet resultado = consulta.executeQuery();
		if(resultado.next()) {
			livro = new Livro();
			livro.setAutor(resultado.getString("AUTOR"));
			livro.setCodigo(resultado.getInt("COD_LIVRO"));
			livro.setImagem(resultado.getString("IMAGEM"));
			livro.setPreco(resultado.getDouble("PRECO"));
			livro.setTitulo(resultado.getString("TITULO"));
			livro.setDescricao(resultado.getString("DESCRICAO"));
		}resultado.close();
		
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return livro;
		
	}
	public void Apagar(int codigo)  {
		try 
			(Connection conexao = FabricaConexao.getConexao();
				PreparedStatement consulta = conexao.prepareStatement(APAGAR_SQL)){
			consulta.setInt(1, codigo);
			consulta.execute();
		} catch ( SQLException e) {
			
			e.printStackTrace();
		} 
		
	}
	public void alterarTitulo(Livro livro) {
		//Cria uma conexao com o banco
			//	Crie um PreparedStatement, classe usada para executara aquery
		try 
			
			(Connection conexao = FabricaConexao.getConexao();
				PreparedStatement consulta = conexao.prepareStatement(ALTERAR_SQL)){
			//adiciona o valor do primeiro paramentroda sql
			consulta.setString(1, livro.getTitulo());
			consulta.setString(2, livro.getAutor());
			consulta.setInt(3, livro.getCodigo());
			
			//executa a sql para inserção dos dados
			consulta.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}

		
		
	}
}
