// This class will create row of seat in a theatre
import java.util.*;

public class Row{

    private int rowNum;
    private int seatCount = 10;

    private ArrayList<Seat> seat;

    public Row (int seatCount, int rowNum){

        this.rowNum = rowNum;
        seat = new ArrayList<Seat>();
        createSeats(this.seatCount);
    }

    public void createSeats (int seatCount){

        for (int i = 1; i <= seatCount; i++)
		{
			seat.add(new Seat(i, false));
		}
    }

    public ArrayList<Seat> getSeats(){

        return seat;
    }

    public int getRowNum(){

        return rowNum;
    }
}