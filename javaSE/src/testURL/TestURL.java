package testURL;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

import org.junit.Test;

public class TestURL {

	//测试时要先打开服务器，比如tomcat
	//利用URL获取服务器的资源
	@Test
	public void test1(){
		InputStream is=null;
		try {
			URL url = new URL("http://127.0.0.1:8080/examples/hello.txt");
			//URL url = new URL("http://Git@github.com:80/yoizlee2011301200196/learngit/readme.txt");
			System.out.println(url.getProtocol());
			System.out.println(url.getHost());
			System.out.println(url.getPort());
			System.out.println(url.getPath());
			System.out.println(url.getFile());
			System.out.println(url.getRef());
			System.out.println(url.getQuery());
			System.out.println();
			
			is = url.openStream();
			byte[] b = new byte[1024];
			int len;
			StringBuffer sb = new StringBuffer();
			while((len=is.read(b))!=-1){
				sb.append(new String(b, 0, len));
			}
			System.out.println(sb);
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(is!=null){
				try {
					is.close();
				} catch (IOException e) {
					e.printStackTrace();
				}				
			}
		}
	}
	
	//利用URL获取URLConnection，然后再获取服务器的资源
	@Test
	public void test2(){
		InputStream is=null;
		FileOutputStream fos=null;
		try {
			URL url = new URL("http://127.0.0.1:8080/examples/hello.txt");
			URLConnection con = url.openConnection();
			is = con.getInputStream();
			byte[] b = new byte[1024];
			int len;
			StringBuffer sb = new StringBuffer();
			while((len=is.read(b))!=-1){
				sb.append(new String(b,0,len));
			}
			fos = new FileOutputStream("url.txt");
			fos.write(sb.toString().getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try{
				if(fos!=null){
					fos.close();				
				}
				if(is!=null){
					is.close();				
				}
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
}
