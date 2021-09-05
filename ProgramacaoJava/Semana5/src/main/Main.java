package main;

import java.util.ArrayList;
import java.util.Arrays;

import dominio.DiaDaSemana;

public class Main {

	public static void main(String[] args) {
		var lista = new ArrayList<String>(Arrays.asList(args));
		{lista.stream()
			.filter(Main::numInt)
			.map(Integer::valueOf)
			.distinct()
			.filter(d -> d <= 0 || d >= 8)
			.forEach(d -> System.out.println(d));
			}
		lista.stream()
			  .filter(Main::numInt)
		      .map(Integer::valueOf)
		      .distinct()
		      .filter(d -> d > 0 && d < 8)
		      .map(DiaDaSemana::new)
		      .forEach(d -> System.out.println(d.getDescricao()));

	}

	public static boolean numInt(String text) {
		try {
			Integer.valueOf(text);
			return true;
		} catch (NumberFormatException e) {
			System.out.println(text);
			return false;
			
		}
			
	}
}
