public class Main {
    public static void main(String[] args) {
        System.out.println("1 задание");
        int a = 180;
        System.out.println("Значение переменной  a с типом int равно " + a);
        byte b = 3;
        System.out.println("Значение переменной  b с типом byte равно " + b);
        short c = 4923;
        System.out.println("Значение переменной  c с типом short равно " + c);
        long d = 353255555L;
        System.out.println("Значение переменной  d с типом long равно " + d);
        float y = 1.45f;
        System.out.println("Значение переменной  y с типом float равно " + y);
        double x = 12.654;
        System.out.println("Значение переменной  x с типом int равно " + x);

        System.out.println("2 задание");
        float fish = 27.12f;
        long cup = 987678965549L;
        double map = 2.786;
        short book = 569;
        short temp = -159;
        short add = 27897;
        byte dog = 67;
        System.out.println("число " + fish + " является типу переменной float");
        System.out.println("число " + cup + " является типу переменной long");
        System.out.println("число " + map + " является типу переменной double");
        System.out.println("число " + book + " является типу переменной short");
        System.out.println("число " + temp + " является типу переменной short");
        System.out.println("число " + add + " является типу переменной int");
        System.out.println("число " + dog + " является типу переменной byte");

        System.out.println("3 задание");
        int ludmilaPavlovna = 23;
        int annaSergeevna = 27;
        int ekaterinaAndreevna = 30;
        int totalPaper = 480;
        int totalStudents = ludmilaPavlovna + annaSergeevna + ekaterinaAndreevna;
        int paperForStudent = totalPaper / totalStudents;
        System.out.println("На каждого ученика рассчитано " + paperForStudent + " листов бумаги");

        System.out.println("4 задание");

        int bottlesFor2Minutes = 16;
        int minute = 60;
        int hour = 24;
        int day = 30;
        int bottlesFor1Minute = bottlesFor2Minutes / 2;
        int twentyMinutes = 20 * bottlesFor1Minute;
        int oneDay = hour * minute * bottlesFor1Minute;
        int threeDays = 3 * oneDay;
        int oneMonth = day * oneDay;
        System.out.println("За 20 минут машина произвела " + twentyMinutes + " штук бутылок");
        System.out.println("За сутки машина произвела " + oneDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + threeDays + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + oneMonth + " штук бутылок");

        System.out.println("5 задание");
        int totalCans = 120;
        int whiteCans = 2;
        int brownCans = 4;
        int oneClassCans = whiteCans + brownCans;
        int numberOfClasses = totalCans / oneClassCans;
        int totalWhiteCans = whiteCans * numberOfClasses;
        int totalBrownCans = brownCans * numberOfClasses;
        System.out.println("В школе, где " + numberOfClasses + " классов, нужно " + totalWhiteCans + " банок белой краски и " + totalBrownCans + " банок коричневой краски");

        System.out.println("6 задание");
        int banana = 5 * 80;
        int milk = 2 * 105;
        int iceCream = 2 * 100;
        int egg = 4 * 70;
        int totalWeight = banana + milk + iceCream + egg;
        float totalWeightKg = totalWeight / 1000f;
        System.out.println("Вес завтрака в гр: " + totalWeight + " грамм");
        System.out.println("Вес завтрака в кг: " + totalWeightKg + " килограмм");

        System.out.println("7 задание");
        int totalLossWeight = 7 ;
        int lossWeight1 = 250;
        int lossWeight2 = 500;
        int daysLoss1 = totalLossWeight  * 1000 / lossWeight1;
        int daysLoss2 = totalLossWeight  * 1000 / lossWeight2;
        System.out.println(daysLoss1 + " дней");
        System.out.println(daysLoss2 + " дней");
        int averageDays = (daysLoss1 + daysLoss2) / 2;
        System.out.println(averageDays + " дней");
        System.out.println("Если спортсмен будет терять по " + lossWeight1 + " гр в день,то потребуется " + daysLoss1 + " дней." + " А если спортсмен будет терять по " + lossWeight2 + "гр в день,то потребуется " + daysLoss2 + " дней." + " А в среднем на похудение у него уйдет " + averageDays + " день.");

        System.out.println("8 задание");
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;
        double salaryPercentage = 0.10;
        double mashaNewSalary = mashaSalary * (1 + salaryPercentage);
        double denisNewSalary = denisSalary * (1 + salaryPercentage);
        double kristinaNewSalary = kristinaSalary * (1 + salaryPercentage);
        double mashaSalaryDifference = mashaNewSalary - mashaSalary;
        double denisSalaryDifference = denisNewSalary - denisSalary;
        double kristinaSalaryDiffernce = kristinaNewSalary - kristinaSalary;
        double mashaAnnualDiff = (mashaNewSalary - mashaSalary) * 12;
        double denisAnnualDiff = (denisNewSalary - denisSalary) * 12;
        double kristinaAnnualDiff = (kristinaNewSalary - kristinaSalary) * 12;
        System.out.println("Разница у Маши до и после повышения составила - " + (int) mashaSalaryDifference + " рублей ," + " у Дениса составила - " + (int) denisSalaryDifference + " рублей , " + " а у Кристины - " + (int) kristinaSalaryDiffernce + " рублей. ");
        System.out.println("Маша теперь получает " + (int) mashaNewSalary + " рублей ." + " Годовой доход вырос на " + (int) mashaAnnualDiff + " рублей.");
        System.out.println("Денис теперь получает " + (int) denisNewSalary + " рублей ." + " Годовой доход вырос на " + (int) denisAnnualDiff + " рублей.");
        System.out.println("Кристина теперь получает " + (int) kristinaNewSalary + " рублей ." + " Годовой доход вырос на " + (int) kristinaAnnualDiff + " рублей.");
    }
    }
