package compare;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
public class compare {

	public static void main(String[] args) throws IOException{
		// TODO Autos-generated method stub
		   
	        FileChannel ch1 = new RandomAccessFile("samplej.txt", "r").getChannel();
	        FileChannel ch2 = new RandomAccessFile("samplej - Copy.txt", "r").getChannel();
	        int ch1Size = (int)ch1.size();
	        int ch2Size = (int)ch2.size();
	        if (ch1.size() != ch2.size()) {
	            System.out.println("Result: different content\r\n" + 
	            		"character length for samplej.txt: "+ch1Size+"\r\n" + 
	            		"character length for samplej-Copy.txt: "+ ch2Size);
	            return;
	        }
	        long size = ch1.size();
	        ByteBuffer m1 = ch1.map(FileChannel.MapMode.READ_ONLY, 0L, size);
	        ByteBuffer m2 = ch2.map(FileChannel.MapMode.READ_ONLY, 0L, size);
	        for (int pos = 0; pos < size; pos++) {
	            if (m1.get(pos) != m2.get(pos)) {
	                System.out.println("Files differ at position " + pos);
	                return;
	            }
	        }
	        System.out.println("Result: identical content \n"
	        				  +"character length for both:" + size);
	       
	}

}