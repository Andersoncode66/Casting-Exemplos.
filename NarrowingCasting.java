public class NarrowingCasting {
    public static void main(String[] args) {
            double doubleValue = 9.78;
            float floatValue = (float) doubleValue; // double para float
            long longValue = (long) floatValue; // float para long
            int intValue = (int) longValue; // long para int
            short shortValue = (short) intValue; // int para short
            byte byteValue = (byte) shortValue; // short para byte


            System.out.println("doubleValue:"+ doubleValue);
            System.out.println("floatValue:" + floatValue);
            System.out.println("longValue:" + longValue);
            System.out.println("intValue" + intValue);
            System.out.println("shortValue" + shortValue);
            System.out.println("byteValue:" + byteValue);

    }
}
