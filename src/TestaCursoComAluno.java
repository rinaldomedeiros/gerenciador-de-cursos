import java.util.Collections;
import java.util.Set;

public class TestaCursoComAluno {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso("Java", "Paulo Silveira");

		curso1.adiciona(new Aula("Trabalhando com ArrayList", 21));
		curso1.adiciona(new Aula("Criando uma Aula", 20));
		curso1.adiciona(new Aula("Modelando com coleções", 24));
		
		Aluno aluno1 = new Aluno("Rinaldo", 298710);
		Aluno aluno2 = new Aluno("Fulano de Tal", 263541);
		Aluno aluno3 = new Aluno("Beltrano", 5364412);
		
		curso1.matricula(aluno1);
		curso1.matricula(aluno2);
		curso1.matricula(aluno3);

		Set<String> nomes = Collections.emptySet();
//		nomes.add("Paulo");

//		Set<Aluno> alunos = curso1.getAlunos();
		//alunos.add(new Aluno("Cicrano", 465887));
		
		
		for (Aluno aluno : curso1.getAlunos()) {
			System.out.println(aluno);
		}
		
		Aluno novoAluno = new Aluno("Rinaldo", 298710);
//		Aluno novoAluno = new Aluno(null, 298710);
		
//		System.out.println(curso1.estaMatriculado(novoAluno));
		
		
		System.out.println("Quem é o aluno com a matrícula 298710");
		System.out.println(curso1.buscaMatriculado(298710));
	}

}
