class Link {
	public String username;
	public String password;
	public String type; 
	public Link next;
	
	public Link(String a, String b, String c)
	{
		username = a;
		password = b;
		type = c;
	}
}

class linkList
{
	public Link head;
	public linkList()
	{
		head = null;
	}
	
	public void insert(String a, String b, String c)
	{
		Link link = new Link(a,b,c);
		link.next = head;
		head = link;
	}
	
	public void printList()
	{
		Link temp;
		temp = head;
		while(temp != null)
		{
			System.out.print("Username: " + temp.username + "      ");
			System.out.print("passWord: " + temp.password + "      ");
			System.out.print("Position: " + temp.type + "\n");
			temp = temp.next;
		}
	}

}