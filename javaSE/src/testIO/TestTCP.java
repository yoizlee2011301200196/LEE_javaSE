package testIO;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

import org.junit.Test;

public class TestTCP {

	@Test
	public void client(){
		Socket s=null;
		OutputStream os=null;
		InputStream is=null;
		try {
			s = new Socket(InetAddress.getByName("127.0.0.1"),9897);
			os = s.getOutputStream();
			os.write("�ͻ��˷��͵���Ϣ��".getBytes());
			
			s.shutdownOutput();
			is = s.getInputStream();
			byte[] b = new byte[30];
			int len;
			while((len=is.read(b))!=-1){
				System.out.println(new String(b,0,len));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try{
				if(is!=null){
					is.close();		
				}
				if(os!=null){
					os.close();				
				}
				if(s!=null){
					s.close();				
				}
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
	
	@Test
	public void server(){
		ServerSocket ss=null;
		Socket s=null;
		InputStream is=null;
		OutputStream os=null;
		try {
			ss = new ServerSocket(9897);
			s = ss.accept();
			is = s.getInputStream();
			byte[] b = new byte[30];
			int len;
			while((len=is.read(b))!=-1){
				System.out.println(new String(b,0,len));
			}
			
			os = s.getOutputStream();
			os.write("�������յ��˿ͻ��˵���Ϣ".getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try{
				if(os!=null){
					os.close();				
				}
				if(is!=null){
					is.close();				
				}
				if(s!=null){
					s.close();				
				}
				if(ss!=null){
					ss.close();				
				}
			}catch(IOException e){
				e.printStackTrace();
			}
		}
		
	}
}
