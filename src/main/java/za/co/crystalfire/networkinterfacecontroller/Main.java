package za.co.crystalfire.networkinterfacecontroller;
import za.co.crystalfire.networkinterfacecontroller.Manager.Controler;
import za.co.crystalfire.networkinterfacecontroller.networkController.Http;
import za.co.crystalfire.networkinterfacecontroller.pooler.PoolerController;

public class Main {
    public static void main(String[] args) {
        System.out.println("start connect");
        Controler controler = new Controler();
        PoolerController poolerController = new PoolerController();
        Http http = new Http();
        http.start();
    }
}
