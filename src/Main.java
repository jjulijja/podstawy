public class Main {
    public static void main(String[] args) {
        int liczba = 5;
        int liczba2;
        liczba2 = 5;
//        System.out.println("Hello World" + liczba);
//        System.out.println("cokolwiek");
//
//
//        System.out.println(liczba % liczba2 );
//
//        String name = "Julia";
//        int age = 22;
//        System.out.println("My name is " + name + " and I am " + age );
//
        String account = " JuliaHarbuzova ";

        System.out.println(account.length());

        System.out.println(account.indexOf('r'));

        System.out.println(account.substring(0,2));

        System.out.println(account.trim());

        System.out.println(account.length());

        char a = 'a';

        char alpha = '\u03B1';
        System.out.print(alpha);

        char[] witaj = {'w', 'i', 't', 'a', 'j'};
        System.out.println( witaj);
        Character.isDigit(a);
        System.out.println(Character.isDigit(a));

        if (liczba>liczba2 & liczba2==liczba){
            System.out.println("SystemDziałą");
        }else {
            System.out.println("SystemNieDziała");
            if (liczba==liczba2) {
                System.out.println("SystemDziała1");
            }
        }


    }
}
