package traveler;

public class traveler {
	private String name;
	private int age;
	private int numOfMembership;
	
	
	
	public traveler (String name , int age, int numOfMembership )
	{
		this.age = age;
		this.name = name;
		this.numOfMembership = numOfMembership;
	}
	
	// get and set for name
	public String getName()
	{
	return this.name;
	
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	// get and set for age
	public int getAge()
	{
		return this.age;
		
	}
	public void setAge (int age)
	{
		this.age = age;
	}
	
	
	// get an d set for number of years with the membership
	public int getnumOfmembership()
	{
		return this.numOfMembership;
	}
	
	public void setNumOfMembership (int numOfMembership)
	{
		this.numOfMembership= numOfMembership;

	}
	
	
}
