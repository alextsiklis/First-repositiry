package Package2;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(75, "Sasha");
        student.Run(3);
        student.Eat();
        student.setName("Alexander");
        student.GoToUniversity();
        student.getLocalization();
        Student studentka = new Student(55, "Vera");
        studentka.GoToUniversity();
        student.chat("- Hi! I invite you to eat with me at home!\n- Ok!");
        student.GoHome();
        studentka.GoHome();
        student.Eat();
        studentka.Eat();
        student.info();
        studentka.info();

    }
}
