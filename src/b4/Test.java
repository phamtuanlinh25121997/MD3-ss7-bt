package b4;

public class Test {
    public static void main(String[] args) {
        // Tạo đối tượng Student
        Student student = new Student();

        // Truy cập và đặt tên và lớp cho sinh viên
        student.setName("Alice");
        student.setClasses("C03");

        // Lấy và hiển thị tên và lớp của sinh viên
        System.out.println("Tên sinh viên: " + student.getName());
        System.out.println("Lớp của sinh viên: " + student.getClasses());
    }
}
