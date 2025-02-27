package src.subject;

import java.util.ArrayList;
import java.util.List;

import src.observers.Observer;
import src.observers.Subscriber;

public class Channel implements Subject {
	
	private List<Observer> subs = new ArrayList<>();
//	private String title;
	
	//adding subscribers to channel
	public void subscribe(Observer sc) {
		subs.add(sc);
	}
	
	//removing subscribers who unsubscribed the channel
	public void unSubscribe(Observer sc) {
		subs.remove(sc);
	}
	
	//notfying all the uses once video uploaded
	public void notifySubscriber(String title) {
		
		for(Observer sub : subs) {
			sub.upload(title);		
		}
		
	}
	
	//uploading the video
	public void uploadVideo(String title) {
		notifySubscriber(title);
	}

}
