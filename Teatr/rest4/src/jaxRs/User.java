package jaxRs;

public class User {

	Integer id;
	String name;
	
	public User(){
		super();
	}
	void setName(String name){
		this.name = name;
	}
	void setId(Integer id){
		this.id = id;
	}
//	public String toString(){
	//	return "User [ id = "+id+ ", name = "+name+"]";
	//}
	public String toString(){
		return "{ \"idy\" : "+id+", \"name\" : \""+name+"\" }";
	}
}