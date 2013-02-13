package org.amm.dp.budai.behavior.visitor;

interface IVisitor
{
    void Visit(OfficeBuilding building);
    void Visit(Floor floor);
    void Visit(Room room);
}


