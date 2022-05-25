// This class will create column of seat in a theatre
import java.util.*;

public class Seat{

    private int seatNum;
    private boolean reserved; //to set reserved seat

    public Seat (int seatNum, boolean reserved){

        this.seatNum = seatNum;
        this.reserved = reserved;
    }

    public void setSeatNum(int seatNum){

        this.seatNum = seatNum;
    }

	public int getSeatNum()
	{
			return this.seatNum;
	}

    public void reserve(){ //to set the seat to reserved

        reserved = true;
    }

    public void unreserve(){ //to set the seat to unreserved

        reserved = false;
    }

    public boolean getSeatStatus(){ //to pass the seat's reserved status

        return reserved;
    }
}