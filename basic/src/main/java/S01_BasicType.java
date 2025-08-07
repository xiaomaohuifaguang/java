public class S01_BasicType {
    /*基础类型
    * 整数类型：byte，short，int，long
    * 浮点数类型：float，double
    * 字符类型：char
    * 布尔类型：boolean
    *
    * 变量概念：
    *  基础类型变量
    *  引用类型变量
    * 变量定义：
    *  变量必须先定义后使用
    */
    public static void main(String[] args) {
        /*基础类型大小
        * 包装类.SIZE/8
        * 包装类.BYTES
        * 注意：boolean 目前未严格定义 没有常量说明长度
        * 通常使用 1 字节表示
        */
        // testBasicTypeBytes();

        /*
        * 整数类型
        * 范围：
        * byte -128 ~ 127   -2⁷ ~ 2⁷-1
        * shor -32768 ~ 32767   -2¹⁵ ~ 2¹⁵-1
        * int  -2147483648 ~ 2147483647    -2³¹ ~ 2³¹-1
        * long -9223372036854775808 ~ 9223372036854775807   -2⁶³ ~ 2⁶³-1
        *
        * 注意：Java 采用二进制补码（Two's Complement） 表示整数，当计算结果超出 int范围时，会发生回绕（Wrap Around）
        */
        // integerType();

        /*
        * 浮点类型
        * 浮点类型的数就是小数，因为小数用科学计数法表示的时候，小数点是可以“浮动”的，如1234.5可以表示成12.345x102，也可以表示成1.2345x103，所以称为浮点数。
        */
        // floatPointType();

        /*
        * 布尔类型
        * Java语言对布尔类型的存储并没有做规定，因为理论上存储布尔类型只需要1 bit，但是通常JVM内部会把boolean表示为4字节整数。
        */
        // booleanType();

        /*
        * 字符类型
        * 字符类型char表示一个字符。Java的char类型除了可表示标准的ASCII外，还可以表示一个Unicode字符：
         */
        // charType();


    }

    private static void charType() {
        char a = 'A';
        char zh = '中';
    }

    private static void booleanType() {
        boolean a = true;
        boolean b = false;
    }
    private static void floatPointType() {
        /*
        * 浮点类型默认double类型 float赋值需加f
        * float 最大 3.4x1038
        * double 最大 1.79x10308
        */
        float floatType = 1.23f;
        double doubleType = 1.23;
    }

    private static void integerType(){
        byte byteType = 127;
        short shortType = 32767;
        int intType = 2147483647;
        /*
        * long 类型定义需加L 否则默认作为int赋值
         */
        long longType = 9223372036854775807L;
    }

    private static void testBasicTypeBytes(){
        System.out.println("方式一： 包装类.SIZE/8");
        System.out.println("byte: " + Byte.SIZE/8 + " bytes");     // 1 byte
        System.out.println("short: " + Short.SIZE/8 + " bytes");   // 2 bytes
        System.out.println("int: " + Integer.SIZE/8 + " bytes");   // 4 bytes
        System.out.println("long: " + Long.SIZE/8 + " bytes");     // 8 bytes
        System.out.println("float: " + Float.SIZE/8 + " bytes");   // 4 bytes
        System.out.println("double: " + Double.SIZE/8 + " bytes"); // 8 bytes
        System.out.println("char: " + Character.SIZE/8 + " bytes"); // 2 bytes

        System.out.println("方式二： 包装类.BYTES");
        System.out.println("byte: " + Byte.BYTES + " bytes");
        System.out.println("short: " + Short.BYTES + " bytes");
        System.out.println("int: " + Integer.BYTES + " bytes");
        System.out.println("long: " + Long.BYTES + " bytes");
        System.out.println("float: " + Float.BYTES + " bytes");
        System.out.println("double: " + Double.BYTES + " bytes");
        System.out.println("char: " + Character.BYTES + " bytes");
    }




}
