package itca_epam;

public class Video {
	int rating;
	String videoName;
	boolean checkout;
	public Video(String videoName) {
		super();
		this.videoName = videoName;
	}
	public int getRating() {
		return rating;
	}
	public void recieveRating(int rating) {
		this.rating = rating;
	}
	public String getName() {
		return videoName;
	}
	public void setVideoName(String videoName) {
		this.videoName = videoName;
	}
	public boolean getCheckout() {
		return checkout;
	}
	public void doreturn() {
		System.out.println(videoName+" returned successfully");
	}
	public void doCheckout() {
		checkout=true;
	}

}
