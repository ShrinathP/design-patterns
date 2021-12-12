package com.designPatterns.Creational.Prototype;

import com.designPatterns.Creational.Prototype.PrototypeFactory.ModelType;

public class TestPrototype {

	public static void main(String[] args)
    {
        try
        {
            String moviePrototype  = PrototypeFactory.getInstance(ModelType.MOVIE).toString();
            System.out.println(moviePrototype);
 
            String albumPrototype  = PrototypeFactory.getInstance(ModelType.ALBUM).toString();
            System.out.println(albumPrototype);
 
            String showPrototype  = PrototypeFactory.getInstance(ModelType.SHOW).toString();
            System.out.println(showPrototype);
            
            String showPrototype2  = PrototypeFactory.getInstance(ModelType.SHOW).toString();
            System.out.println(showPrototype2);
 
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
    }
}
