package otherIO;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class Piped_All {

public static void main(String[] args) throws IOException {
	PipedInputStream in=new PipedInputStream();
	PipedOutputStream out=new PipedOutputStream();
	in.connect(out);
	new Thread(new Piped_in(in)).start();
	new Thread(new Piped_out(out)).start();

     }

}
