package com.designPatterns.Behavioural.XState;

public class Delivered  implements PackageState{

	//Singleton instance of This State
    private static Delivered instance = new Delivered();
 
    private Delivered() {}
 
    public static Delivered instance() {
        return instance;
    }
    
    /////////////////////////////
     
    //Business logic
    @Override
    public void updateState(DeliveryContext ctx) 
    {
        System.out.println("Package is delivered!!");
    }
}
