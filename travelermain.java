package traveler;
import java.util.*;

public class travelermain {
	
	public final static int arrSize = 50;
	public static Scanner in=new Scanner (System.in);
	public static void main(String[] args) {
		// traveler
traveler[] trav = new traveler[arrSize];

String name = null ;
int age = 0;
int numOfYears = 0;
int minAge =0;
String nameOfyoung= null;
int counter =0;
int counter2 =0;
int avg=0;
for (int i=0; i<trav.length; i++)
{
	System.out.println("etnter age:");
	age = in.nextInt();
	System.out.println("enter name:");
	name = in.next();
	System.out.println("enter number of membership woth service:");
	numOfYears = in.nextInt();
	trav[i]= new traveler (name, age, numOfYears);

}
// get the youngest travalers name and age

minAge = trav[0].getAge();

for (int j=0; j<trav.length; j++)
{
	
	
	if ( minAge>=(trav[j].getAge()))
	{
		minAge = trav[j].getAge();
		nameOfyoung = trav[j].getName();
	}
	

}
// get the number of travlers that have membership at least half of there life
System.out.println("the youngest travelers age is "+ minAge);
System.out.println("and his name is " + nameOfyoung);


for (int h=0; h<trav.length; h++)
{
	if (trav[h].getnumOfmembership()>= trav[h].getAge()/2)
	{
		counter ++;
	}
}
System.out.println("the number of people who have a membership at least half of there life is " + counter);
// avredge
for (int y=0; y<trav.length; y++)
{
	if (trav[y].getnumOfmembership()<=3)
	{
		counter2 ++;
		avg+= trav[y].getAge();
	}
		
}
 avg/=counter2;
 System.out.println("the age avvredge that have ha membership for more thaen 3 yers is:  "+ avg);
 

	}

}
