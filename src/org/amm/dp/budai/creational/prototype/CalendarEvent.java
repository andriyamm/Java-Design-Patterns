package org.amm.dp.budai.creational.prototype;

import java.util.Date;

public class CalendarEvent extends CalendarPrototype {
	
	public Attendee[] Attendees;
	public Priority Priority;
	public Date StartDateAndTime;

	@Override
	public CalendarPrototype clone() throws CloneNotSupportedException {
		CalendarEvent copy = (CalendarEvent) super.clone();

		// this allows us have another list, but same attendees there
		Attendee[] copiedAttendees = (Attendee[]) Attendees.clone();
		copy.Attendees = copiedAttendees;

		// we also would like to copy priority
		copy.Priority = (Priority) Priority.clone();

		return copy;
	}
}