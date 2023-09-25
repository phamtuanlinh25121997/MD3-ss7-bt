package b1;

public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass("Hello, World!");

        // Hiển thị giá trị ban đầu của myString
        System.out.println("Giá trị ban đầu của myString: " + myClass.getMyString());

        // Thay đổi giá trị của myString
        myClass.setMyString("New Value");

        // Hiển thị giá trị mới của myString
        System.out.println("Giá trị mới của myString: " + myClass.getMyString());

    }
}
