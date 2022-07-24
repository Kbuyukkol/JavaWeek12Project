package fieldTypes;

public class LocalvsInstance {

    public int a=10; //instance variable--> belongs to the object

    public void show() {
        int a=5; // local variable
        System.out.println(a);
    }

    public void show(int num) {
        int a=num ;
        System.out.println(a);
    }

    public static void main(String[] args) {
        LocalvsInstance obj= new LocalvsInstance(); // default constuctor

        System.out.println("coming from the method: local");
        obj.show();
        System.out.println("coming from instance variable");
        System.out.println(obj.a);

        obj.a=1;
        System.out.println(obj.a);

        obj.show(8);

    }
}
