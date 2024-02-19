package gr.aueb.cf.ch20.lamdas;
@FunctionalInterface
public interface ITeacherIDFilter {
    boolean filterID(Teacher teacher);
}
