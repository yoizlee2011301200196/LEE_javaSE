// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) ansi 
// Source File Name:   TestStream.java

package testStream;

import java.io.*;

import org.junit.Test;

// Referenced classes of package testStream:
//            TestSerializable

public class TestStream
{

    @Test
    public void test1()
    {
        long start;
        FileInputStream fis=null;
        FileOutputStream fos=null;
        start = System.currentTimeMillis();
        File file = new File("test.txt");
        try
        {
            fis = new FileInputStream(file);
            fos = new FileOutputStream(new File("test1.txt"));
            byte b[] = new byte[5];
            int len;
            while((len = fis.read(b)) != -1) 
            	fos.write(b, 0, len);
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }catch(IOException e)
        {
            e.printStackTrace();
        }finally{
        	try {
        		if(fos !=null)
				fos.close();
        		if(fis !=null)
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
        }
        long end = System.currentTimeMillis();
        System.out.println((new StringBuilder("花费时间为： ")).append(end - start).toString());
        return;
    }

    @Test
    public void test2()
    {
        long start;
        BufferedInputStream bis=null;
        BufferedOutputStream bos=null;
        start = System.currentTimeMillis();

        try
        {
            bis = new BufferedInputStream(new FileInputStream(new File("test.txt")));
            bos = new BufferedOutputStream(new FileOutputStream(new File("test2.txt")));
            byte b[] = new byte[5];
            int len;
            while((len = bis.read(b)) != -1) 
            {
            	bos.write(b, 0, len);
            	bos.flush();
            }
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }catch(IOException e)
        {
            e.printStackTrace();
        }finally{
            	try {
            		if(bis !=null)
            		bis.close();
            		if(bos!=null)
					bos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
            }
        long end = System.currentTimeMillis();
        System.out.println((new StringBuilder("花费时间为： ")).append(end - start).toString());
        return;
    }

    @Test
    public void test3()
    {
        long start;
        FileReader fr=null;
        FileWriter fw=null;
        start = System.currentTimeMillis();
        try
        {
            fr = new FileReader(new File("test.txt"));
            fw = new FileWriter(new File("test3.txt"));
            char c[] = new char[5];
            int len;
            while((len = fr.read(c)) != -1) 
            	fw.write(c, 0, len);
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }catch(IOException e)
        {
            e.printStackTrace();
        }finally{
        	try {
        		if(fr!=null)
        		fr.close();
        		if(fw!=null)
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
        }
        long end = System.currentTimeMillis();
        System.out.println((new StringBuilder("花费时间为： ")).append(end - start).toString());
        return;
    }

    @Test
    public void test4()
    {
        BufferedReader br = null;
        BufferedWriter bw = null;
        try
        {
            br = new BufferedReader(new FileReader(new File("test.txt")));
            bw = new BufferedWriter(new FileWriter(new File("test4.txt")));
            String string;
            while((string = br.readLine()) != null) 
            {
            	bw.write((new StringBuilder(String.valueOf(string))).append("\n").toString());
            	bw.flush();
            }
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }catch(IOException e)
        {
            e.printStackTrace();
        }finally{
        	
        		try {
        			if(bw!=null)
					bw.close();
        			if(br!=null){
        				br.close();
        			}
				} catch (IOException e) {
					e.printStackTrace();
				}
        }
        
    }

    @Test
    public void test5()
    {
        String string;
        PrintStream ps;
        string = "这是要打印的字符串";
        ps = new PrintStream(System.out, true);
        try
        {
            ps.write(string.getBytes());
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }finally{
            ps.close();
        }

        BufferedReader br=null;
        PrintWriter pw=null;
        try
        {
            br = new BufferedReader(new FileReader(new File("test.txt")));
            pw = new PrintWriter(new FileWriter(new File("test5.txt")), true);
            String str;
            while((str = br.readLine()) != null) 
            	pw.write((new StringBuilder(String.valueOf(str))).append("\n").toString());
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }catch(IOException e)
        {
            e.printStackTrace();
        }finally{
        	try {
        		if(pw!=null){
        			pw.close();
        		}
        		if(br!=null)
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
        }
    }

    @Test
    public void test6()
    {
        InputStreamReader isr=null;
        OutputStreamWriter osw=null;
        try
        {
            isr = new InputStreamReader(new FileInputStream(new File("test.txt")));
            osw = new OutputStreamWriter(new FileOutputStream(new File("test6.txt")));
            char c[] = new char[5];
            int len;
            while((len = isr.read(c)) != -1) 
            {
            	osw.write(c, 0, len);
            	osw.flush();
            }
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }catch(IOException e)
        {
            e.printStackTrace();
        }finally{
        	try {
        		if(osw!=null)
				osw.close();
        		if(isr!=null)
        			isr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
        }
    }

    @Test
    public void test6_1()
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try
        {
            String str = br.readLine();
            System.out.println(str);
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }finally{
        	try
	        {
	            br.close();
	            isr.close();
	        }
	        catch(IOException e)
	        {
	            e.printStackTrace();
	        }
        }
        
    }

    @Test
    public void test7()
    {
        DataInputStream dis=null;
        DataOutputStream dos=null;
        try
        {
            dos = new DataOutputStream(new FileOutputStream(new File("test7.txt")));
            String str = "相信自己的判断，一定可以做到";
            dos.writeUTF(str);
            dis = new DataInputStream(new FileInputStream(new File("test7.txt")));
            System.out.println(dis.readUTF());
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }finally{
        	try {
        		if(dos!=null)
        			dos.close();
        		if(dis!=null)
				dis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
        }
    }

    @Test
    public void test8()
    {
        TestSerializable t1;
        TestSerializable t2;
        ObjectOutputStream oos=null;
        ObjectInputStream ois=null;
        t1 = new TestSerializable("AA", 12);
        t2 = new TestSerializable("BB", 13);
        try {
			oos = new ObjectOutputStream(new FileOutputStream("test8.txt"));
			oos.writeObject(t1);
			oos.writeObject(t2);
			ois = new ObjectInputStream(new FileInputStream("test8.txt"));
			TestSerializable r1;
			try {
				r1 = (TestSerializable)ois.readObject();
				TestSerializable r2 = (TestSerializable)ois.readObject();
				System.out.println(r1.toString());
				System.out.println(r2.toString());
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if(ois!=null)
				ois.close();
				if(oos!=null)
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
        
    }
    
    @Test
    public void test9()
    {
        RandomAccessFile raf = null;
        try {
			raf = new RandomAccessFile(new File("test.txt"), "rw");
			try {
				raf.seek(5L);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			StringBuffer sb = new StringBuffer();
			byte b[] = new byte[5];
			int len;
			try {
				while((len = raf.read(b)) != -1) 
					sb.append(new String(b, 0, len));
				raf.seek(5L);
				raf.write("插入".getBytes());
				raf.write(sb.toString().getBytes());
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}finally{
			try {
				raf.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
      
    }
}
