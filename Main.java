package Company;

import java.util.Scanner;

public class Main {

    private static DateBass db = new DateBass();

    public static void main(String[] args) {
        menu();
    }

    private static void menu()  {

        Scanner scan = new Scanner(System.in);
        mark2:
        while (true) {
            System.out.println();
            System.out.println("1. Курсы");
            System.out.println("2. Преподователи");
            System.out.println("3. Списки");
            System.out.println("0. Выход");
            int result = scan.nextInt();
            switch (result) {
                case 1:
                    System.out.println("1 Добавить 2 Удалить 3 Редактировать");
                    int a = scan.nextInt();
                    if (a == 1) {
                        db.addCourse(db.newCourse());
                    }
                    if (a == 2) {
                        db.showIdCourse();db.deleteCourse();
                    }
                    if (a == 3) {
                        db.showIdCourse();db.changeCourse();
                    }
                    break;
                case 2:
                    System.out.println("1 Добавить 2 Удалить 3 Редактировать");
                    int x = scan.nextInt();
                    if (x==1){
                        db.addPerson(db.newPerson());
                    }
                    if (x==2){
                        db.showIdPerson();db.deletePerson();
                    }
                    if (x==3){
                        db.showIdPerson();db.changePerson();
                    }
                    break;
                case 3:
                    System.out.println("1 Курсы 2 Преподователи ");
                    int b = scan.nextInt();
                    if (b==1){
                        System.out.println("Название и "+ "Кол-во часов");
                        db.showCourse();

                    }
                    if (b==2){
                        System.out.println("ФИО\t"    +    "Возраст");
                        db.showPerson();

                    }
                    break ;

                default:
                    break mark2;
            }
        }

    }

        }
