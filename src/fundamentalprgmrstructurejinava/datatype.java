package fundamentalprgmrstructurejinava;
import java.math.BigInteger; //untuk perhitungan
import java.util.Scanner; //untuk memindai

//soal ke 1
public class datatype{

	public static void main(String[] args) {
	
		Scanner memindai = new Scanner(System.in);
        
        int Type = memindai.nextInt();
        
        for(int i = 0; i < Type; i++) {
            try {
                long Type2 = memindai.nextLong();
                BigInteger BI = BigInteger.valueOf(Type2);
                
                System.out.println(Type2 + " Can be fitted in : ");
                
                if(BI.longValue() >= -128 && Type2 <= 127) {
                    System.out.println("* Byte");
                } 
                
                if(BI.longValue() >= -(Math.pow(2, 15)) && BI.longValue() <= (Math.pow(2, 15) - 1)) {
                    System.out.println("* Short");
                }
                
                if(BI.longValue() >= -(Math.pow(2, 31)) && BI.longValue() <= Math.pow(2, 31) -1) {
                    System.out.println("* Int");
                }
                
                if(BI.longValue() >= -(Math.pow(2, 63)) && BI.longValue() <= Math.pow(2, 63)) {
                    System.out.println("* Long");
                }
            } catch(Exception e) {
                System.out.println(memindai.next() + " Can't be fitted anywhere.");
            }
        }
	}

}
