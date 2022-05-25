import java.util.*;

public class Show {

	private int showID;
	private String showName;
	private String showDate;
	private String showTime;
	private Theatre theatre;
	private ArrayList<Seat> seats;
	private int freeSeats;
	private String genre;

	public Show(int showID, String showName, String showDate, String showTime, Theatre theatre, String genre)
	{
		this.showID = showID;
		this.showName = showName;
		this.showDate = showDate;
		this.showTime = showTime;
		this.theatre = theatre;
		this.genre = genre;
	}
	public Show(){}

	public String getGenre(){
		return genre;
	}

	public void loadSeats()
	{
		for (Row row : theatre.getRows())
		{
			for (Seat seat : row.getSeats())
			{
				seats.add(seat);
			}
		}
	}

	public int getFreeSeatsCount()
	{
		for (Seat seat : seats)
		{
			if (!seat.getSeatStatus())
			{
				freeSeats++;
			}
		}
		return freeSeats;
	}

	public Theatre getTheatre(){
		return theatre;
	}

	public void setTheatre(Theatre theatre){
		this.theatre=theatre;
	}

	public int getShowID()
	{
		return showID;
	}

	public String getShowName()
	{
		return showName;
	}

	public String getShowDate()
	{
		return showDate;
	}

	public String getShowTime()
	{
		return showTime;
	}

	public ArrayList<Seat> getSeats()
	{
		return seats;
	}

	//user input 1,2,3 = show option
	public String setShowName(int showOption){

		if (showOption==1){
			ShowList sl = ShowList.FILM1;
			this.showName = sl.getShowName();
		}
		if (showOption==2){
			ShowList sl = ShowList.FILM2;
			this.showName = sl.getShowName();
		}
		if (showOption==3){
			ShowList sl = ShowList.FILM3;
			this.showName = sl.getShowName();
		}
		if (showOption==4){
			ShowList sl = ShowList.FILM4;
			this.showName = sl.getShowName();
		}
		if (showOption==5){
			ShowList sl = ShowList.FILM5;
			this.showName = sl.getShowName();
		}
		if (showOption==6){
			ShowList sl = ShowList.FILM6;
			this.showName = sl.getShowName();
		}
		if (showOption==7){
			ShowList sl = ShowList.FILM7;
			this.showName = sl.getShowName();
		}
		if (showOption==8){
			ShowList sl = ShowList.FILM8;
			this.showName = sl.getShowName();
		}
		if (showOption==9){
			ShowList sl = ShowList.FILM9;
			this.showName = sl.getShowName();
		}
		if (showOption==10){
			ShowList sl = ShowList.FILM10;
			this.showName = sl.getShowName();
		}
		if (showOption==11){
			ShowList sl = ShowList.FILM11;
			this.showName = sl.getShowName();
		}
		if (showOption==12){
			ShowList sl = ShowList.FILM12;
			this.showName = sl.getShowName();}
		return getShowName();
	}
}
