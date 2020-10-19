package socket_learning;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocket01 {
    public static void main(String[] args) {
        try {
            // 初始化服务端并且监听8080端口
            ServerSocket server = new ServerSocket(8080);
            // 等待客户连接
            Socket socket = server.accept();
            // 获取输入流，并指定统一的编码格式
            BufferedReader is = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
            // 读取一行数据
            String line;
            // 通过while循环不断读取信息
            while ((line = is.readLine()) != null) {
                System.out.println(line);
            }
			/*PrintWriter pw = new PrintWriter(socket.getOutputStream());
			pw.println("received data: " + line);
			pw.flush();
			pw.close();
			is.close();
			socket.close();
			server.close();*/
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
