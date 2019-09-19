package socket_learning;

import java.io.IOException;
import java.net.Socket;

/**
 * describe:
 *
 * @author xiongyi
 * @date 2019/08/14
 */
public class ClientSocket02 {

  public static void main(String[] args) {

    try {
      Socket socket = new Socket("127.0.0.1", 9999);
    } catch (IOException e) {
      e.printStackTrace();
    }

  }

}
