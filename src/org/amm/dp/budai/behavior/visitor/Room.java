package org.amm.dp.budai.behavior.visitor;

public class Room implements IElement {
	
	public int roomNumber;

	public Room(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public void Accept(IVisitor visitor) {
		visitor.Visit(this);
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

}
