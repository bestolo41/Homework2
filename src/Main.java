public class Main {
    public static void main(String[] args) {

        //Задание 1

        System.out.println("\nЗадание 1\n");

        var dog = 8.0;
        var cat = 3.6;
        var paper = 73789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //Задание 2

        System.out.println("\nЗадание 2\n");

        dog = dog + 4;
        cat = cat + 4;
        paper = paper +4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //Задание 3

        System.out.println("\nЗадание 3\n");

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //Задание 4

        System.out.println("\nЗадание 4\n");

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        // Задание 5

        System.out.println("\nЗадание 5\n");

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        // Задание 6 и 7

        System.out.println("\nЗадание 6 и 7\n");

        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var totalWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println(totalWeight);
        var weightDifference = secondBoxerWeight - firstBoxerWeight;
        System.out.println(weightDifference);
        weightDifference = secondBoxerWeight % firstBoxerWeight;
        System.out.println(weightDifference);

        //Задание 8
        // 1

        System.out.println("\nЗадание 8.1\n");

        var totalWorkingHours = 640;
        var WorkingHoursInDay = 8;
        var workers = totalWorkingHours / WorkingHoursInDay;
        System.out.println("Всего в компании работает " + workers + " человек");

        //2

        System.out.println("\nЗадание 8.2\n");

        var newWorkers = workers + 94;
        var newTotalWorkingHours = newWorkers * WorkingHoursInDay;
        System.out.println("Если в компании работает " + newWorkers + " человек, то всего " + newTotalWorkingHours + " часов может быть поделено между сотрудниками");

    }
}