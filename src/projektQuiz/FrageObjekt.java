package projektQuiz;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class FrageObjekt{
	   String frage;
	   List<Antwort> antworten = new ArrayList<>();
	  FrageObjekt(String _frage,String _richtigeAntwort,String _falscheAntwort1,String _falscheAntwort2,String _falscheAntwort3){
	    frage = _frage;
	    antworten.add(new Antwort(true,_richtigeAntwort));
	    antworten.add(new Antwort(false,_falscheAntwort1));
	    antworten.add(new Antwort(false,_falscheAntwort2));
	    antworten.add(new Antwort(false,_falscheAntwort3));
	    Collections.shuffle(antworten);
	  }
	  public List<Antwort> getAntworten(){
	    return antworten;
	  }
	  public String getAntwortTextByIndex(int index){
		  return antworten.get(index).getAntwort();
	  }
	  public boolean getAntwortIsCorrectByIndex(int index){
	    
		  return antworten.get(index).getIstRichtig();
	  }

	  public String getFrage(){
	    return frage;
	  }

	}