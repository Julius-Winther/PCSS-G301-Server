import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException
    {
        AcceptTask acceptTask = new AcceptTask();
        Thread thread = new Thread(acceptTask);
        thread.start();
    }
}
