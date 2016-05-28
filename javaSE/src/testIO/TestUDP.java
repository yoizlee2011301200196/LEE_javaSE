package testIO;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

import org.junit.Test;

public class TestUDP {
	
	@Test
	public void send(){
		DatagramSocket ds= null;
		try {
			byte[] buf = "发送端的数据包".getBytes();
			DatagramPacket dp = new DatagramPacket(buf, 0, buf.length,InetAddress.getByName("127.0.0.1"),9899);
			ds = new DatagramSocket();
			ds.send(dp);
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(ds!=null){
				ds.close();				
			}
		}
	}
	
	@Test
	public void receive(){
		DatagramSocket ds=null;
		try {
			byte[] b = new byte[30];
			DatagramPacket dp = new DatagramPacket(b, 0, b.length);
			ds = new DatagramSocket(9899);
			ds.receive(dp);
			System.out.println(new String(dp.getData()));
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(ds!=null){
				ds.close();							
			}
		}
	}
}
