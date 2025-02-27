package main;

import src.observers.Observer;
import src.observers.Subscriber;
import src.subject.Channel;
import src.subject.Subject;

public class Youtube {
	
	
	/*
	 * In this, Channel is Subject and Subscribers are objects
	 * When the state of Subject changes, all it's observers are notified automatically
	 * ex: when video uploaded to channel all it's subscribers get notified
	 */
	public static void main(String[] args) {
		
		//initializing channel
		Subject ch = new Channel();
		
		//creating subscriber object
	//	Subscriber s1 = new Subscriber("Bheem");
		Observer s1 = new Subscriber("Bheem");//implimenting interface
		Observer s2 = new Subscriber("Koushika");
		Observer s3 = new Subscriber("Srinu");
		Observer s4 = new Subscriber("Ramesh");
		
		//subcribing to the channel
		ch.subscribe(s1);
		ch.subscribe(s2);
		ch.subscribe(s3);
		ch.subscribe(s4);
		
		ch.uploadVideo("Observer Design Pattern Video uploaded from Telusko");
		
		//I think it's not needed
		s1.subscribeChannel(ch);
		s2.subscribeChannel(ch);
		s3.subscribeChannel(ch);
		s4.subscribeChannel(ch);
		
		//srinu unsubscribed the channel
		ch.unSubscribe(s3);
		System.out.println();
		
		ch.uploadVideo("Factory Design Pattern Video uploaded from Telusko");
		
	}

}
