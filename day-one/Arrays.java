import java.util.ArrayList;

public class Arrays {
    public static void main(String[] args) {
        System.out.println("This is the arrays ");
        // there are two type of arrays what I see in Java one is regular array not dynamic and
        // static
        // while arrayList is the dynamic and not static you can append expand the length or add new
        // value easily
        // without the need to be specific of the length that it will be added

        int[] arrayOfInteger = new int[10];
        String[] arrayOfString = new String[10];
        double[] arrayOfDouble = new double[10];
        boolean[] arrayOfBoolean = new boolean[10];
        // you need to import arraylist from java.util
        ArrayList<Integer> arrayListOfInteger = new ArrayList<Integer>();
        ArrayList<Double> arrayListOfDouble = new ArrayList<Double>();
        ArrayList<String> arrayListOfString = new ArrayList<String>();
        ArrayList<String> arrayListOfT = new ArrayList<>();


    }
}
