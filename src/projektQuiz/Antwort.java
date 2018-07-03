package projektQuiz;

public class Antwort{
	  boolean istRichtig;
	  String antwort;
	  Antwort(boolean _istRichtig, String _antwort){
	    antwort = _antwort;
	    istRichtig = _istRichtig;
	  }
	  public boolean getIstRichtig(){
	    return istRichtig;
	  }
	  public String getAntwort(){
	    return antwort;
	  }
	}

