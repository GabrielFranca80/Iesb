package servico;

import dominio.*;

public class DescreverDiaDaSemana {

  public void executar(int[] arrayInt) {
    DiaDaSemana arrayDiaDaSemana[] = new DiaDaSemana[arrayInt.length];
    int i = 0;
    for(int inteiro : arrayInt){
      arrayDiaDaSemana[i] = new DiaDaSemana(inteiro);
      i++;
    }
    for (DiaDaSemana dia : arrayDiaDaSemana) {
      System.out.println(dia.getDescricao());
      
    }
  }

}
