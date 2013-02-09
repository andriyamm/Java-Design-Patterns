package org.amm.dp.budai.structural.bridge;


public class BridgeDemo
{
    public static void Run()
    {
        // We have two wall creating crews - concrete blocks one and bricks one
        IWallCreator brickWallCreator = new BrickWallCreator();
        IWallCreator conctreteSlabWallCreator = new ConcreteSlabWallCreator();

        IBuldingCompany buildingCompany = new BuldingCompany();
        buildingCompany.BuildFoundation();

        buildingCompany.setWallCreator(conctreteSlabWallCreator);
        buildingCompany.BuildRoom();

        // Company can easily switch to another wall crew to continue building rooms
        // with another material
        buildingCompany.setWallCreator(brickWallCreator);
        buildingCompany.BuildRoom();
        buildingCompany.BuildRoom();

        buildingCompany.BuildRoof();
    }
}
