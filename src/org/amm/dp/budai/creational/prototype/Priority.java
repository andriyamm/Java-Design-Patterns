package org.amm.dp.budai.creational.prototype;

public class Priority implements Cloneable {
	
	private int _priority;

	private Priority(int priority) {
		_priority = priority;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public static Priority High() {
		return new Priority(1);
	}

	public static Priority Low() {
		return new Priority(-1);
	}

	public void SetPriorityValue(int priority) {
		_priority = priority;
	}

	public boolean IsHigh() {
		return _priority > 0;
	}
}
