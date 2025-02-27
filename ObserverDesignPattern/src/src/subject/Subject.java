package src.subject;

import src.observers.Observer;
import src.observers.Subscriber;

public interface Subject {

	//adding subscribers to channel
	void subscribe(Observer sc);

	//removing subscribers who unsubscribed the channel
	void unSubscribe(Observer sc);

	//notfying all the uses once video uploaded
	void notifySubscriber(String title);

	//uploading the video
	void uploadVideo(String title);

}