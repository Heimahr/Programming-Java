import java.util.Scanner;

 
public class  ListProjectIL {
  public static void main(String[] args) {
    // variables
    double[] luvut;
    Scanner lukija = new Scanner(System.in);
    String[] names;
    
    System.out.print("Kuinka monta tuotetta: ");
  
    int number = lukija.nextInt();
    System.out.print("Budjetti: ");
    int maxnumber = lukija.nextInt();
    lukija.nextLine();
    luvut = new double[number];
    double summa = 0;
    names = new String[number];
    
    
    // ask prices
    for (int i = 0; i < luvut.length; ++i) {
      System.out.print("Anna " + (i+1) + ". tuotteen nimi: ");  
      names[i] = lukija.nextLine();
      System.out.print("Anna " + (i+1) + ". tuotteen hinta: ");
      luvut[i] = lukija.nextDouble();
      lukija.nextLine();
     
      }
    
    System.out.println();
    
    // print prices 
    
    
     
   
    for (int i = 0; i < luvut.length; ++i) {
        summa = summa + luvut[i]; 
    }
	System.out.print("Tuotteiden yhteishinta: "+ summa + "€\n");
	System.out.print("Keskimääräinen tuotteen hinta: ");
    System.out.print(summa / luvut.length + "€ ");
    System.out.print("\n" + "Syötetyt tuotteet: ");
	for (int i = 0; i < luvut.length; ++i) {
        System.out.print(names[i] + " "+ luvut[i] + "€ ");
    
	}
	if (maxnumber < summa) {
        System.out.println('\n' + "Budjetti ylittyi! ");
	}    
  }
}