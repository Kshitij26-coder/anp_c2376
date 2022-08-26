
abstract class Item {
	private int idNum;
	private String title;
	private int numCopies;
	
	public Item() {
		// TODO Auto-generated constructor stub
	}
	public void item() {
		idNum=0;
		title="";
		numCopies=0;
		
		
	}
	public void item(int idNum,String title,int numCopies) {
		this.idNum=idNum;
		this.title=title;
		this.numCopies=numCopies;
	}	
		public int setidNum(int id) {
			idNum=id;
			return id;
		}
		
	
	public String setTitle(String str) {
		title= str;
		return str;
	}
	public int setNumCopies(int n) {
		numCopies=n;
		return n;
		
	}
	public String getTitle() {
		return title;
		
	}
	public int getCopies() {
		return numCopies;
	}
	public void checkIn() {
		numCopies =numCopies+1;
	}
	public void checkOut() {
		numCopies =numCopies-1;
	}
	public void addItem(int idNum,String str,int n) {
		setidNum(idNum);
		setTitle(str);
		setNumCopies(n);
	}
	public String toString() {
		return "ID:" +idNum+"Title: "+title+"Number of Copies"+numCopies;
	}
	public void print() {
		System.out.println("Title: "+title);
		System.out.println("ID: "+idNum);
		System.out.println("Number of Copies: "+numCopies);
	}
	public boolean equals(Object obj) {
		if(obj==null)
			return false;
		Item otherItem =(Item)obj;
		return idNum==otherItem.idNum&&title==otherItem.title&&numCopies==otherItem.numCopies;
		
	}
	public void additem() {
		numCopies++;
		
	}
	public int getIdNum() {
		// TODO Auto-generated method stub
		return 0;
	}
	public int getNumCopies() {
		// TODO Auto-generated method stub
		return 0;
	}
	public String getAuthor() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
