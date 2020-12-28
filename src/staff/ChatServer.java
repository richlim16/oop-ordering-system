
package staff;

import java.net.*;
import java.io.*;

public class ChatServer
{  private Socket          socket   = null;
   private ServerSocket    server   = null;
   private DataInputStream streamIn =  null;
   private ChatWindow ch;
   public ChatServer(int port)
   {  
       ch = new ChatWindow();
       ch.setVisible(true);
       try
      { 
         server = new ServerSocket(port);  
         
         boolean done = false;
         while (!done)
         {  
             socket = server.accept();
             open();
             try
            {  String line = streamIn.readUTF();
            ch.print(line);
            }
            catch(IOException ioe)
            {  
                System.out.println("IOException has happened");
            }
         }
         close();
      }
      catch(IOException ioe)
      {  System.out.println(ioe); 
      }
   }
   public void open() throws IOException
   {  streamIn = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
   }
   public void close() throws IOException
   {  if (socket != null)    socket.close();
      if (streamIn != null)  streamIn.close();
   }
   public static void main(String args[])
   {  ChatServer server = null;
      if (args.length != 1)
         System.out.println("Usage: java ChatServer port");
      else
         server = new ChatServer(Integer.parseInt(args[0]));
   }
}