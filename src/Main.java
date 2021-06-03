import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int a = 100_000_001;
        System.out.println(a);
        System.out.println(intToArm(a));
    }


    public static String intToArm(int number) {
        StringBuilder result = new StringBuilder();
        //millions
        int millions = number / 1_000_000;
        if (millions != 0 && millions < 10) {
            result.append(mianish[millions]).append(" ").append(zroner[2]).append(" ");
        } else if (millions != 0 && millions < 20) {
            int digit = millions % 10;
            millions /= 10;

            result.append(erknish[millions]).append("ն").append(mianish[digit]).append(zroner[2]).append(" ");
        } else if (millions != 0 && millions < 100) {
            int digit = millions % 10;
            millions /= 10;

            result.append(erknish[millions]).append(mianish[digit]).append(zroner[2]).append(" ");
        } else if (millions != 0) {
            int digit = millions / 100;
            millions %= 100;
            if (digit == 1) {
                result.append(zroner[0]).append(" ").append(zroner[2]).append(" ");
            } else {
                result.append(mianish[digit]).append(" ").append(zroner[0]).append(" ");
            }
            if (millions != 0 && millions < 10) {
                result.append(mianish[millions]).append(" ").append(zroner[2]).append(" ");
            } else if (millions != 0 && millions < 20) {
                digit = millions % 10;
                millions /= 10;

                result.append(erknish[millions]).append("ն").append(mianish[digit]).append(" ").append(zroner[2]).append(" ");
            } else if (millions != 0 && millions < 100) {
                digit = millions % 10;
                millions /= 10;

                result.append(erknish[millions]).append(mianish[digit]).append(" ").append(zroner[2]).append(" ");
            }
        }

        number = number % 1_000_000;
        int thousands = number / 1_000;
        if (thousands != 0 && thousands < 10) {
            result.append(mianish[thousands]).append(" ").append(zroner[1]).append(" ");
        } else if (thousands != 0 && thousands < 20) {
            int digit = thousands % 10;
            thousands /= 10;

            result.append(erknish[thousands]).append("ն").append(mianish[digit]).append(zroner[1]).append(" ");
        } else if (thousands != 0 && thousands < 100) {
            int digit = thousands % 10;
            thousands /= 10;

            result.append(erknish[thousands]).append(mianish[digit]).append(zroner[1]).append(" ");
        } else if (thousands != 0) {
            int digit = thousands / 100;
            thousands %= 100;
            if (digit == 1) {
                result.append(zroner[0]).append(" ");
            } else {
                result.append(mianish[digit]).append(" ").append(zroner[0]).append(" ");
            }
            if (thousands != 0 && thousands < 10) {
                result.append(mianish[thousands]).append(" ").append(zroner[1]).append(" ");
            } else if (thousands != 0 && thousands < 20) {
                digit = thousands % 10;
                thousands /= 10;

                result.append(erknish[thousands]).append("ն").append(mianish[digit]).append(" ").append(zroner[1]).append(" ");
            } else if (thousands != 0 && thousands < 100) {
                digit = thousands % 10;
                thousands /= 10;

                result.append(erknish[thousands]).append(mianish[digit]).append(" ").append(zroner[1]).append(" ");
            }
        }
        number = number % 1000;
        int hundreds = number / 100;
        if (hundreds != 0) {
            if (hundreds == 1)
                result.append(zroner[0]).append(" ");
            else
                result.append(mianish[hundreds]).append(" ").append(zroner[0]).append(" ");
        }

        number = number % 100;
        if (number != 0 && number < 10) {
            result.append(mianish[number]).append(" ");
        } else if (number != 0 && number < 20) {
            int digit = number % 10;
            number /= 10;

            result.append(erknish[number]).append("ն").append(mianish[digit]);
        } else{
            int digit = number % 10;
            number /= 10;
            result.append(erknish[number]).append(mianish[digit]);
        }
        return result.toString();
    }



        public static final String[] mianish = {
                "",
                "մեկ",
                "երկու",
                "երեք",
                "չորս",
                "հինգ",
                "վեց",
                "յոթ",
                "ութ",
                "ինը",

        };
        public static final String[] erknish = {
                "",
                "տաս",
                "քսան",
                "երեսուն",
                "քառասուն",
                "հիսուն",
                "վաթսուն",
                "յոթանասուն",
                "ութսուն",
                "իննսուն"
        };
        public static final String[] zroner = {
                "հարյուր",
                "հազար",
                "միլիոն"
        };

    }
