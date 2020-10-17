import java.util.Random;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] poshtes = {"gmail", "yandex", "mail", "ya", "yahoo"};
        String[] domens = {"com", "ru","in","su","net"};
        String[] symbols = {"ABCDEFGHIJKLMNOPQRSTUVWXYZ", "abcdefghihklmnopqrstuvwxyz", "1234567890-_"};

        System.out.print("Mail name: ");
        String poshta = sc.nextLine();
        if (poshta.equals("random")) {
            poshta = poshtes[new Random().nextInt(poshtes.length)];
        }

        System.out.print("Domain name: ");
        String domen = sc.nextLine();
        if (domen.equals("random")) {
            domen = domens[new Random().nextInt(domens.length)];
        }
        String password = "";
        int lenght_pass = 20;
        for (int i = 0; i < lenght_pass; i++) {
            password += symbols[new Random().nextInt(2)].charAt(new Random().nextInt(26));
        }

        String mail = "";
        int lenght_mail = 7;
        for (int i = 0; i < lenght_mail; i++) {
            mail += symbols[1].charAt(new Random().nextInt(26));
        }

        mail = mail + "@" + poshta + "." + domen;
        System.out.println("Your main - " + mail);
        System.out.println("Your password - " + password);
    }
}
