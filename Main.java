import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kaç Derece: ");
        int c = scanner.nextInt();
        if (c<5){
            System.out.println("Kayak Yapmanızı Öneririz.");
        }
        else if (c<=25){
            if (c<=15){
                System.out.println("Sinemaya Gitmenizi Öneririz");
            }
            if (c>=10){
                System.out.println("Pikniğe Gitmenizi Öneririz.");
            }
        }
        else {
            System.out.println("Yüzmenizi Öneririz");
        }
    }
}