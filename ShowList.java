// This class will list out now showing shows
import java.util.*;

public enum ShowList{

    FILM1("US"), FILM2("The Lighthouse"), FILM3("Midsommar"), //Horror
    FILM4("Five Feet Apart"), FILM5("The Sun Is Also Star"), FILM6("Always Be My Baby"), //Romance
    FILM7("The Hustle"), FILM8("Shazam!"), FILM9("Pokemon Detective Pikachu"), //Comedy
    FILM10("John Wick"), FILM11("Avengers: End Game"), FILM12("Alita: Battle Angel"); //Action

    private final String showName;

    ShowList (String showName){

        this.showName = showName;
    }

    public String getShowName(){

        return this.showName;
    }

    public String toString() { 
        return this.showName; 
    }
}
