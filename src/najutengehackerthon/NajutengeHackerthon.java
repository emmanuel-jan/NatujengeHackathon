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
       
        int s1 = bytes[0] & 0xff;
        int s2 = bytes[1] & 0xff;
        int s3 = bytes[2] & 0xff;
        int s4 = bytes[3] & 0xff;
        
        String sourcePort = s1+"."+s2+"."+s3+"."+s4;
        System.out.println("sourcePort: " + sourcePort);
        
        int d1 = bytes[4] & 0xff;
        int d2 = bytes[5] & 0xff;
        int d3 = bytes[6] & 0xff;
        int d4 = bytes[7] & 0xff;
        
        String destinationPort = d1+"."+d2+"."+d3+"."+d4;
        System.out.println("destinationPort: " + destinationPort);
        
        int vt = 0x00000000;
        vt |= ((bytes[8]&0xff) << 24);
        vt |= ((bytes[9]&0xff) << 16);
        vt |= ((bytes[10]&0xff) << 8);
        vt |= ((bytes[11]&0xff) << 0);
        
        long vtLong = Integer.toUnsignedLong(vt);
        System.out.println("vtLong: " + vt);
        
    }    
}
