package application.belajar.java.string;

public class NumberApp {
    public static void main(String[] args) {
        
        Integer intValue = 10;
        
        Long longValue = intValue.longValue();
        Double doubleValue = longValue.doubleValue();
        
        String contoh = "10000";
        
        Integer contohInt = Integer.valueOf(contoh);

        System.out.println(contohInt);
    }
    
}
