
public class JournalPaper extends Item {
	private int pubYear;
	JournalPaper(){
		super();
	}
	public JournalPaper(int idNum,String str, int n, String author,int y) {
		super();
		pubYear=y;
	}
	public String toString() {
		return super.toString()+"Year published: "+pubYear;
		}
	public int getIdNum() {
		return super.getIdNum();
		}
	public String getTitle() {
		return super.getTitle();
		
	}
	public int getNumCopies() {
		return super.getNumCopies();
	}
	public String getAuthor() {
		return super.getAuthor();
	
	}
	public int yearPub() {
		return yearPub();
	}
	public void print() {
		super.print();
		System.out.println("Yea published: "+pubYear);
		
	}
	public void checkIn() {
		
	}
    public void checkOut() {
    	
    }
    public void addItem() {
    	super.addItem(pubYear, getAuthor(), pubYear);
    }
}
