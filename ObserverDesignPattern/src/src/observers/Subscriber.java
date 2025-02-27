package src.observers;
import src.subject.Channel;
import src.subject.Subject;

public class Subscriber implements Observer {
	
	private String name;
	private Subject channel = new Channel();
	
	
	public Subscriber(String name) {
		this.name = name;
	}
	
	//displaying it to users
	public void upload(String title) {
		System.out.println("Hii "+name +", "+title);
	}
	
	//subscribing the channel
	public void subscribeChannel(Subject ch) {
		channel = ch;
	}
	
	

}
