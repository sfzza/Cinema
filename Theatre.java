// This class will make new theatre or studio for a show
import java.util.*;

public class Theatre {

    private int theatreNum;
    private int rowCount = 12;

    private ArrayList<Row> row;
    /*private String[] rowList = {"A","B","C","D","E",
                            "F","G","H","I","J","K","L"};*/

    public Theatre (int theatreNum){

        this.theatreNum = theatreNum;
        row = new ArrayList <Row> ();
    }

    public void createRows (int seatCount, int rowCount){

        for (int i=0; i<=rowCount;i++){

            row.add(new Row(seatCount, rowCount));
        }
        this.rowCount += rowCount;
    }

    public ArrayList<Row> getRows(){

        return row;
    }

    public void displaySeat(){

        int maxSeatsInRow = 0;
        System.out.println();

        for(Row rows : getRows()){

            if (rows.getSeats().size() > maxSeatsInRow){ //to set maximum seats in a row

                maxSeatsInRow = rows.getSeats().size();
            }
        }

        System.out.print("   |");
        for(int i=1; i<=maxSeatsInRow; i++){

            System.out.print(" " + i);
        }

        System.out.print("\n");
        System.out.print("----");
        for (int i=1; i <= maxSeatsInRow; i++){

        	if (i>9) {

                System.out.print("---");
        	}
        	else {

                System.out.print("--");
        	}
        }

        System.out.print("\n");

        for (Row rows : getRows()){

        	if (rows.getRowNum()>9) {
        		System.out.print(rows.getRowNum() + " | ");
        	}
        	else {
        		System.out.print(rows.getRowNum() + "  | ");
        	}
        	for (Seat seats : rows.getSeats()){

        		if (seats.getSeatStatus()) {

        			System.out.print("X ");
        		}
        		else {
        			System.out.print(seats.getSeatNum() + " ");
        		}
        	}
            System.out.print("\n");
        }
        System.out.print("\n");
    }
}