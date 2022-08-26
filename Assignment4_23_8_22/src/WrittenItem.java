public class WrittenItem extends Item {
  public WrittenItem(int idNum2, String str, int n, String author, int y) {
		super();
		// TODO Auto-generated constructor stub
	}
private String author;
  void setAuthor(String str) {
	  author=str;
  }
  public String getAuthor() {
	  return author;
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
	public boolean equals(Object obj) {
		if(obj==null)
			return false;
		WrittenItem otherWrittenItem=(WrittenItem)obj;
		return super.equals(otherWrittenItem) && author==otherWrittenItem.author;
	}
  
}
