package dominio;

 public class DiaDaSemana {

  int indice;

 
  { System.out.println("Inicializador de instância, executando antes do construtor."); }

  public DiaDaSemana() {
    System.out.println("Construtor sem parâmetro");  
    this.indice = 1;
  }

  public DiaDaSemana(int indice) {
    System.out.println("Construtor com parâmetro");	  
    this.indice = indice;
  }

  public String getDescricao() {

    String dia = new String();
    switch(indice) {
      case 1:
        dia = "Domingo";
        break;
      case 2:
        dia = "Segunda-Feira";
        break;
      case 3:
        dia = "Terça-Feira";
        break;
      case 4:
        dia = "Quarta-Feira";
        break;
      case 5:
        dia = "Quinta-Feira";
        break;
      case 6:
        dia = "Sexta-Feira";
        break;
      case 7:
        dia = "Sábado";
        break;
    }

    return "Hoje é: " + dia;
  }
 }