public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        var dog = 8.1;
        System.out.println("Переменная dog = " + dog);
        var cat = 3.6;
        System.out.println("Переменная cat = " + cat);
        var paper = 763789;
        System.out.println("Переменная paper = " + paper);

        System.out.println("Задание 2");
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        System.out.println("Задание 3");
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        System.out.println("Задание 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        System.out.println("Задание 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        System.out.println("Задание 6");
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var totalWeight = boxer1 + boxer2;
        System.out.println("Общий вес бойцов равен " + totalWeight);
        var difference = boxer2 - boxer1;
        System.out.println("Разница между массами бойцов равна " + difference);

        System.out.println("Задание 7");
        System.out.println("Разница (вычитание) между массами бойцов равна " + difference);
        var different2 = boxer2 % boxer1;
        System.out.println("Разница (деление) между массами бойцов равна " + different2);

        System.out.println("Задание 8");
        var totalHours = 640;
        var timeOfOneEmployee = 8;
        var totalEmployees = totalHours / timeOfOneEmployee;
        System.out.println("Всего работников в компании " + totalEmployees + " человек");

        var totalEmployees2 = totalEmployees + 94;
        var totalHours2 = totalEmployees2 * 8;
        System.out.println("Если в компании работает " + totalEmployees2 + " человек, то всего " + totalHours2 + " часов работыможет быть поделено между сотрудниками");

    }
}