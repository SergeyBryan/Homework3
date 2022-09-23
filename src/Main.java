public class Main {
    public static void main(String[] args) {
        // Задание 1
        int first = 1;
        System.out.println(first);
        byte second = 100;
        System.out.println(second);
        short third = 1000;
        System.out.println(third);
        float fourth = 5;
        System.out.println(fourth);
        double fifth = 10.555555;
        System.out.println(fifth);
        // Задание 2
        double first1 = 27.12;
        System.out.println(first1);
        long second1 = 987678965549L;
        System.out.println(second1);
        float third1 = 2.786f;
        System.out.println(third1);
        boolean fourth1 = false;
        System.out.println(fourth1);
        int fifth1 = 569;
        System.out.println(fifth1);
        short sixth1 = -159;
        System.out.println(sixth1);
        long seventh1 = 27897L;
        System.out.println(seventh1);
        byte eighth1 = 67;
        System.out.println(eighth1);
        //Задание 3
        int LydmilaPavlovna = 23;
        int AnnaSergeevna = 27;
        int EkaterinaAndreevna = 30;
        int TotalPaper = 480;
        int PaperPerPupil = TotalPaper/(LydmilaPavlovna+AnnaSergeevna+EkaterinaAndreevna);
        System.out.println("На каждого ученика рассчитано " + PaperPerPupil+ " листов бумаги");
        //Задание 3
        int CapacityPerMinute = 8;
        int CapacityPer20Minutes = 20 * CapacityPerMinute;
        System.out.println("За 20 минут работы машины произвела бутылок "+CapacityPer20Minutes+" штук");
        int CapacityPerDay = 24 * 60 * CapacityPerMinute;
        System.out.println("За день работы машины произвела бутылок "+CapacityPerDay+" штук");
        int CapacityPer3Days = CapacityPerDay*3;
        System.out.println("За 3 дня работы машины произвела бутылок "+CapacityPer3Days+" штук");
        int CapacityPerMonth = CapacityPerDay*30;
        System.out.println("За месяц работы машины произвела бутылок "+CapacityPerMonth+" штук");
        // Задание 5
        int NeedsForWhite = 2;
        int NeedsForBrawn = 4;
        int TotalClasses = 120 / (NeedsForBrawn+NeedsForWhite);
        int White = TotalClasses * NeedsForWhite;
        int Brawn = TotalClasses * NeedsForBrawn;
        System.out.println("В школе, где "+ TotalClasses+ " классов, нужно "+ White + " банок белой краски и "+ Brawn+ " банок коричневой краски");
        // Задание 6
        byte Banana = 80;
        byte Milk100Ml = 105;
        byte IceCream = 50;
        byte Eag = 70;
        double TotalForDrink = (Banana * 5 + Milk100Ml * 2 + IceCream * 2 + Eag * 4);
        double TotalForDrinkKg = TotalForDrink / 1000;
        System.out.println("Вес завтрака равен "+TotalForDrinkKg+" кг");
        // Задание 7
        short FirstOption = 250;
        short SecondOption = 500;
        int TotalDays250 = (7*1000)/FirstOption;
        System.out.println("Чтобы сбросить 7 кг по рациону "+FirstOption+" гр в день потребуется "+TotalDays250+" дней");
        int TotalDays500 = (7*1000)/SecondOption;
        System.out.println("Чтобы сбросить 7 кг по рациону "+SecondOption+" гр в день потребуется "+TotalDays500+" дней");
        // Задание 8
        int MariaSalary = 67760;
        int DenisSalary = 83690;
        int KristinaSalary = 76230;
        double NewMarinaSalary = MariaSalary * 0.1 + MariaSalary;
        double NewDenisSalary = DenisSalary * 0.1 + DenisSalary;
        double NewKristinaSalary = KristinaSalary * 0.1 + KristinaSalary;
        double DifMarinaSalary = NewMarinaSalary * 12 - MariaSalary * 12;
        double DifDenisSalary = NewDenisSalary * 12 - DenisSalary * 12;
        double DifKristinaSalary = NewKristinaSalary * 12 - KristinaSalary * 12;
        System.out.println("Маша теперь получает "+NewMarinaSalary+" рублей. Годовой доход вырос на "+DifMarinaSalary+" рублей");
        System.out.println("Денис теперь получает "+NewDenisSalary+" рублей. Годовой доход вырос на "+DifDenisSalary+" рублей");
        System.out.println("Кристина теперь получает "+NewKristinaSalary+" рублей. Годовой доход вырос на "+DifKristinaSalary+" рублей");
    }
}