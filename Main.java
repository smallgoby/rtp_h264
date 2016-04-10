import java.io.FileInputStream;
import java.io.InputStream;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		 InputStream is1=new FileInputStream("C:\\Program Files (x86)\\Wireshark\\from_192.168.1.100_62447to192.168.1.103_6970_all.264");
		 InputStream is2=new FileInputStream("C:\\Users\\Administrator\\Desktop\\c.h264");
		 
		 int i=0;
		 while(true)
		 {  
			 byte[] bs1=new byte[1];
			 byte[] bs2=new byte[1];
			 int len1 = is1.read(bs1,0,1);
			 int len2 = is2.read(bs2,0,1);
			 if(len1<0 || len2<0)
			 {
				 break;
			 }
			 if(bs1[0] != bs2[0])
			 {
				 System.out.println("found:" + i);
				 String address= String.format("%x", i);
				 System.out.println("address:" + address);
				 break;
			 }
			 i++;
		 }
	}

}
