package src.Calculator;

import java.util.Scanner;

public class Main {

  static void main(String[] args) {

    while (true){
      try{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int firstNum = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Введите арифметический знак (+, -, *, /): ");
        String firstString = scanner.nextLine();
        char firstChar = firstString.charAt(0);
        System.out.print("Введите второе число: ");
        int secondNum = scanner.nextInt();
        if (firstChar == '+') {
          System.out.println(firstNum + secondNum);
          if (offQuestions() == true){
            break;
          }
        } else if (firstChar == '-') {
          System.out.println(firstNum - secondNum);
          if (offQuestions() == true){
            break;
          }
        } else if (firstChar == '*') {
          System.out.println(firstNum * secondNum);
          if (offQuestions() == true){
            break;
          }
        } else if (firstChar == '/') {
          System.out.println(firstNum / secondNum);
          if (offQuestions() == true){
            break;
          }
        }else {
          System.out.println("Арифметическая операция введена некоррктно");
          if (offQuestions() == true){
            break;
          }
        }
      }catch(ArithmeticException e){
        System.out.println("Ошибка операции: " + e.getMessage());
        System.out.println("Начните заново");
        if (offQuestions() == true){
          break;
        }
      }catch (Exception e){
        System.out.println("Непредвиденная ошибка: " + e.getMessage());
        System.out.println("Начните заново");
        if (offQuestions() == true){
          break;
        }
      }
    }

  }

  public static boolean offQuestions () {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Продолжить вычисления? Введите Да/Нет");
    String thirtyString = scanner.nextLine();
    return thirtyString.equalsIgnoreCase("Нет");
  }
}
