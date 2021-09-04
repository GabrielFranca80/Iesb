import java.util.ArrayList;
import java.util.Arrays;
import dominio.*;

public class Main {
   
	public static void main(String[] args) {
	
	var Lista = new ArrayList<String>(Arrays.asList(args));
	Lista.stream()
	      .map(Integer::valueOf)
	      .distinct()
	      .filter(d -> d > 0 && d < 8)
	      .map(DiaDaSemana::new)
	      .forEach(d -> System.out.println(d.getDescricao()));

	}

}