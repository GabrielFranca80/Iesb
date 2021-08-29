import servico.*;

public class Main {
   
	public static void main(String[] args) {
	
		int arrayInt[] = new int [args.length];
		int i = 0;
		for(String a : args){
			int num = Integer.parseInt(a);
			if(num > 0 && num < 8){
				arrayInt[i] = num;
			}
			else {
				System.out.println("O número: " + num + " não está entre 1 e 7) ");
			}
		}
		i++;
		
	  DescreverDiaDaSemana d = new DescreverDiaDaSemana();
	  d.executar(arrayInt);
	
	}

}