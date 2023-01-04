package Visitor;

public class CppDev implements Developer{
    @Override
    public void create(Test test) {
        System.out.println("11111");
    }

    @Override
    public void create(Database database) {
        System.out.println("222222222");
    }

    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("333333");
    }
}
