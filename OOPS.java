class demo {
    String color;
    String type;

    public void write() {
        System.out.println("Demo thing");
    }

    public void printColor(){
        System.out.println("Color is " + this.color);
    }

    public void printType(){
        System.out.println("Typr is " + this.type);
    }
}

public class OOPS {
    public static void main(String[] args) {
        demo demo1 = new demo();
        demo1.write();
        demo1.printColor();
        demo1.printType();
    }
}