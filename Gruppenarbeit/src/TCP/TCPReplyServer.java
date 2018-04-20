package TCP;

import java.io.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;

class TCPReplyServer {
    private String clientMessage;
    private int port = 3553; //Default port
    private ServerSocket socket; //Prepare socket
    
    /**
     * Use default port
     */
    public TCPReplyServer(){
        try {
            socket = new ServerSocket(this.port); //Create and bind ServerSocket to port
        } catch (IOException ex) {
            System.out.println("Could not open socket");
            Logger.getLogger(TCPReplyServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Use custom port
     * @param port Socket port
     */
    public TCPReplyServer(int port){
        this.port = port;
        try {
            socket = new ServerSocket(this.port); //Create and bind ServerSocket to port
        } catch (IOException ex) {
            System.out.println("Could not open socket");
            Logger.getLogger(TCPReplyServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ServerSocket getServerSocket(){
        return socket;
    }
    
    public String getClientMessage(){
        return clientMessage;
    }
    
    public void setClientMessage(String clientMessage){
        this.clientMessage = clientMessage;
    }
    
    public String getCapitalizedMessage(){
        return clientMessage.toUpperCase() + '\n';
    }

    public static void main(String argv[]) throws Exception {
        TCPReplyServer trs = new TCPReplyServer();

        while (true) {
            Socket connectionSocket; //Prepare connection
            connectionSocket = trs.getServerSocket().accept(); //Waits until a connection to this socket is made
            BufferedReader inFromClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream())); //InputStream to BufferedReader
            DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream()); //OutputStream to DataOutputStream
            trs.setClientMessage(inFromClient.readLine());
            System.out.println("Received: " + trs.getClientMessage());
            outToClient.writeBytes(trs.getCapitalizedMessage()); //Send back modified message
        }
    }
}
