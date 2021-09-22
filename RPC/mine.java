import java.io.*; 
import java.net.*;
class mine 
{
 public static void main(String[] args) throws Exception
 {
  Socket sock = new Socket("127.0.0.1", 5555); 
  BufferedReader keyRead = new BufferedReader(new InputStreamReader(System.in)); 
  OutputStream ostream = sock.getOutputStream(); 
  PrintWriter pwrite = new PrintWriter(ostream, true); 
  InputStream istream = sock.getInputStream(); 
  BufferedReader receiveRead = new BufferedReader(new InputStreamReader(istream));   
  System.out.println("Client ready, type and press Enter key");
  String receiveMessage, sendMessage,temp; 
  while(true) 
  {
   System.out.println("\nEnter operation to perform(add,sub,mul,div)");
   temp = keyRead.readLine();
   sendMessage=temp.toLowerCase(); 
   pwrite.println(sendMessage);
   System.out.println("Enter first number :");
   sendMessage = keyRead.readLine(); 
   pwrite.println(sendMessage);
   System.out.println("Enter second number : ");
   sendMessage = keyRead.readLine(); 
   pwrite.println(sendMessage);
   System.out.flush(); 
   if((receiveMessage = receiveRead.readLine()) != null) 
    System.out.println(receiveMessage); 
  }
 }
}