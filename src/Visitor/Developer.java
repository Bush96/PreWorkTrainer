package Visitor;

public interface Developer {
    void create(Test test);
    void create(Database database);

    void create(ProjectClass projectClass);
}
