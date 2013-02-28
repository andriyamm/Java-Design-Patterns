package org.amm.dp.budai.behavior.visitor;

import java.util.ArrayList;
import java.util.List;

public class Floor implements IElement {
	
	private final List<Room> roomsList = new ArrayList<Room>();
	private int floorNumber;
	private Iterable<Room> rooms;

	public Floor(int floorNumber) {
		this.floorNumber = floorNumber;
	}

	public void AddRoom(Room room) {
		roomsList.add(room);
	}

	public void Accept(IVisitor visitor) {
		visitor.Visit(this);
		for (Room room : rooms) {
			room.Accept(visitor);
		}
	}

	public int getFloorNumber() {
		return floorNumber;
	}

	public void setFloorNumber(int floorNumber) {
		this.floorNumber = floorNumber;
	}

	public Iterable<Room> getRooms() {
		return roomsList;
	}

}
