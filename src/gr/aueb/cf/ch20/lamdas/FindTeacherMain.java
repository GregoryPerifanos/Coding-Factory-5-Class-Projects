package gr.aueb.cf.ch20.lamdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FindTeacherMain {
    private static final List<Teacher> teachers = Arrays.asList(
            new Teacher(1,"Alice", "W."),
            new Teacher(2, "Bob", "M."),
            new Teacher(3,"Costas", "P."),
            new Teacher(4,"Donald", "T.")

        );
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int myId = scanner.nextInt();
//        List<Teacher> filteredTeachers = getFilteredTeachers(teachers, new ITeacherIDFilter() {
//            @Override
//            public boolean filterID(Teacher teacher) {
//                return teacher.getId() == 3;
//            }
//        });


//        List<Teacher> filteredTeachers = getFilteredTeachers(teachers, teacher -> teacher.getId() == myId);
//        printTeachers(filteredTeachers, teacher -> teacher.printFullName());
//        printTeachers(filteredTeachers, teacher -> Teacher.printTeacher(teacher));
//        printTeachers(filteredTeachers, teacher -> System.out.println(teacher));
//
//        printTeachers(filteredTeachers, Teacher::printFullName);
//        printTeachers(filteredTeachers, Teacher::printTeacher);
//        printTeachers(filteredTeachers, System.out::println);

        checkAndPrintTeachers(teachers, teacher -> teacher.getFirstname().length() >= 4, System.out::println);

//        for (Teacher teacher : filteredTeachers) {
//            teacher.printFullName();
//        }

    }

    public static List<Teacher> getFilteredTeachers(List<Teacher> teachers, Predicate<Teacher> filter) {
        List<Teacher> teacherToReturn = new ArrayList<>();
        for (Teacher teacher : teachers) {
            if (filter.test(teacher)) {
                teacherToReturn.add(teacher);
            }
        }
        return teacherToReturn;
    }

    public static void printTeachers(List<Teacher> teachers, Consumer<Teacher> consumer){
        for (Teacher teacher : teachers) {
            consumer.accept(teacher);
        }
    }

    public static void checkAndPrintTeachers(List<Teacher> teachers, Predicate<Teacher> filter ,Consumer<Teacher> consumer) {
        teachers.forEach(teacher -> {
            if (filter.test(teacher)) {
                consumer.accept(teacher);
            }
        });
    }

}
