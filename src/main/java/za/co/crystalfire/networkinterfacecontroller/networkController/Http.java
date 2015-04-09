package za.co.crystalfire.networkinterfacecontroller.networkController;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Http implements NetworkInterface{
    private static final boolean keepAlive = true;
    
    public Http() {
        
    }

    @Override
    public void send() {
        
    }

    @Override
    public void start() {
        HttpServer httpConnect;
        
        /*while(keepAlive)
        {*/
            try {
                httpConnect = HttpServer.create(new InetSocketAddress(8855),0);
                httpConnect.createContext("/test", new MyHandler());
                httpConnect.setExecutor(null); // creates a default executor
                httpConnect.start();
            } catch (IOException ex) {
                Logger.getLogger(Http.class.getName()).log(Level.SEVERE, null, ex);
            }
        //}
    }

    private static class MyHandler implements HttpHandler {

        public MyHandler() {
            
        }

        @Override
        public void handle(HttpExchange he) throws IOException {
            System.out.println("test");
        }
    }
}
