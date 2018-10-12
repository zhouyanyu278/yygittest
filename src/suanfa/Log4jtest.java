package suanfa;
import org.apache.log4j.Logger;
public class Log4jtest {
	 
	    
	    public static void main(String[] args) {
	    	Logger log = Logger.getLogger("logy");
	    	Logger log1= Logger.getLogger(Log4jtest.class);
	        for(int i=0;i<10;i++){
	        	System.out.println("aaa");
	            log.info("HellWord");
	            log1.info("yyy");
	        }

}
}