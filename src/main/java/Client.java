import java.io.*;
import java.net.Socket;
import org.json.JSONObject;


public class Client {
    public static void main(String[] args) throws IOException, InterruptedException, ClassNotFoundException {
        Socket socket = new Socket("127.0.0.1",4321);

        OutputStream os = socket.getOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream((os));
/*
        InputStream is = socket.getInputStream();
        ObjectInputStream ois = new ObjectInputStream((is));

        String s = (String) ois.readObject();
        System.out.println(s);*/
        JSONObject obj = new JSONObject();
        obj.put("method", "simple_text");
        obj.put("value", "Welcome");

        String s = obj.toString();

        oos.writeObject(s);

        Thread.sleep(20000);


    }
}
