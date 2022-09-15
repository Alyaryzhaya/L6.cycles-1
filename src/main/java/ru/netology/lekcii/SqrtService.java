package ru.netology.lekcii;

public class SqrtService {

    public int calcSqrt(int x) {
        for (int i = 1; i <= x; i++) {
            if (i * i >= x) {
//                    System.out.println("Корень " + x + " равен " + i);
//                    break;
//             вместо вывода на экран пишем return, и он сам прекратит выполнение команды
                return i;
            }
        }
        return -1;
    }
}
