//cost
class LCD{
    public static int inch_10 = 2000;
    public static int inch_15 = 2500;
    public static int inch_17 = 3000;
}
class CPU{
    public static double speed1_66 = 6000;
    public static double speed2_2 = 8000;
    public static double speed2_4 = 11000;
}
class HD{
    public static int G_120 = 2400;
    public static int G_160 = 2800;
}

class MiniNote{
    public double getCost(int inch_10, double speed1_66, int G_120){
        double cost = (inch_10 + speed1_66 + G_120) * 1.4;
        System.out.print(cost);
        return cost; // return is the terminated point that return must be allocate end of method
    }
    public double getPrice(int inch_10, double speed1_66, int G_120){
        double price = (inch_10 + speed1_66 + G_120) * 2;
        System.out.println(price);
        return price;
    }
}

class Note15{
    public double getCost(int inch_15, double speed2_2, int G_160){
        double cost = (inch_15 + speed2_2 + G_160) * 1.4;
        System.out.print(cost);
        return cost;
    }
    public int getPrice(int inch_15, double speed2_2, int G_160){
        double price = (inch_15 + speed2_2 + G_160) * 2;
        int Iprice = (int)price;
        System.out.print(Iprice);
        return Iprice;
    }
}

public class J01{
    public static void main(String args[]){
        MiniNote mininote1 = new MiniNote();
        System.out.print("MiniNote cost:");
        mininote1.getCost(LCD.inch_10, CPU.speed1_66, HD.G_120); //it can not be took initial value but we have to add a class name
        System.out.print(", price:");
        mininote1.getPrice(LCD.inch_10, CPU.speed1_66, HD.G_120);

        Note15 note15_1 = new Note15();
        System.out.print("Note15 cost:");
        note15_1.getCost(LCD.inch_15, CPU.speed2_2, HD.G_160);
        System.out.print(", price:");
        note15_1.getPrice(LCD.inch_15, CPU.speed2_2, HD.G_160);

    }
}