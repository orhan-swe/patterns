package patterns.behavioral.observer.code;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

interface AllCode {
	
	static abstract class Observer {
		SubjectObservable subject;
		abstract void update();
	}
	
	static class PhoneClient extends Observer {
		PhoneClient(SubjectObservable subject) {
			this.subject = subject;
			subject.attach(this);
		}
		void update() {
			//In real world this would be something like this:
			//windowInterface.addToScreen("We got a message" + subject.getState());
			System.out.println("We got a message: " + subject.getState());
		}
	}
	
	static abstract class SubjectObservable {
		List<Observer> list = new ArrayList<>();
		
		abstract void setState(String message);
		abstract String getState();
		void attach(Observer o) {
			list.add(o);
		}
		void detach(Observer o) {
			list.remove(o);
		}
		void notifyObservers() {
			for(Observer o: list) {
				o.update();
			}
		}
	}
	
	static class MessageStream extends SubjectObservable {
		Deque<String> messageHistory = new ArrayDeque<>();
		@Override
		void setState(String message) {
			messageHistory.add(message);
			this.notifyObservers();
		}

		@Override
		String getState() {
			return messageHistory.pop();
		}
		
	}

}
