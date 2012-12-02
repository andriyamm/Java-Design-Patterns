package org.amm.dp.budai.creational.prototype;

import java.util.Date;

public class PrototypeDemo {
	
	public static CalendarEvent GetExistingEvent() {
		CalendarEvent beerParty = new CalendarEvent();
		Attendee[] friends = new Attendee[1];
		Attendee andriy = new Attendee("Andriy", "Buday");
		friends[0] = andriy;
		beerParty.Attendees = friends;
		beerParty.StartDateAndTime = new Date();
		beerParty.Priority = Priority.High();

		return beerParty;
	}

	public static void main(String[] args) {
		CalendarEvent beerParty = GetExistingEvent();
		CalendarEvent nextFridayEvent = new CalendarEvent();

		try {
			nextFridayEvent = (CalendarEvent) beerParty.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		nextFridayEvent.StartDateAndTime = new Date();

		// про цей код побалакаємо трішки нижче
		nextFridayEvent.Attendees[0].EmailAddress = "andriybuday@liamg.com";
		nextFridayEvent.Priority.SetPriorityValue(0);

		if (beerParty.Attendees != nextFridayEvent.Attendees) {
			System.out.println("GOOD: Each event has own list of attendees.");
		}
		if (beerParty.Attendees[0].EmailAddress == nextFridayEvent.Attendees[0].EmailAddress) {
			// В цьому випадку добре мати поверхневу копію кожного із учасників
			// таким чином моя адреса, ім'я і персональні дані залишаються тими
			// ж
			System.out
					.println("GOOD: If I updated my e-mail address it will be updated in all events.");
		}
		if (beerParty.Priority.IsHigh() != nextFridayEvent.Priority.IsHigh()) {
			System.out
					.println("GOOD: Each event should have own priority object, fully-copied.");
		}
	}
}