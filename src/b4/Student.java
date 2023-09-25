package b4;

public class Student {
    private String name;
    private String classes;

    // Hàm tạo không tham số với giá trị mặc định
    public Student() {
        this.name = "John";
        this.classes = "C02";
    }

    // Phương thức public để đặt tên của sinh viên
    public void setName(String name) {
        this.name = name;
    }

    // Phương thức public để đặt lớp của sinh viên
    public void setClasses(String classes) {
        this.classes = classes;
    }

    // Phương thức public để lấy tên của sinh viên
    public String getName() {
        return name;
    }

    // Phương thức public để lấy lớp của sinh viên
    public String getClasses() {
        return classes;
    }
}
