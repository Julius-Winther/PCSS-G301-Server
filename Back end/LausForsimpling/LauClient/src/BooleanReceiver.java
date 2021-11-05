import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class BooleanReceiver implements Runnable {
    Socket socket;
    DataInputStream input;

    public BooleanReceiver(Socket socket) throws IOException {
        this.socket = socket;
        input = new DataInputStream(socket.getInputStream());
    }

    public boolean receiveBoolean() throws IOException {
        return input.readBoolean();
    }

    @Override
    public void run() {

    }
}