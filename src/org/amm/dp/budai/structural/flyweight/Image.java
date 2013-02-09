package org.amm.dp.budai.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Image
{
    private List<String> _imitatesHugeImage = new ArrayList<String>();
    
    public static Image Load(String fileName)
    {
    	Image img = new Image();
        for (int i = 0; i < 10000; i++)
        {
            img._imitatesHugeImage.add(String.format("abcdefgh:%i", i));
        }
        return img;
    }
}
