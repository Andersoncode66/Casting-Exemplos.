public class WideningCasting {
    public static void main(String[] args) {
        byte byteValue = 42;
        short shortValue = byteValue;     // byte para short
        int intValue = shortValue;        // short para int
        long longValue = intValue;        // int para long
        float floatValue = longValue;     // long para float
        double doubleValue = floatValue;  // float para double

        System.out.println("byteValue: " + byteValue);
        System.out.println("shortValue: " + shortValue);
        System.out.println("intValue: " + intValue);
        System.out.println("longValue: " + longValue);
        System.out.println("floatValue: " + floatValue);
        System.out.println("doubleValue: " + doubleValue);
    }
}
