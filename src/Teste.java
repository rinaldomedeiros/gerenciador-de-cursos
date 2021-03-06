import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Teste {
	
	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario("Barney", 10);
        Funcionario f2 = new Funcionario("Jonatan", 9);
        Funcionario f3 = new Funcionario("Guaraciara", 9);
        
        Set<Funcionario> funcionarios = new TreeSet<>(new OrdenaPorIdade());
        funcionarios.add(f1);
        funcionarios.add(f2);
        funcionarios.add(f3);
        
        Iterator<Funcionario> iterador = funcionarios.iterator();
        
        while (iterador.hasNext()) {
        	Funcionario funcionario = iterador.next(); 
			System.out.println(funcionario.getNome() + ", " + funcionario.getIdade());
			
		}
        
	}
}
