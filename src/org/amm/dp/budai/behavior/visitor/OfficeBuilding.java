package org.amm.dp.budai.behavior.visitor;

import java.util.ArrayList;
import java.util.List;

public class OfficeBuilding implements IElement {
	
	private final List<Floor> _floors = new ArrayList<Floor>();
	public String BuildingName;
	public int Age;
	public int ElectricitySystemId;

	public Iterable<Floor> Floors;

	public OfficeBuilding(String buildingName, int age, int electricitySystemId) {
		BuildingName = buildingName;
		Age = age;
		ElectricitySystemId = electricitySystemId;
	}

	public void AddFloor(Floor floor) {
		_floors.add(floor);
	}

	public void Accept(IVisitor visitor) {
		visitor.Visit(this);
		for (Floor floor : Floors) {
			floor.Accept(visitor);
		}
	}

	public String getBuildingName() {
		return BuildingName;
	}

	public void setBuildingName(String buildingName) {
		BuildingName = buildingName;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public int getElectricitySystemId() {
		return ElectricitySystemId;
	}

	public void setElectricitySystemId(int electricitySystemId) {
		ElectricitySystemId = electricitySystemId;
	}

	public Iterable<Floor> getFloors() {
		return Floors;
	}

	public void setFloors(Iterable<Floor> floors) {
		Floors = floors;
	}

}
