public class Booking {

	int cost = 0;
	Customer customer;
	Show show;
	int rowNumber;
	int seatNumber;
	
	
	public Booking(Customer customer, Show show)
	{
		this.customer = customer;
		this.show = show;
	}
	
	public int getCost()
	{
			return cost += 15;
	}
	
	public void setRowNum(int rowNumber)
	{
		this.rowNumber = rowNumber;
	}
	
	public void setSeatNum(int seatNumber)
	{
		this.seatNumber = seatNumber;
	}
	
	public boolean reserveSeat(int selectedRow, int selectedSeat)
	{
		if (show.getTheatre().getRows().get(selectedRow).getSeats().get(selectedSeat).getSeatStatus())
    	{  		
    		return false;
    	}
    	else {
    		show.getTheatre().getRows().get(selectedRow).getSeats().get(selectedSeat).reserve();
    		setRowNum(selectedRow);
    		setSeatNum(selectedSeat);
    		return true;
    	}
	}
	
	public boolean unreserveSeat()
	{
    		show.getTheatre().getRows().get(rowNumber).getSeats().get(seatNumber).unreserve();
    		return true;
	}
	
	public Customer getCustomer()
	{
		return customer;
	}
}