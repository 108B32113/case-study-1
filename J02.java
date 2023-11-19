class Component{
    class LCD{// interclass, if we want to take them we should use "." + variable in other class
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
}
class PC extends Component{
    // component: speed2_4 = 11000
    //            G_160 = 2800
    double cost = CPU.speed2_4 + HD.G_160 + 500; // interclass neeed to be used className + "." add on calculating variable that situation could be visited
    double price = (CPU.speed2_4 + HD.G_160) * 1.8;

    void getCost(){
        System.out.print("PC cost:" + cost);
    }
    void getPrice(){
        System.out.println(", price:" + price);
    }
}
class MultiPC extends Component{
    // can hang multi various components in here
    int speed2_4cpuCount;
    int G_160hdCount;

    MultiPC(int speed2_4cpuCount, int G_160hdCount){
        this.speed2_4cpuCount = speed2_4cpuCount;
        this.G_160hdCount = G_160hdCount;
    }

    // double cost = (CPU.speed2_4 + HD.G_160) * 1.2;
    // double price = (CPU.speed2_4 + HD.G_160) * 1.8;

    void getCost(){
        double cost = (CPU.speed2_4*speed2_4cpuCount + HD.G_160*G_160hdCount) * 1.2;
        System.out.print("MultiPC cost: " + speed2_4cpuCount + "CPU, " + G_160hdCount +"HD, cost:" + cost);
    }
    void getPrice(){
        double price = (CPU.speed2_4*speed2_4cpuCount + HD.G_160*G_160hdCount) * 1.8;
        System.out.println(", price:" + price);
    }
}

public class J02 {
    public static void main(String args[]){
        PC pc1 = new PC();
        pc1.getCost(); pc1.getPrice();

        MultiPC mulP1 = new MultiPC(2, 4);
        mulP1.getCost();
        mulP1.getPrice();
        MultiPC mulP2 = new MultiPC(4, 8);
        mulP2.getCost();
        mulP2.getPrice();

    }
}
