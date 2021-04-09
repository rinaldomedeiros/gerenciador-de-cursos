import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

	public static void main(String[] args) {
		
		String curso1 = "c - Java OO: Introdução à Orientação a Objetos";
		String curso2 = "a - Java e java.lang: Programe com a classe Object e String";
		String curso3 = "b - Java Collections: Dominando Listas, Sets e Mapas";
		
		ArrayList<String> cursos = new ArrayList<>();
		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);
		
		//cursos.remove(1);
		
		Collections.sort(cursos);
		
		System.out.println(cursos);
	}

}
