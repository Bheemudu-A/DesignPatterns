package src.observers;

import src.subject.Subject;

public interface Observer {

	
	void upload(String title);


	void subscribeChannel(Subject ch);

}