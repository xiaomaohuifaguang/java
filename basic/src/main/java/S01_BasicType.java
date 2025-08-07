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
//        testBasicTypeBytes();
    }

    private static void testBasicTypeBytes(){
        System.out.println("方式一： 包装类.SIZE/8");
        System.out.println("byte: " + Byte.SIZE/8 + " bytes");      // 1 byte
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
