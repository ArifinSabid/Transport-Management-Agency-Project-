package classes;
import java.util.*;
import java.lang.*;

public abstract class Booking
{
	public abstract void book(int idOfCustomer);
	public abstract void showBookings(int desId,int idOfCustomer);
}