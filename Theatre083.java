import java.util.*;

public class Theatre083
{
	        public static void main (String[] args)
	        {
	                int option = 0;
	                ArrayList<Show>shows = new ArrayList<Show>();
	                ArrayList<Theatre> theatres = new ArrayList<Theatre>();
	                ArrayList<Booking> bookings = new ArrayList<Booking>();
	                ArrayList<Customer> customers = new ArrayList<Customer>();
	                Scanner select = new Scanner(System.in);
					Scanner choice = new Scanner(System.in);
					Show horror = new Horror();
					Show romance = new Romance();
					Show action = new Action();
					Show comedy = new Comedy();
					String showName;

		        	//Theater1
	        	    Theatre testTheatre1 = new Theatre(1);
	        	    testTheatre1.createRows(10, 7);
					theatres.add(testTheatre1);
					Show s = new Show();
					shows.add(new Show(1, s.setShowName(1),"03-JUL", "1PM", theatres.get(0),horror.getGenre()));
					shows.add(new Show(5, s.setShowName(5),"03-JUL", "4PM", theatres.get(0),romance.getGenre()));
					shows.add(new Show(9, s.setShowName(9),"03-JUL", "7PM", theatres.get(0),comedy.getGenre()));

					//Theater2
					Theatre testTheatre2 = new Theatre(2);
	        	    testTheatre2.createRows(10, 7);
                	theatres.add(testTheatre2);
					shows.add(new Show(2, s.setShowName(2), "03-JUL", "1PM", theatres.get(1),horror.getGenre()));
					shows.add(new Show(6, s.setShowName(6),"03-JUL", "4PM", theatres.get(0),romance.getGenre()));
					shows.add(new Show(10, s.setShowName(10),"03-JUL", "7PM", theatres.get(0),action.getGenre()));

					//Theater3
					Theatre testTheatre3 = new Theatre(3);
	        	    testTheatre3.createRows(10, 7);
                	theatres.add(testTheatre3);
					shows.add(new Show(3, s.setShowName(3),"03-JUL", "1PM", theatres.get(2),horror.getGenre()));
					shows.add(new Show(7, s.setShowName(7),"03-JUL", "4PM", theatres.get(0),comedy.getGenre()));
					shows.add(new Show(11, s.setShowName(11),"03-JUL", "7PM", theatres.get(0),action.getGenre()));

					//Theater4
					Theatre testTheatre4 = new Theatre(4);
	        	    testTheatre4.createRows(10, 7);
                	theatres.add(testTheatre4);
					shows.add(new Show(4, s.setShowName(4), "03-JUL", "1PM", theatres.get(3),romance.getGenre()));
					shows.add(new Show(8, s.setShowName(8),"03-JUL", "4PM", theatres.get(0),comedy.getGenre()));
					shows.add(new Show(12, s.setShowName(12),"03-JUL", "7PM", theatres.get(0),action.getGenre()));

	            do
	            {
	                System.out.println("------------------------------------");
	                System.out.println(":Cinema Booking System by Theatre083:");
	                System.out.println("------------------------------------\n");
	                //System.out.println("Please Enter 1 to Add Theatre");
	                //System.out.println("Please Enter 2 to Add Show");
	                System.out.println("Please Enter 1 to Display Shows");
	                System.out.println("Please Enter 2 to Make Booking");
	                System.out.println("Please Enter 3 to Cancel Booking");
	                System.out.println("Please Enter 4 to Exit\n");

	                System.out.print("Enter Option: ");
	                    option = select.nextInt();

	                   /* if(option==1)
	                    {
	                    	System.out.println("ADD THEATRE Selected");
	                        System.out.println("-------------------------\n");
	                    	System.out.print("Enter a name for the theatre: \n");
	                    	String theatreName = choice.nextLine();
	                    	System.out.print("Enter a number for the theatre: \n");
	                    	int theatreNumber = choice.nextInt();
	                    	System.out.println("Enter the number of rows:");
	                    	int rowCount = choice.nextInt();
	                    	Theatre theatre = new Theatre(theatreNumber, theatreName);
	                    	theatre.createRows(1, 10, rowCount);
	                    	theatre.createRows(1, 5, 5);
	                    	theatres.add(theatre);
	                    }

	                    if(option==2)
	                    {
	                    	System.out.println("ADD SHOW Selected");
	                        System.out.println("-------------------------\n");
	                    	System.out.println("Enter the date of the Show [DD/MM/YYYY]:");
	                        String showDate = choice.nextLine();
	                        System.out.print("Enter name of Show: \n");
	                        String showName = choice.nextLine();
	                        System.out.println("Select a theatre by typing the number:");
	                        for (int i=0; i < theatres.size(); i++)
	                        {
	                        	System.out.println(i+1 + " " + theatres.get(i).getDescription());
	                        }
	                        int theatreNumber = choice.nextInt();
	                        shows.add(new Show(showName, showDate, theatres.get(theatreNumber-1)));
	                    }*/


	                    if(option==1)
	                    {
	                        System.out.println("DISPLAY SHOWS Selected");
	                        System.out.println("-------------------------\n");
	                        for (int i = 0; i < shows.size(); i++)
	                        {
								int showNumber = i+1;
	                        	System.out.println("Show Number: #" + showNumber);;
								System.out.println("Show Name: " + shows.get(i).getShowName());
								System.out.println("Genre: " + shows.get(i).getGenre());
								System.out.println("Show Date: " + shows.get(i).getShowDate());
								System.out.println("Show Time: " + shows.get(i).getShowTime());
	                            //System.out.println("Seat Status:" + shows.get(i).getFreeSeatsCount());
	                            System.out.println("----------------------\n");
	                        }
	                        System.out.println("End of Show List.\n");
	                    }


	                    if(option==2)
	                    {
	                        System.out.println("MAKE BOOKING Selected");
	                        System.out.println("-------------------------\n");
	                        Random rnd = new Random();
	                        int customerID = rnd.nextInt(999);
	                        Customer customer = new Customer(customerID);
	                        customers.add(customer);
	                        for (int i = 0; i< shows.size(); i++)
	                        {
	                        	int showNumber = i+1;
	                        	System.out.println("Show Number: " + showNumber);;
	                            System.out.println("Show Name:   " + shows.get(i).getShowName());
	                            System.out.println("Show Date:   " + shows.get(i).getShowDate());
	                            System.out.println("Show Time: " + shows.get(i).getShowTime());
	                            System.out.print("\n");
	                        }
	                        System.out.println("-------------------------");
	                        System.out.print("Enter the show number: ");
	                        int showNumber = choice.nextInt();
	                        int repeat = 0;
	                        System.out.println();
	                        do {
	                        	shows.get(showNumber-1).getTheatre().displaySeat();
	                        	System.out.print("Enter the row: ");
	                        	int selectedRow = choice.nextInt();
	                        	System.out.print("Enter the seat: ");
	                        	int selectedSeat = choice.nextInt();
	                        	System.out.println();
	                        	Booking booking = new Booking(customer, shows.get(showNumber-1));
	                        	if (booking.reserveSeat(selectedRow-1, selectedSeat-1)) {
	                        		bookings.add(booking);
	                        		System.out.println("The seat is now reserved for you.");
	                        	}
	                        	else {
	                        		System.out.println("Sorry the seat is already reserved.");
	                        	}
	                        	System.out.println();
	                        	System.out.print("Enter 1 to reserve another seat or 2 to check out: ");
	                        	repeat = choice.nextInt();
	                        } while (repeat == 1);
	                        System.out.println();
	                        System.out.println("Your Bill");
	                        System.out.println("-------------------------");
                        	int totalCost = 0;
	                        for (Booking booking : bookings)
	                        {
	                        	if (booking.getCustomer().getID() == customer.getID())
	                        	{
	                        		totalCost += booking.getCost();
	                        	}
	                        }
	                        System.out.println("Customer ID: " + customer.getID());
	                        System.out.println("Total costs: RM" + totalCost);
	                        System.out.println();
	                    }

	                    if(option==3)
	                    {
	                        System.out.println("CANCEL BOOKING Selected");
	                        System.out.println("-------------------------\n");
	                        System.out.print("Enter the customer id: ");
	                        int customerID = choice.nextInt();
	                        for (Customer customer : customers) {
	                        	if (customer.getID() == customerID)
	                        	{
	                        		for(Booking booking : bookings)
	                        		{
	                        			if (booking.getCustomer().getID() == customer.getID())
	                        			{
	                        				if (booking.unreserveSeat())
	                        				{

	                        				}
	                        			}
	                        		}
	                        		System.out.println("Your reservation has been canceled!");
	                        	}
	                        }
	                        System.out.println();
	                    }

	                    if(option==4)
	                    {
	                    	System.exit(0);
	                    }

	              }while(true);
	        }
}