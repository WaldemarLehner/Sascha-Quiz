package projektQuiz;
import java.util.Scanner;
import java.util.ArrayList;

import java.util.List;

public class StartKlasse{
static List<FrageObjekt> fragen = new ArrayList<FrageObjekt>();
static Scanner field1;
static int punkte = 0;
  public static void main(String[] args){
    field1 = new Scanner(System.in);
    //Fragen erzeugen
    fragen.add(new FrageObjekt("Wie viele Bunderländer hat Deutschland?","16","18","15","17"));
    fragen.add(new FrageObjekt("Welches folgender Länder grenzt nicht an Deutschland an?","Liechtenstein","Tschechien","Niederlande","Dänemark"));
    fragen.add(new FrageObjekt("Welches Land hat die größte Fläche?","Russland","Kanada","USA","China"));
    fragen.add(new FrageObjekt("Welches ist das kleinste Bundesland Deutschlands?","Bremen","Hamburg","Saarland","Thüringen"));
    //hier können noch mehr Fragen hin
    start();
  }
  public static void start(){
    //Foreach frage
    for(FrageObjekt f : fragen){
      System.out.println("------ ------");
      System.out.println(f.getFrage());
      System.out.println(">");
      System.out.println("[A]: "+f.getAntwortTextByIndex(0));
      System.out.println("[B]: "+f.getAntwortTextByIndex(1));
      System.out.println("[C]: "+f.getAntwortTextByIndex(2));
      System.out.println("[D]: "+f.getAntwortTextByIndex(3));
      
      int inputToIndex = getIndexFromInput(field1.next());
      if(inputToIndex < 0) {
    	  System.out.println("Bitte geben sie ein A,B,C oder D an. Das Quiz wird abgebrochen.");
    	  break;
      }
      if(f.getAntwortIsCorrectByIndex(inputToIndex)) {
    	  punkte++;
    	  System.out.println("Antwort ist richtig! Es wurde(n) bislang "+punkte+ " Punkt(e) erreicht!");
      }
      else {
    	  System.out.println("Leider falsch. Das Quiz ist vorüber.");
    	  break;
      }
      
    }
    showResult();
  }
  public static int getIndexFromInput(String s) {
	  switch(s) {
	  case "A":case "a":return 0;
	  case "B":case "b":return 1;
	  case "C":case "c":return 2;
	  case "D":case "d":return 3;
	  default:			return -1;
	  }
  }
  
  public static void showResult() {
	   int fragenanzahl = fragen.size();
	  System.out.println("Es wurden "+punkte+" Punkte erreicht. Die maximale Anzahl ist eine Punktzahl von " + fragenanzahl + ".");
	  if(fragenanzahl == punkte) {
		  System.out.println("Glückwunsch! Alle Fragen richtig beantwortet!");
	  }
	  else if(punkte == 0) {
		  System.out.println("Schon bei der ersten Frage? Das geht aber besser :)");
	  }
	  else if(punkte < (fragenanzahl / 2)) {
		  System.out.println("Besser noch mal üben.");
	  }
	  else if(punkte > (fragenanzahl / 2)) {
		  System.out.println("Mehr als die Hälfte. Gar nicht mal so schlecht!");
	  }
  }




}





