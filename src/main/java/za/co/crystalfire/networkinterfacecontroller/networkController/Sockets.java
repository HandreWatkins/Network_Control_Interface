package za.co.crystalfire.networkinterfacecontroller.networkController;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import za.co.crystalfire.networkinterfacecontroller.pooler.PoolerController;

public class Sockets<T> implements NetworkInterface{
    private Socket netSocket;
    
    private final PoolerController threadPool;
    
    public Sockets(PoolerController masterThread) {
        threadPool = masterThread;
    }
    
    /**
     * @since 0.0.1 
     */
    @Override
    public void send(){
        netSocket = new Socket();
        try {
            netSocket.connect(new InetSocketAddress(8585));
            //netSocket.
        } catch (IOException ex) {
            Logger.getLogger(Sockets.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void start() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
