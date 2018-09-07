package fileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class Demo_1 {
	
private static final String LINE_SEPARATOR = System.getProperty("line.separator");

public static void main(String[] args) throws IOException {
	//内存往硬盘写入数据
	/*创建可以往文件中写入字符数据的字符输出流对象。
	 * 既然是往一个文件中写入数据，那么在创建对象时，就必须明确该文件
	 * （用于存储数据的目的地）
	 * 如果文件不存在，就会自动创建。
	 * 如果文件存在就会被覆盖
	*/
	FileWriter fw=new FileWriter("demo.txt");
	
	fw.write("TimBern"+LINE_SEPARATOR+"ers-Lee蒂姆伯纳斯李,字符流的写入");
	fw.flush();
	fw.close();
}
}
