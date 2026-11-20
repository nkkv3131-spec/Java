import java.math.BigInteger;

public class BigIntegerPrimitive {
    public static void main(String[] args) {
        BigInteger number = new BigInteger("12345");

        byte byteValue = number.byteValue();
        short shortValue = number.shortValue();
        int intValue = number.intValue();
        long longValue = number.longValue();
        float floatValue = number.floatValue();
        double doubleValue = number.doubleValue();
        char charValue = (char) number.intValue();
        boolean booleanValue = number.signum() != 0;

        System.out.println("BigInteger value: " + number);
        System.out.println("Byte value: " + byteValue);
        System.out.println("Short value: " + shortValue);
        System.out.println("Int value: " + intValue);
        System.out.println("Long value: " + longValue);
        System.out.println("Float value: " + floatValue);
        System.out.println("Double value: " + doubleValue);
        System.out.println("Char value: " + charValue);
        System.out.println("Boolean value: " + booleanValue);
    }
}
