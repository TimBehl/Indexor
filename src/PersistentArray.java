import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;


public class PersistentArray {
	
	private RandomAccessFile file;
	private static final int BIT_OFFSET = 8;
	
	public static void initialize(String arrayFileName, int arraySize, long initialValue){
		
	}
	
	public PersistentArray(String arrayFileName){
		try {
			file = new RandomAccessFile(arrayFileName, "rw");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void set(int index, long value){
		
	}
	
	public long get(int index){
		try {
			file.seek(BIT_OFFSET*index);
			return file.readLong();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return -1;
	}
	
	public long getLength(){
		try {
			return file.length();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return -1;
	}
	
	public void close(){
		try {
			file.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void delete(String arrayFileName){
		
	}
}