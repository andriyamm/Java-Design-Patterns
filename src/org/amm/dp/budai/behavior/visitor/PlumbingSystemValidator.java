package org.amm.dp.budai.behavior.visitor;



public class PlumbingSystemValidator implements IVisitor
{
    public void Visit(OfficeBuilding building)
    {
        var plumbingState = (building.Age < 30) ? "Good" : "Bad";
        var buildingAge = (building.Age < 30) ? "New" : "Old";
        Console.WriteLine(string.Format("Plumbing state of building {0} probably is in {1} condition, since builing is {2}.", building.BuildingName, plumbingState, buildingAge));
    }
    public void Visit(Floor floor)
    {
        Console.WriteLine(string.Format("Diagnosting plumbing on floor {0}.", floor.FloorNumber));
    }
    public void Visit(Room room)
    {
        // we do nothing, since rooms do not have separated plumbing systems
    }
}
