import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] m = new double[3];
        m[0]=1.5;
        m[1]=2.0;
        m[2]=2.5;
        
        Class class1 = new Class(5, "B", m);
        System.out.println(class1.getNomer());
        System.out.println(class1.getSoz());
        System.out.println(Arrays.toString(class1.getMasiv()));
    }
}