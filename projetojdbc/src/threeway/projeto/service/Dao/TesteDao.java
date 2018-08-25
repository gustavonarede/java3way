package threeway.projeto.service.Dao;

public class TesteDao {
	public static void main(String[] args) {
		String titulo = "monge e o executivo - ";
		LivroDao dao = new LivroDao();
		dao.consultar(titulo).forEach(p -> System.out.println("Desc: " + p.getTitulo() + " Preço:" + p.getPreco()));
	}

}
