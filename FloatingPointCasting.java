public class FloatingPointCasting {
    public static void main(String[] args) {
        float floatValue = 3.14f;
        double doubleValue = floatValue; // float para double (widening)

        System.out.println("floatValue: " + floatValue);
        System.out.println("doubleValue: " + doubleValue);

        double anotherDoubleValue = 9.78;
        float anotherFloatValue = (float) anotherDoubleValue; // double para float (narrowing)

        System.out.println("anotherDoubleValue: " + anotherDoubleValue);
        System.out.println("anotherFloatValue: " + anotherFloatValue);
    }
}
