package patterns.behavioral.observer.code;

import patterns.behavioral.observer.code.AllCode.MessageStream;
import patterns.behavioral.observer.code.AllCode.PhoneClient;

public class Client {

	public static void main(String[] args) {
		MessageStream subject = new MessageStream();
		PhoneClient phoneClient = new PhoneClient(subject);
		subject.setState("here is an message");
		subject.setState("here is an one more message");
		//could also instad to this like this:
		//phoneClient.addMessage("here is an message");
		//but in that case 
	}
	
}
