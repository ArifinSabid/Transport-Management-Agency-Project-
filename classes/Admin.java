package classes;
import java.lang.*;
import java.util.*;
import Interfaces.*;

public class Admin extends Booking implements CustomerOperations,DestinationOperations
{
	Scanner sc1 = new Scanner(System.in);
	private Customer customers[] = new Customer[100];
	private Destination destinations[] = new Destination[10];
	
	public boolean insertDestination(Destination d)
	{
		boolean flag=false;
		for(int i=0; i< destinations.length ; i++)
		{
			if(destinations[i] == null)
			{
				destinations[i] = d;
				flag=true;
				break;
			}
		}
		if(flag == false){System.out.println("DESTINATION CANNOT BE ADDED\n");}
		return flag;
	}
	
	
	public boolean removeDestination(Destination d)
	{
		boolean flag =false;
		for(int i=0; i<destinations.length; i++)
		{
			if(destinations[i] == d)
			{
				System.out.println("DESTINATION REMOVED = "+destinations[i].getDestination()+"\n");
				destinations[i] = null;
				flag = true;
				break;
			}
		}
		if(flag == false)
	   {System.out.println("----CANNOT REMOVE CHOSEN DESTINATION----");}
       return flag;
	}
	
	
	public void showAllDestinations() 
	{
		System.out.println("---SHOWING DESTINATIONS---\n");
		for(int i=0;i<destinations.length;i++)
		{
			if(destinations[i] != null)
			{
				System.out.println("    "+destinations[i].getDestination()+ " "+ destinations[i].getDestinationId());
			}
			
		}
	}
	
	
	public Destination searchDestinationByName(String desiredDestination) 
	{
        Destination d = null;

        for (int i = 0; i < destinations.length; i++) 
		{
            if (destinations[i] != null) {
                if (destinations[i].getDestination() == desiredDestination)
				{
                    d = destinations[i];
                    break;
                }
            }
        }
        return d;
    }
	
	public Destination searchDestinationById(int desId) 
	{
        Destination d = null;

        for (int i = 0; i < destinations.length; i++) 
		{
            if (destinations[i] != null) {
                if (destinations[i].getDestinationId() == desId)
				{
                    d = destinations[i];
                    break;
                }
            }
        }
        return d;
    }
		
	
	public boolean insertCustomer(Customer c)
	{
		boolean flag=false;
		for(int i=0; i< customers.length ; i++)
		{
			if(customers[i] == null)
			{
				System.out.println("CUSTOMER IS ADDED\n");
				customers[i] = c;
				flag=true;
				break;
			}
		}
		if(flag == false){System.out.println("CUSTOMER CANNOT BE ADDED\n");}
		return flag;
	}
	
	
	public boolean removeCustomer(Customer c)
	{
		boolean flag =false;
		for(int i=0; i<customers.length; i++)
		{
			if(customers[i] == c)
			{
				System.out.println("CUSTOMER WITH ID: "+customers[i].getCustomerID()+" REMOVED"+"\n");
				customers[i] = null;
				flag = true;
				break;
			}
		}
		if(flag == false)
	   {System.out.println("----CANNOT REMOVE CHOSEN CUSTOMER----");}
       return flag;
	}
	
	
	public void showAllCustomers() 
	{
		System.out.println("---SHOWING ALL CUSTOMERS---\n");
		for(int i=0;i<customers.length;i++)
		{
			if(customers[i] != null)
			{
				System.out.println("Name : "+customers[i].getCustomerName());
				System.out.println("ID : "+customers[i].getCustomerID());
				System.out.println("Password : "+customers[i].getCustomerPassword());
				System.out.println("Number : "+customers[i].getCustomerNumber());
				System.out.println("Email : "+customers[i].getCustomerEmail());
				
			}
		}
	}
	
	public void book(int idOfCustomer)
	{ 
		int book;
		String booking1="Confirmed";
		String booking2="Not Confirmed";
		for (int i = 0; i < customers.length; i++)
		{
			if (customers[i] != null) 
			{
            	System.out.println("Confirm Booking for "+customers[i].getCustomerName()+"  ?");			
				System.out.println("Book ?\n1= Yes\n2=No");
				book=sc1.nextInt();
				if(book==1)
		        {
					customers[i].setBooking(booking1);
				}
				else if (book==2) 
				{
					customers[i].setBooking(booking2);
				}
			}	
			
	    }
	    System.out.println(" Done \n");
	}
	
	
    public void showBookings(int desId,int idOfCustomer)
	{
		Destination d=searchDestinationById(desId);
	    Customer c= searchCustomer(idOfCustomer);
	 
	    if(d !=null && c!=null)
	    {
			if (c.getBooking()==null)
		    {
				System.out.println("Destination : "+d.getDestination());
			    System.out.println("Total Fare : "+d.getTotalFare());
			    System.out.println("Booking Confirmation : Not Approved");
			 
		    }
		    else if (c.getBooking()!=null )
		    {
			System.out.println("Destination : "+d.getDestination());
			System.out.println("Total Fare : "+d.getTotalFare());
			System.out.println("Booking Confirmation : "+c.getBooking());
			 
		    } 
		
	    }
		
	}
	
	
	public Customer searchCustomer(int idOfCustomer) 
	{
        Customer c = null;

        for (int i = 0; i < customers.length; i++) 
		{
            if (customers[i] != null) {
                if (customers[i].getCustomerID() == idOfCustomer)
				{
                    c = customers[i];
                    break;
                }
            }
        }
        return c;
    }
	
	
    public Customer searchCustomerByName(String nameOfCustomer)
	{
        Customer c = null;

        for (int i = 0; i < customers.length; i++)
		{
            if (customers[i] != null) 
			{
                if (customers[i].getCustomerName().equals(nameOfCustomer))
				{
                    c = customers[i];
                    break;
                }
            }
        }
        return c;
    }

	
	public Customer searchCustomerByPass(String passOfCustomer)
	{
        Customer c = null;

        for (int i = 0; i < customers.length; i++)
		{
            if (customers[i] != null) 
			{
                if (customers[i].getCustomerPassword().equals(passOfCustomer))
				{
                    c = customers[i];
                    break;
                }
            }
        }
        return c;
    }
		
	
}

