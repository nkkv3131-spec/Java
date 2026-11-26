import java.util.Objects;
class Student {
    int id;
    String name;
    Student(int id, String name) { this.id = id; this.name = name; }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Student)) return false;
        Student other = (Student) obj;
        return id == other.id && Objects.equals(name, other.name);
    }
    @Override
    public int hashCode() { return Objects.hash(id, name); }
}
public class Q08_CompareObjects {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Amit");
        Student s2 = new Student(101, "Amit");
        Student s3 = new Student(102, "Neha");
        System.out.println("s1 == s2: " + (s1 == s2));
        System.out.println("s1.equals(s2): " + s1.equals(s2));
        System.out.println("s1.equals(s3): " + s1.equals(s3));
    }
}
