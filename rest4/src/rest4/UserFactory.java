package rest4;

public class UserFactory {
  Integer userId;
	public UserFactory(Integer i)
  {
	  this.userId = i;
  }
	public User getUser(){
		User u = new User();
		if(userId == 1)
		{
		u.setName("Ola"); 
		u.setId(1);
		}
		else if(userId == 2)
		{
			u.setName("Dawid");
			u.setId(2);
		}else if(userId == 3){
			u.setId(3);
			u.setName("Krzysiek");
		}else{
			u.setId(0);
			u.setName("Jestes zerem");
		}
		return u;
	}
}