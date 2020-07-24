import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Random random= new Random();
        Set<Integer> setList= new HashSet<>(100);

        for (int i=0;i<100;i++) {
            setList.add(random.nextInt(100));
        }
        for (Integer value:setList) {
            System.out.println(value);
        }

        Scanner input=new Scanner(System.in);

        System.out.println("Introduce un número para ver si está en la SetList");
        Integer valor=input.nextInt();

        System.out.println(setList.contains(valor)?"Sí que existe":"No existe");



    }
}
