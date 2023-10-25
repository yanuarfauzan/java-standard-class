package application.belajar.java.string;

import java.util.StringJoiner;

public class StringJoinerApp {
    public static void main(String[] args) {
        String[] names = {"Yanuar", "Fauzan", "Isnain"};
        StringJoiner joiner = new StringJoiner("||", "[", "]");

        for (var name : names) {
            joiner.add(name);
        }

        System.out.println(joiner.toString());
    }
}
