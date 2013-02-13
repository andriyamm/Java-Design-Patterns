package org.amm.dp.budai.behavior.visitor;



public class Room implements IElement
{
    public int RoomNumber { get; private set; }

    public Room(int roomNumber)
    {
        RoomNumber = roomNumber;
    }
    public void Accept(IVisitor visitor)
    {
        visitor.Visit(this);
    }
}
