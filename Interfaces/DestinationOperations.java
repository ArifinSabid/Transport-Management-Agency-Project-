package Interfaces;
import classes.Destination;
import java.util.*;
import java.lang.*;

public interface DestinationOperations
{
	public boolean insertDestination(Destination d);
	public boolean removeDestination(Destination d);
	public Destination searchDestinationByName(String desiredDestination);
	public Destination searchDestinationById(int desId);
	public void showAllDestinations();
}