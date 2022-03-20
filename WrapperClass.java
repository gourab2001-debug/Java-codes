public class WrapperClass {
    public static void main(String[] args) {
        
        // Auto Boxing = Converting Primitive to objects
        int num = 10;
        Integer ob = Integer.valueOf(num);
        System.out.println(num + " " + ob);
        
        // Unboxing = converting objects to primitive types
        Integer obj = Integer.valueOf(10);
        int num2 = obj.intValue();
        System.out.println(num2 + " " + obj);
    }
}