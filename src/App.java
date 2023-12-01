import java.util.*;

public class App {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("Lenovo IdealPad 5", 8, 256, "Windows", "синий", 15.6);
        Laptop laptop2 = new Laptop("Honor MagicBook 16", 16, 512, "нет", "серый", 16.1);
        Laptop laptop3 = new Laptop("Apple MacBook Air 13", 8, 256, "MacOs", "золотистый", 13.3);
        Laptop laptop4 = new Laptop("HP 250 G7", 4, 1024, "нет", "черный", 15.6);
        Laptop laptop5 = new Laptop("Xiomi RedmiBook 15", 8, 256, "Windows", "серый", 15.6);

        Set<Laptop> unicLaptop = new HashSet<Laptop>();
        unicLaptop.add(laptop1);
        unicLaptop.add(laptop2);
        unicLaptop.add(laptop3);
        unicLaptop.add(laptop4);
        unicLaptop.add(laptop5);

        Scanner sc = new Scanner(System.in);
        System.out.print("1. Объем оперативной памяти \n2. Объем накопителя \n3. ОС \n4. Цвет \n5. Диагональ \nВведите номер желаемой характеристики: ");
        int userSelect = sc.nextInt();
        switch (userSelect) {
            case (1):
                System.out.print("Введите объем оперативной памяти: ");
                int ramUser = sc.nextInt();
                for(Laptop lap: unicLaptop) {
                    if (lap.getRam() >= ramUser) {
                        System.out.println(lap.toString());
                    }
                }
                break;
            case (2):
                System.out.print("Введите объем накопителя: ");
                int storageUser = sc.nextInt();
                for(Laptop lap: unicLaptop) {
                    if (lap.getStorageCap() >= storageUser) {
                        System.out.println(lap.toString());
                    }
                }
                break;
            case (3):
                System.out.print("Введите OC: ");
                String osUser = sc.next();
                for(Laptop lap: unicLaptop) {
                    if (lap.getOS().equals(osUser)) {
                        System.out.println(lap.toString());
                    }
                }
                break;
            case (4):
                System.out.print("Введите цвет: ");
                String colorUser = sc.next();
                for(Laptop lap: unicLaptop) {
                    if (lap.getColor().equals(colorUser)) {
                        System.out.println(lap.toString());
                    }
                }
                break;
            case (5):
                System.out.print("Введите диагональ: ");
                double digUser = sc.nextDouble();
                for(Laptop lap: unicLaptop) {
                    if (lap.getDiagonal() >= digUser) {
                        System.out.println(lap.toString());
                    }
                }
                break;
            default:
                System.out.print("Вы выбрали несуществующую характеристику");
        }

        sc.close();
    }
}
