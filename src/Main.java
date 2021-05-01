import model.Instuctor;
import model.Student;
import service.InstuctorManager;
import service.StudentManager;
import service.UserManager;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Student student = new Student();
        student.setId(1L);
        student.setName("Ali");
        student.setSurname("Kaya");
        student.setStudentNumber("123456");
        student.setEmail("ali@gmail.com");
        student.setNotionalNumber("442667832323");
        UserManager studentManager = new StudentManager(student);

        Instuctor instuctor = new Instuctor();
        instuctor.setId(1L);
        instuctor.setName("Kemal");
        instuctor.setSurname("Guven");
        instuctor.setDepart("Chemistry");
        instuctor.setEmail("kemal@gmail.com");
        instuctor.setNotionalNumber("442667343323");
        UserManager instuctorManager = new InstuctorManager(instuctor);

        UserManager[] userManagers  = {studentManager,instuctorManager};
        Operation(userManagers);
    }

    public static void Operation(UserManager[] userManagers) {
        Arrays.stream(userManagers).forEach(a-> {
            a.add();
            a.update();
            a.delete();
        });
    }
}
