package org.amm.dp.budai.structural.flyweight;

public class Goblin extends Unit
{
    public Goblin()
    {
        Name = "Goblin";
        Health = 8;
        //old
        Picture = Image.Load("Goblin.jpg");
        //new
        Picture = UnitImagesFactory.CreateGoblinImage();
    }
}

