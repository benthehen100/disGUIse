class Link {
	public String username;
	public String password;
	public String type;
	public String recovery, id, answer;
	public Link next;
	
	public Link(String a, String b, String c, String d, String e, String f)
	{
		username = a;
		password = b;
		type = c;
		id = d;
		recovery = e;
		answer = f;
	}
}

class linkList
{
	public Link head;
	public linkList()
	{
		head = null;
	}
	
	public void insert(String a, String b, String c, String d, String e, String f)
	{
		Link link = new Link(a,b,c,d,e,f);
		Link temp = head;
		link.next = null;
		
		if(head == null)
		{
			head = link;
		}
		else
		{
			while (temp.next != null)
			{
				temp = temp.next;
			}
			
			temp.next = link;
		}
		//link.next = head;
		//head = link;
	}
	
	public void printList()
	{
		Link temp;
		temp = head;
		while(temp != null)
		{
			System.out.print("Username: " + temp.username + "      ");
			System.out.print("passWord: " + temp.password + "      ");
			System.out.print("Position: " + temp.type + "        ");
			System.out.print("Position: " + temp.type + "        ");
			System.out.print("id: " + temp.type + "        ");
			System.out.print("recovery: " + temp.type + "        ");
			System.out.print("answer: " + temp.type + "/n");
			temp = temp.next;
		}
	}

}