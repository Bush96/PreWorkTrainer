package Bridge;

public class ProgramRunner {
    public static void main(String[] args) {
        Program [] programs = {new Yandex(new CppDev()), new Google(new JavaDev())};

        for (Program program: programs){
            program.working();
        }
    }
}
