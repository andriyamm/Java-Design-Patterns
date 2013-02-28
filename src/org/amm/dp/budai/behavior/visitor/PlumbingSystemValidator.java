package org.amm.dp.budai.behavior.visitor;

public class PlumbingSystemValidator implements IVisitor {
	
	public void Visit(OfficeBuilding building) {
		String plumbingState = (building.Age < 30) ? "Good" : "Bad";
		String buildingAge = (building.Age < 30) ? "New" : "Old";
		System.out
				.println(String
						.format("Plumbing state of building %s probably is in %s condition, since builing is %s.",
								building.BuildingName, plumbingState,
								buildingAge));
	}

	public void Visit(Floor floor) {
		System.out.println(String.format("Diagnosting plumbing on floor %d.",
				floor.getFloorNumber()));
	}

	public void Visit(Room room) {
		// we do nothing, since rooms do not have separated plumbing systems
	}
}
