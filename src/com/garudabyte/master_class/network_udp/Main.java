package com.garudabyte.master_class.network_udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Main {

    public static void main(String[] args) {
	    try {
            DatagramSocket socket = new DatagramSocket(5000);

            while(true) {
                byte[] buffer = new byte[50];
                DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
                socket.receive(packet);
                System.out.println("Text received is: " + new String(buffer, 0, packet.getLength()));

                String returnString = "echo: " + new String(buffer, 0, packet.getLength());
                byte[] buffer2 = returnString.getBytes();
                InetAddress address = packet.getAddress();
                int port = packet.getPort();
                packet = new DatagramPacket(buffer2, buffer2.length, address, port);
                socket.send(packet);
            }

        } catch(SocketException e) {
            System.out.println("SocketException: " + e.getMessage());
        } catch(IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }
    }
}

// package com.garudabyte.master_class.network_udp;

// import java.io.IOException;
// import java.net.DatagramPacket;
// import java.net.DatagramSocket;
// import java.net.InetAddress;
// import java.net.SocketTimeoutException;
// import java.util.Scanner;

// public class Main {

//     public static void main(String[] args) {
//         try {
//             InetAddress address = InetAddress.getLocalHost();  // getByName()
//             DatagramSocket datagramSocket = new DatagramSocket();

//             Scanner scanner = new Scanner(System.in);
//             String echoString;

//             do {
//                 System.out.println("Enter string to be echoed: " );
//                 echoString = scanner.nextLine();

//                 byte[] buffer = echoString.getBytes();

//                 DatagramPacket packet = new DatagramPacket(buffer, buffer.length, address, 5000);
//                 datagramSocket.send(packet);

//                 byte[] buffer2 = new byte[50];
//                 packet = new DatagramPacket(buffer2, buffer2.length);
//                 datagramSocket.receive(packet);
//                 System.out.println("Text received is: " + new String(buffer2, 0, packet.getLength()));

//             } while(!echoString.equals("exit"));

//         } catch(SocketTimeoutException e) {
//             System.out.println("The socket timed out");
//         } catch(IOException e) {
//             System.out.println("Client error: " + e.getMessage());
//         }
//     }
// }

