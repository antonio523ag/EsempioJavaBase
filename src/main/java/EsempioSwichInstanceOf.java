import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class EsempioSwichInstanceOf {

    public static void main(String[] args) {
        int i=new Scanner(System.in).nextInt();
        var obj=getValue(i);
        switch (obj){
            case Integer i1 -> System.out.println("integer");
            case String s -> System.out.println("String");
            case LocalDate l -> {
                String data = l.format(DateTimeFormatter.ofPattern("EEEE dd MMMM yyyy"));
                System.out.println(data);
            }
            case null -> System.out.println("null");
            default -> System.out.println("Object");
        };

        if(obj instanceof Integer){
            int i1 = (Integer) obj;
            System.out.println(i1);
        }else if(obj instanceof LocalDate){

        }
    }

    private static Object getValue(int i){
        return switch (i){
            case 1 -> 6;
            case 2 -> "ciao";
            case 3 -> new Object();
            case 4 -> LocalDate.now();
            default -> null;
        };

    }
    private static Object getValue2(int i){
        switch (i){
            case 1:
                return 6;
            case 2:
                return "ciao";
            case 3:
                return new Object();
            case 4:
                return LocalDate.now();
            default:
                return null;
        }
    }
}
