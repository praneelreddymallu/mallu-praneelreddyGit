package simpleandcompoundinterest;
import java.io.IOException;

public class calinterest
{
    public static void main( String[] args ) throws IOException
    {
        Simpleinterestandcompoundinterest simpleinterest= new Simpleinterestandcompoundinterest();
    	 simpleinterest.readvalues();
    	 simpleinterest.calculateSimpleInterestandCompoundInterest();
    	 simpleinterest.displayamount();
    	
    }
}
