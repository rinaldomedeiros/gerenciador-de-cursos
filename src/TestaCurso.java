import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Java Collections", "Paulo Silveira");
		//List<Aula> aulas = javaColecoes.getAulas();
		javaColecoes.adiciona(new Aula("Aula 2 de JAVA", 15));
		javaColecoes.adiciona(new Aula("Aula 3 de JAVA", 19));
		javaColecoes.adiciona(new Aula("Aula 1 de JAVA", 20));
		javaColecoes.adiciona(new Aula("Aula 4 de JAVA", 23));
		
		
		System.out.println(javaColecoes.getAulas());
	}

}
