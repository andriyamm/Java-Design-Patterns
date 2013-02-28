package org.amm.dp.budai.behavior.visitor;

public class ElectricitySystemValidator implements IVisitor {
	
	public void Visit(OfficeBuilding building) {
		String electricityState = (building.ElectricitySystemId > 1000) ? "Good"
				: "Bad";
		System.out.println(String.format(
				"Main electric shield in building %s is in %s state.",
				building.BuildingName, electricityState));
	}

	public void Visit(Floor floor) {
		System.out
				.println(String.format("Diagnosting electricity on floor %d.",
						floor.getFloorNumber()));
	}

	public void Visit(Room room) {
		System.out.println(String.format("Diagnosting electricity in room %d.",
				room.roomNumber));
	}
}
