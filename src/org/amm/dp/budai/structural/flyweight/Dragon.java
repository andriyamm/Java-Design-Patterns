package org.amm.dp.budai.structural.flyweight;


public class Dragon extends Unit
{
    public Dragon()
    {
        Name = "Dragon";
        Health = 50;
        //old
        Picture = Image.Load("Dragon.jpg");
        //new
        Picture = UnitImagesFactory.CreateDragonImage();
    }
}


