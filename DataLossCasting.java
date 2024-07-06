public class DataLossCasting {
    public static void main (String[] args){
        double doubleValue = 123.456;
        int intValue = (int) doubleValue; // Perda da parte decimal


        System.out.println("doubleValue: " + doubleValue);
        System.out.println("intValue (com perda de dados): "+intValue);
        
        int largeIntValue = 130;
        byte byteValue = (byte) largeIntValue; // Overflow


        System.out.println("largeIntValue: " + largeIntValue);
        System.out.println("byteValvue (com overflow):" + byteValue);
    }
}
