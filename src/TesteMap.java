import java.util.*;
import java.util.Map.Entry;

public class TesteMap {

    public static void main(String[] args) {

        Map<String, Integer> nomesParaIdade = new HashMap<>();
        nomesParaIdade.put("Paulo", 31);
        nomesParaIdade.put("Adriano", 25);
        nomesParaIdade.put("Alberto", 33);
        nomesParaIdade.put("Guilherme", 26);

        for (String string : nomesParaIdade.keySet()) {
			System.out.println(string);
		}
    
        for(Integer matriculas : nomesParaIdade.values()) {
        	System.out.println(matriculas);
        }
        
        for(Entry<String, Integer> associacoes : nomesParaIdade.entrySet()) {
        	System.out.println(associacoes.getKey() + ", " + associacoes.getValue());
        }
        
    
    }
}