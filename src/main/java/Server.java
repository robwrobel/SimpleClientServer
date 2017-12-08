import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import org.json.JSONObject;

public class Server {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ServerSocket ss = new ServerSocket(4321);

        Socket socket = ss.accept();
/*
        OutputStream os = socket.getOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream((os));*/
        InputStream is = socket.getInputStream();
        ObjectInputStream ois = new ObjectInputStream(is);

        String string;
/*
        String fromServer = "Message From Server";
        oos.writeObject(fromServer);*/



        string = (String) ois.readObject();

        JSONObject object = new JSONObject(string);

        if (object.get("method").equals("simple_text")) {
            object.get("")
        }


        System.out.println(object);

    }
}
