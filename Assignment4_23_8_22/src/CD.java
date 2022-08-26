abstract class MediaItem{
	private int runTime;
    class Video extends MediaItem{
		private String directior;
		private String genre;
		private int year;
	}
	public int getRunTime() {
		return runTime;
	}
	public void setRunTime(int runTime) {
		this.runTime = runTime;
	}
}
 class CD extends MediaItem {
  private String artist;
  private String genre;

 public boolean equals(Object obj) {
	 if(obj==null)
		 return false;
	 MediaItem otherMediaItem=(MediaItem)obj;
	 return super.equals(otherMediaItem) && getRunTime() == otherMediaItem.getRunTime();
 }
 }
