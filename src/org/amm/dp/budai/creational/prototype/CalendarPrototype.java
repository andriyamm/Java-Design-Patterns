package org.amm.dp.budai.creational.prototype;

public class CalendarPrototype {
	
	public CalendarPrototype clone() throws CloneNotSupportedException {
		CalendarPrototype copyOfPrototype = (CalendarPrototype) this.clone();
		return copyOfPrototype;
	}
}