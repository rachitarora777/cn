import java.io.*;

import java.net.*;

public class SocketServer{

public static void main(String[] args){

try{

ServerSocket ss=new ServerSocket(5555);

Socket s=ss.accept();

DataInputStream dis=new DataInputStream(s.getInputStream()); String str=(String)dis.readUTF(); System.out.println("message= "+str);

DataOutputStream dout=new DataOutputStream(s.getOutputStream());

dout.writeUTF("This is server");

dout.flush();

dout.close();

ss.close();

}

catch(Exception e){System.out.println(e);}

}

}
