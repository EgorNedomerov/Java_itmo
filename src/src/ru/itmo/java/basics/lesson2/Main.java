package src.ru.itmo.java.basics.lesson2;

public class Main {
    public static void main(String[] args) {
        SeaVessels seaVessels = new SeaVessels("BOAT", "SEADOO");
        seaVessels.setEngineCapacity(6.0);
        seaVessels.setDisplacement(1000);
        seaVessels.setColor(Color.RED);
        System.out.println(seaVessels);
    }
}
