package threeway.projeto.service.persistencia;

import threeway.projeto.service.Dao.LivroDao;
import threeway.projeto.service.model.Livro;

public class Pesquisa {

	static LivroDao dao = new LivroDao();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testarConsulta("a");
		updateTitulo();
		//testarConsultar();
	
		//testarConsultarCodigo();
apagar();
	}
	public static void testarConsulta(String titulo) {
		
		for(Livro livro: dao.consultar(titulo)) {
			System.out.println("Cod: "+livro.getCodigo() + "\tDesc: \t" + livro.getTitulo() +
					livro.getAutor());
		}
	}
	
	
	public static void testarConsultarCodigo() {
		Livro resultado = dao.consultar(5);
		System.out.println(resultado.getAutor() + resultado.getTitulo());
	}
	public static void apagar() {
	dao.Apagar(1);;
	}
	public static void updateTitulo() {
		Livro livro = new Livro();
		livro.setTitulo("Dragon Ball");
		livro.setCodigo(3);
		livro.setAutor("akira toryama");
		dao.alterarTitulo(livro);
	}
}
