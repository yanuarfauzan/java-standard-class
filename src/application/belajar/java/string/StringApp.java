package application.belajar.java.string;

public class StringApp {
    public static void main(String[] args) {
        String name = "Yanuar Fauzan Isnain";
        String nameLowerCase = name.toLowerCase();
        String nameUpperCase = name.toUpperCase();

        System.out.println(name);
        System.out.println(nameLowerCase);
        System.out.println(nameUpperCase);
        System.out.println("Nama panjangnya dari name : " + name.length());
        System.out.println("Nama dimulai dari Yanuar ? " + name.startsWith("Yanuar"));
        System.out.println("Nama diakhiri dari Isnain ? " + name.endsWith("Isnain"));

        String[] names = name.split(" ");
        for (var value : names) {
            System.out.println("splitted " + value);
        }

        char[] chars = name.toCharArray();
        

        System.out.println("chars of name = " + chars);
        // System.out.println(names);
    }
}
