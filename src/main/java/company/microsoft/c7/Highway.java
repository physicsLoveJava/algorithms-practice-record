package company.microsoft.c7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Highway {

    static class Car {
        int x;
        int y;
        int v;
        double d;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        Car[] cars = new Car[t];
        for (int i = 0; i < t; i++) {
            cars[i] = new Car();
            cars[i].x = scanner.nextInt();
            cars[i].y = scanner.nextInt();
            cars[i].v = scanner.nextInt();
        }
        Car[] nCars = Arrays.copyOf(cars, cars.length);
        Car[] yCars = Arrays.copyOf(cars, cars.length);
        Arrays.sort(nCars, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return Integer.compare(o1.x, o2.x);
            }
        });
        Arrays.sort(yCars, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return Integer.compare(o1.y, o2.y);
            }
        });
        for (int i = nCars.length - 1; i >= 0; i--) {
            Car car = nCars[i];
            double time = 0;
            int np = car.x;
            for (int j = 0; j < yCars.length; j++) {
                if(yCars[j].y > np) {
                    time += (yCars[j].y - np) / (double) car.v;
                    np = yCars[j].y;
                    time = Math.max(yCars[j].d, time);
                    yCars[j].d = time;
                    if(yCars[j].y == car.y) {
                        car.d = yCars[j].d;
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < cars.length; i++) {
            System.out.printf("%2f\n", cars[i].d);
        }
    }

}
