package za.co.crystalfire.networkinterfacecontroller.Manager;

import za.co.crystalfire.networkinterfacecontroller.networkController.Http;
import za.co.crystalfire.networkinterfacecontroller.networkController.NetworkInterface;

public class Controler {
    public Controler() {
        
    }
    
    public boolean startup_interface()
    {
        //start network componets
        start_network();
        return false;
    }

    //Network management component
    private void start_network(){
        NetworkInterface httpNetwork = new Http();
        
    }
    
    //Interface mangement component   
    private void start_interface(){
        
    }
}
