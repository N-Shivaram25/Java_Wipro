class GenericDemo<gd>{
    private gd x;
    public static <gd> void gdm(gd m){
       // this.x = m;
        System.out.println("This is a type of "+m);
    }
}
public class Generic {
    public static void main(String[] args) {
        GenericDemo<Integer> gi = new GenericDemo<Integer>();
        gi.gdm(10);
        GenericDemo<String> gs = new GenericDemo<String>();
        gs.gdm("Shiva Magma");
        GenericDemo<Double> gD = new GenericDemo<Double>();
        gD.gdm(1.6);
    }
}