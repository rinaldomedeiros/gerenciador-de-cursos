import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Java Collections", "Paulo Silveira");
		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		javaColecoes.adiciona(new Aula("Aula 2 de JAVA", 15));
		javaColecoes.adiciona(new Aula("Aula 3 de JAVA", 19));
		javaColecoes.adiciona(new Aula("Aula 1 de JAVA", 20));
		javaColecoes.adiciona(new Aula("Aula 4 de JAVA", 23));

		
		List<Aula> aulas = new ArrayList<>(aulasImutaveis);
		Collections.sort(aulas);
		
		
		System.out.println(aulasImutaveis);
		System.out.println(aulas);
		System.out.println("Tempo total: " + javaColecoes.getTempoTotal());
		System.out.println(javaColecoes);
		
	}

}
