package Company;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DateBass {
    Scanner scan = new Scanner(System.in);
    private List<Course> courseList = new ArrayList<>();
    private List<Lecturer> lecturerList = new ArrayList<>();
    void addPerson(Lecturer Lecturer) {
        lecturerList.add(Lecturer);
    }

    void showPerson() {
        for (int i = 0; i < lecturerList.size(); i++) {
            Lecturer number = lecturerList.get(i);
            System.out.println(number);
        }
    }

    void showIdPerson() {
        for (int i = 0; i < lecturerList.size(); i++) {
            Lecturer number = lecturerList.get(i);
            System.out.println(number);
        }
    }

Lecturer newPerson(){
    LocalDate data = LocalDate.now();
    String course;
    int a ;
    System.out.println("Введите ФИО Преподователя: ");

    String name = scan.nextLine();
    System.out.println("Возраст: ");
    int age = scan.nextInt();
    System.out.println("Выберите 1. Создать курс 2. Перевести на другой курс");
    int x = scan.nextInt();

    if (x == 1) {
        scan.nextLine();
        addCourse(newCourse());

    }
    if (x == 2) {
        if (courseList.size() != 0) {
            System.out.println("Выберите курс: ");
            showIdCourse();

            a = scan.nextInt();
            course = ((Course) courseList.get(a)).getName();

        }
        else{
            System.out.println("Список курсов пуст");

        }
    }

Lecturer lecturer = new Lecturer(name,  age);



    System.out.println(lecturer);
    return lecturer;

}
    void deletePerson() {
        System.out.println();
        System.out.println("Введите номер преподователя: ");
        int n = scan.nextInt();
        lecturerList.remove(n);
    }


    void changePerson() {
        LocalDate data = LocalDate.now();
        System.out.println();
        System.out.println("Введите номер преподователя, которого хотите изменить: ");
        int numberPerson = scan.nextInt();
        Object p = lecturerList.get(numberPerson);
        System.out.println(p);
        System.out.println("Выберите что хотите изменить: 0 Полностью Преподователя 1 Имя 2 Возраст 3 Курс ");
        int x = scan.nextInt();
        switch (x) {
            case 0:
                System.out.println("Введите какого преподователя хотите полностью изменить: ");
                int c = scan.nextInt();
                lecturerList.set(c, newPerson());
                break;
            case 1:
                System.out.println("Введите новое имя: ");
                String g = scan.nextLine();
                ((Lecturer) lecturerList.get(numberPerson)).setName(g);
                break;
            case 2:
                System.out.println("Введите новый возраст: ");
                int d = scan.nextInt();
                d = data.getYear() - d;
                ((Lecturer) lecturerList.get(numberPerson)).setDate(d);
                break;

            case 3:
                System.out.println("Выберети новый курс: ");
                showIdCourse();
                int id = 0;
                int newOt = scan.nextInt();
                String nOt = ((Course) courseList.get(newOt)).getName();
                ((Lecturer) lecturerList.get(numberPerson)).setCourse(nOt);

            default:
                break;
        }

    }
////////
void addCourse(Course Otdel) {
    courseList.add(Otdel);
}
    void showCourse() {
        for (int i = 0; i < courseList.size(); i++) {
            Course number= courseList.get(i);
            System.out.println(number+" часа(ов)");

        }
    }


    void showIdCourse() {
        for (int i = 0; i < courseList.size(); i++) {
            Course number = courseList.get(i);
            System.out.println(i + " " + number);
        }
    }
    Course newCourse() {

        System.out.println("Введите название нового курса и кол-во часов: ");
        String name = scan.nextLine();
        Course h = new Course(name);
        System.out.println(h);
        return h;

    }
    void deleteCourse() {
        System.out.println();
        System.out.println("Введите номер курса: ");
        int n = scan.nextInt();
        courseList.remove(n);
    }

    void changeCourse() {
        System.out.println();
        System.out.println("Введите номер курса, которое хотите изменить: ");
        int n = scan.nextInt();
        Object p = courseList.get(n);
        System.out.println(p);
        System.out.println("Выберите что хотите изменить: 1 Полностью курс 2 Название ");
        int x = scan.nextInt();
        switch (x) {
            case 1:
                System.out.println("Введите какой курс хотите полностью изменить: ");
                int c = scan.nextInt();
                courseList.set(c, newCourse());
                break;
            case 2:
                System.out.println("Введите новое название: ");
                String g = scan.next();
                 courseList.get(n).setName(g);
                break;
            default:
                break;
        }
    }

}
