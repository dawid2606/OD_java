package ejb;
import javax.ejb.Local;
import javax.ejb.Stateless;

@Stateless
//@Local(CustomerManagerInt.class)
public class CustomerManager {
	
	public CustomerManager(){
		
	}

	public static String getCustomerCount(){
		return "27";
	}
	public int getCustomerByRegion(String region){
		if (region.equalsIgnoreCase("west")){
			return 12;
		}else if (region.equalsIgnoreCase("east")){
			return 15;
		}else return 8;
		
	}
}
