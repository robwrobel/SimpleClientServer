import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException, InterruptedException, ClassNotFoundException {
        Socket socket = new Socket("127.0.0.1",4321);

        Thread.sleep(10000);
        OutputStream os = socket.getOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream((os));
/*
        InputStream is = socket.getInputStream();
        ObjectInputStream ois = new ObjectInputStream((is));

        String s = (String) ois.readObject();
        System.out.println(s);*/

        String test = "Thank you for connection";
        oos.writeObject(test);

        Thread.sleep(20000);


    }
}
