package Visitor;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new Project();

        Developer java = new JavaDev();
        Developer cpp = new CppDev();

        project.beWritten(java);
        System.out.println("/n==========================/n");
        project.beWritten(cpp);
    }
}
