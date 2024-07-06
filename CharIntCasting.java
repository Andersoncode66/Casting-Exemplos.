public class CharIntCasting {
    public static void main (String[] args) {
        char charValue = 'A';
        int intValue = charValue; // char para int

        System.out.println("charValue: " + charValue);
        System.out.println("intValue (código ASCII de 'A'):" + intValue);


        int anotherintValue = 66;
        char anotherCharValue = (char) anotherintValue; // int para char

        System.out.println("anotherIntValue:" + anotherintValue);
        System.out.println("anotherCharValue (caractere correspondente a 66): " + anotherCharValue);
  }
}
