package dominio;

 public class DiaDaSemana {

  int indice;

 
  { System.out.println("Inicializador de inst�ncia, executando antes do construtor."); }

  public DiaDaSemana() {
    System.out.println("Construtor sem par�metro");  
    this.indice = 1;
  }

  public DiaDaSemana(int indice) {
    System.out.println("Construtor com par�metro");	  
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
        dia = "Ter�a-Feira";
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
        dia = "S�bado";
        break;
    }

    return "Hoje �: " + dia;
  }
 }