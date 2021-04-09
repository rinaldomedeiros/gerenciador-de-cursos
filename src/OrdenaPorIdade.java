import java.util.Comparator;

public class OrdenaPorIdade implements Comparator<Funcionario>{

	@Override
	public int compare(Funcionario funcionario1, Funcionario funcionario2) {
		int diff = funcionario1.getIdade() - funcionario2.getIdade();

        if(diff == 0) {
            return funcionario1.getNome().compareTo(funcionario2.getNome());
        }

        return diff;
	}

	
}
