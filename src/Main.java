import java.util.Date;

import Abstract.BaseCustomerManager;
import Adapter.MernisServiceAdapter;
import Concrete.CustomerCheckManager;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		Customer customer1 = new Customer(2,"Engin","Demiroð",new Date(1985,1,6),"28861499108");
		
		Customer customer2 = new Customer(1,"Öznur","Gür", new Date(1999,1,27),"48964758988");
		
		
		BaseCustomerManager starbucksCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		starbucksCustomerManager.save(customer1);
		starbucksCustomerManager.save(customer2);
		
		//BaseCustomerManager neroCustomerManager = new NeroCustomerManager(new CustomerCheckManager());		
		//neroCustomerManager.save(customer1);
		//neroCustomerManager.save(customer2);
		
		
		
	}

}
