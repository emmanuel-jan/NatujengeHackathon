package najutengehackerthon;

public class NajutengeHackerthon {
    public static void main(String[] args) {
        Question1();
    }
    public static void Question1(){
       byte bytes [] = new byte[]{
           (byte)0x13, (byte)0x55, (byte)0xb6, 0x76, 
           0x79, (byte)0x88, (byte)0x29, (byte)0x5e,
           0x00, 0x00, 0x00, 0x00,
           0x00, 0x03, 0x00, 0x34, 
           0x7e, 0x58, 0x1e, 0x36,
           0x00, 0x00, 0x00, 0x00,
           0x00, 0x00, 0x00, 0x00
       };
       
       //index 0 and 1 - 16 bits
        int sourcePort = 0;
        sourcePort |= (bytes[0] &0xff) <<8;
        sourcePort |= (bytes[1] &0xff);
        System.out.println("sourcePort --> "+sourcePort );
        
         //index 2 and 3 - 16 bits
        int destinationPort = 0;
        destinationPort |= (bytes[2] &0xff) <<8;
        destinationPort |= (bytes[3] &0xff);
        System.out.println("destinationPort --> "+destinationPort );
        
        int vt = 0x00000000;
        vt |= ((bytes[4]&0xff) << 24);
        vt |= ((bytes[5]&0xff) << 16);
        vt |= ((bytes[6]&0xff) << 8);
        vt |= ((bytes[7]&0xff) << 0);
        
        System.out.println("vt: " + vt);
        
        
    }    
}
