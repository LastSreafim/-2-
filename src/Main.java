public class Main {
    public static void main(String[] args) {
        System.out.println("Hello first task!"); //оставил для проверки на всякий
        //Задача 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 767389;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //Задача 2
         dog = dog + 4;
         cat = cat + 4;
         paper = paper + 4;
         System.out.println(dog);
         System.out.println(cat);
         System.out.println(paper);

         //Задача 3
         dog = dog - 3.5;
         cat = cat - 1.6;
         paper = paper - 7639;
         System.out.println(dog);
         System.out.println(cat);
         System.out.println(paper);

         //Задача 4
         var friend = 19;
         System.out.println(friend);
         friend = friend + 2;
         System.out.println(friend);
         friend = friend / 7;
         System.out.println(friend);

         //Подумал, что наверное было бы более читаемо, если бы мы каждой задаче присваивали класс
            //Типа public class Task1 {...
            //Но тк я об этом знаю только в теории, то выделываться не стал, в задании такого не было :D

        //Задача 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        //Задача 6
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var totalWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println(totalWeight);
        var weightDifference = secondBoxerWeight - firstBoxerWeight;
        System.out.println(weightDifference);

        //Задача 7
        var revWeightDifference = firstBoxerWeight - secondBoxerWeight;
        System.out.println(revWeightDifference);
        var weightDivision = secondBoxerWeight % firstBoxerWeight;
        System.out.println(weightDivision);

        //Задача 8.1
        var totalHours = 640;
        var oneWorkerHours = 8;
        var totalWorkers = totalHours / oneWorkerHours;
        System.out.println("Всего работников в компании " + totalWorkers + " человек");

        //Задача 8.2
        totalWorkers = totalWorkers + 94;
        totalHours = oneWorkerHours * totalWorkers;
        System.out.println("Если в компании работает " + totalWorkers + " человек то всего " + totalHours + " часов работы может быть поделено между сотрудниками");
    }
}