import java.util.Scanner;

//Тест для компилятора формул.
public class CompfTest {
    public static void main(String[] args) throws Exception {
        Compf c = new Compf();

        Scanner in = new Scanner(System.in);
        while(true){
            System.out.print("Введите формулу -> ");
            c.compile(in.next().toCharArray());
            System.out.print("\n");
        }
    }
}