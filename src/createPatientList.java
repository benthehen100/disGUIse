import java.io.BufferedReader;
import java.io.FileReader;

public class createPatientList
{
	private String first;
	private String last;
	private String id;
	private String nurseId; 
	private String lastCheckUp;
	public patientLinkedList head;
	

	public createPatientList()
	{
		FileReader fr; //reads data from file
		try {
			fr = new FileReader("patientList.txt");
		
			BufferedReader br = new BufferedReader(fr);
			patientLinkedList temp;
			System.out.println("id: " + id);
			head = null;
			
			while( (id = br.readLine()) != null)
			{
				first = br.readLine(); //sets lines to variables
				last = br.readLine();
				nurseId = br.readLine();
				lastCheckUp = br.readLine();
				temp = head;
				head = new patientLinkedList(id, first, last, nurseId, lastCheckUp);
				head.setNext(temp);
				System.out.println("id: " + id);
			}
				
			
		fr.close();
		
		} catch (Throwable e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		

	}
	}