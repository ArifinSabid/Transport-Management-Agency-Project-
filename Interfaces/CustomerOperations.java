package Interfaces;
import classes.Customer;
import java.util.*;
import java.lang.*;

public interface CustomerOperations
{
	public boolean insertCustomer(Customer c);
	public boolean removeCustomer(Customer c);
	public Customer searchCustomer(int idOfCustomer);
	public Customer searchCustomerByName(String nameOfCustomer);
	public Customer searchCustomerByPass(String passOfCustomer);
	public void showAllCustomers();
}