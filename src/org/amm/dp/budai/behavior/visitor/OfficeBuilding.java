package org.amm.dp.budai.behavior.visitor;



public class OfficeBuilding implements IElement
{
    private readonly IList<Floor> _floors = new List<Floor>();
    public string BuildingName { get; private set; }
    public int Age { get; set; }
    public int ElectricitySystemId { get; set; }

    public IEnumerable<Floor> Floors { get { return _floors; } }

    public OfficeBuilding(string buildingName, int age, int electricitySystemId)
    {
        BuildingName = buildingName;
        Age = age;
        ElectricitySystemId = electricitySystemId;
    }
    public void AddFloor(Floor floor)
    {
        _floors.Add(floor);
    }
    public void Accept(IVisitor visitor)
    {
        visitor.Visit(this);
        foreach (var floor in Floors)
        {
            floor.Accept(visitor);
        }
    }
}
