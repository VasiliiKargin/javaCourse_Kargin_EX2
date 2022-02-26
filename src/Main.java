public class Main {
    public static void main(String[]args) {
        String city = "Екатеринбург";
        int people = 1_500_000;
        float unemployed = 4.058F;
        char symbol = 0x48;
        byte seat = 41;
        float price = 2100.50F;
        String name = "Василий";
        byte age = 29;
        short growth = 179;
        char ser1 = 'Р';
        char ser2 = 'Х';
        char ser3 = 'Д';
        short numAuto = 651;
        short weightAuto = 1802;
        String nameOrganization = "ООО Дальние просторы";
        int income = 5_521_141;
        float share = 5.12F;
        char rh1 = 'R';
        char rh2 = 'h';
        char rh3 = '+';
        byte blood = 1;
        float bloodShare = 22.12F;
        String univers = "МГУ";
        int students = 45612311;
        float studentShare = 3.85f;
        char ratingFilm= 'R';
        int copysSale = 1_844_545_454;
        byte ratingMovie = 8;
        String brand = "Samsung";
        long product = 5_545_945_651_124L;
        float shareSale = 53.72F;
        char category = '1';
        long code = 56456189498416L;
        float salesShare = 15.32f;
        System.out.printf("1. %s - город, %d - население, %.1f - процент безработных \n", city, people, unemployed);
        System.out.printf("2. %s - Секция на трибуне, %d - место, %.2f - стоимость билета \n", symbol,seat,price);
        System.out.printf("3. %s - Имя, %d - Возраст, %d - рост \n", name, age, growth);
        System.out.printf("4. %s%d%s%s - Номер машины, %d - вес автомобиля\n", ser1, numAuto , ser2, ser3, weightAuto);
        System.out.printf("5. %s - Название компании, %d - годовой доход, %.2f - доля на рынке\n", nameOrganization, income, share);
        System.out.printf("6. %s%s%s - резус-фактор, %d - группа крови, %.2f - доля людей с этой группой крови\n",rh1, rh2, rh3, blood,bloodShare);
        System.out.printf("7. %s - название универа, %d - число студентов, %.2f - доля отчисленных\n",univers,students, studentShare);
        System.out.printf("8. %s - рейтинг фильма, %d - копий продано, %d - рейтинг \n", ratingFilm, copysSale,ratingMovie);
        System.out.printf("9. %s - название бренда, %d - произведено товара, %.2f - процент продаж\n", brand,product, shareSale);
        System.out.printf("10. %s - категория товара, %d - штрих код, %.2f - процент покупателей", category,code,salesShare);
    }
}