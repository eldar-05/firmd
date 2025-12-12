package g_exception;

import java.rmi.server.ExportException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter a number:");
            int number = sc.nextInt();
        } catch (ArithmeticException e){
            System.out.println("You cant devide into zero");
        } catch(InputMismatchException e){
            System.out.println("That is not a number");
        } catch(Exception e){
            System.out.println("Something went wrong");
        } finally {
            System.out.println("Finished!");
        }
    }
}
