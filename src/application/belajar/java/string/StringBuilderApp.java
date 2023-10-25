package application.belajar.java.string;

public class StringBuilderApp{
    public static void main(String[] args) {
        // String name = "Yanuar";
        // name = name + " " + "fauzan";
        // name = name + " " + "Isnain";

        // System.out.println(name);

        StringBuilder builder = new StringBuilder();
        builder.append("Yanuar");
        builder.append(" ");
        builder.append("Fauzan");
        builder.append(" ");
        builder.append("Isnain");

        String name = builder.toString();

        System.out.println(name);
        
    }
}
