import java.io.*;

import java.net.*;

public class SocketClient {

public static void main(String[] args) {

try{

Socket s=new Socket("localhost", 5555);

DataOutputStream dout=new DataOutputStream(s.getOutputStream()); dout.writeUTF("Hello Server");
//	dout.flush();

//	dout.close();

//	s.close();
 
DataInputStream dis=new DataInputStream(s.getInputStream()); String str = (String)dis.readUTF(); System.out.println("Received:"+str); s.close();

}

catch(Exception e){

System.out.println(e);

}

}

}



