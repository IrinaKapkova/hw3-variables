import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {


        // Задача №6
        System.out.println("Задача №6");
        var weight1boxer = 78.2;
        var weight2boxer = 82.7;
        System.out.println("Общий вес двух бойцов:  " + (weight1boxer + weight2boxer));
        System.out.println("Разница между весами бойцов: " + (weight2boxer - weight1boxer));


        // Задача №7
        System.out.println("Задача №7");
        System.out.println("Разница между весами бойцов (Первый способ): " + (weight2boxer - weight1boxer));
        System.out.println("Разница между весами бойцов (Второй способ): " + (weight2boxer % weight1boxer));

        // Задача №8
        System.out.println("Задача №8");
        var totalWorkingTime = 640;
        var lengthWorkingDay = 8;
        var amountWorkers = totalWorkingTime / lengthWorkingDay;
        System.out.println("Всего работников в компании -" + amountWorkers + " человек");
        amountWorkers +=94;
        totalWorkingTime = amountWorkers*lengthWorkingDay;
        System.out.println("Если в компании работает "+ amountWorkers +" человека, то всего "+ totalWorkingTime + " часа работы может быть поделено между сотрудниками");

    }
}