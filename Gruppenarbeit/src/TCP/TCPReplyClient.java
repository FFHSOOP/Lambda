package TCP;

import java.io.*;
import java.net.*;

class TCPReplyClient {

    public static void main(String argv[]) throws Exception {
        String message;
        boolean run = true;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Server IP:");
        String serverIp = in.readLine();
        System.out.println("Port:");
        int port = Integer.parseInt(in.readLine());
        String modifiedMessage;
        while (run) {
            try (Socket clientSocket = new Socket(serverIp, port)) {
                DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
                BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                System.out.println("Message (type 'exit' to stop):");
                message = in.readLine();
                if(message.equals("exit")){
                    run = false;
                }
                outToServer.writeBytes(message + '\n');
                modifiedMessage = inFromServer.readLine();
                System.out.println("Reply from Server: " + modifiedMessage);
            }
        }
    }
}