import java.io.BufferedReader;
import java.io.FileReader;


public class patientLinkedList {

	private String first;
	private String last;
	private String id;
	private String nurseId; 
	private String lastCheckUp;
	private patientLinkedList next;
	
	
	
	public patientLinkedList(String id1, String first1, String last1, String nurseId1, String lastCheckUp1)
	{
		id = id1;
		first = first1;
		last = last1;
		nurseId = nurseId1;
		lastCheckUp = lastCheckUp1;
	}
	
	public void setNext(patientLinkedList given)
	{
		next = given;
	}

	public patientLinkedList getNext()
	{
		return next;
	}
	
	public String getId()
	{
		return id;
	}
	public String getFirstName()
	{
		return first;
	}

	public String getLastName()
	{
		return last;
	}
	
	public String getNurseId()
	{
		return nurseId;
	}
	
	public String getLastCheckUp()
	{
		return lastCheckUp;
	}
}
