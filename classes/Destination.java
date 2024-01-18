package classes;
import java.lang.*;
import java.util.*;

public class  Destination
{
	private String desiredDestination;
	private int desId;
	private String typeOfTransport;
	private String nameOfTransport;
	private int costOfTransport;
	private String nameOfPlace;
	private int costOfPlace;
	private String nameOfHotel;
	private int roomFare;
	private int tpcost;
	private String tpname;
	

	
	public void setDestination(String desiredDestination)
	{
		this.desiredDestination= desiredDestination;
	}
	public String getDestination()
	{
		return desiredDestination;
	}
	public void setDestinationId(int desId)
	{
		this.desId= desId;
	}
	public int getDestinationId()
	{
		return desId;
	}
	
	
	//setget Transport
	public void settransportType(String typeOfTransport)
	{
		this.typeOfTransport=typeOfTransport;
	}
	public String gettransportType()
	{
		 return typeOfTransport;
	}
	public void settransportName(String nameOfTransport)
    {
		 this.nameOfTransport = nameOfTransport;
	}
	public String gettransportName()
	{
		return nameOfTransport;
	}
	public void settransportCost(int costOfTransport)
	{
		this.costOfTransport = costOfTransport;
	}
	public int gettransportCost()
	{
		return costOfTransport;
	}

	
	//set Hotel
	public void sethotelName(String nameOfHotel)
	{
		this.nameOfHotel = nameOfHotel;
	}
	public String gethotelName()
	{
		return nameOfHotel;
	}
	public void setroomFarePerDay(int roomFare)
	{
		this.roomFare = roomFare;
	}
	public int getroomFarePerDay()
	{
		return roomFare;
	}
	
	//travel places
	public void setTPname(String tpname)
	{
		this.tpname = tpname;
	}
	public String getTPname()
	{
		return tpname;
	}
	public void setTPcost(int tpcost)
	{
		this.tpcost = tpcost;
	}
	public int getTPcost()
	{
		return tpcost;
	}


    //total fare
	public int getTotalFare()
	{
		return (costOfTransport+costOfPlace+roomFare+tpcost);
		
	}
	
	
}

