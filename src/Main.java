import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("enter the number" + "\n");
        Scanner scNumber = new Scanner(System.in);
        int number = scNumber.nextInt();
        if (number == 7) System.out.print("Привет" + "\n");

        System.out.print("enter name" + "\n");
        Scanner scName = new Scanner(System.in);
        String name = scName.nextLine();
        if (name.equals("Вячеслав") || name.equals("вячеслав")) System.out.print("Привет, " + name);
        else System.out.print("Нет такого имени");
        }
    }


// [((())()(())]] не верно количество квадратных скобок (лишняя закрывающая последняя)
// и круглых (не хватает закрывающей скобки перед квадратной)
// верный вариант [((())()(()))]