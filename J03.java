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
    // double cost = CPU.speed2_4 + HD.G_160 + 500; // interclass neeed to be used className + "." add on calculating variable that situation could be visited

    public double pcGetPrice(){
        double price = (CPU.speed2_4 + HD.G_160) * 1.8;
        return price;
    }
}
class Note15 extends Component{
    // double cost = (LCD.inch_15 + CPU.speed2_2 + HD.G_160) * 1.4;
    public double note15GetPrice(){
        double price = (LCD.inch_15 + CPU.speed2_2 + HD.G_160) * 2;
        return price;
    }
}

public class J03{
    public static void main(String args[]){
        PC pcPrice = new PC();
        double pcPriceData = pcPrice.pcGetPrice(); // could directly take method and use variable to point the objecd mixed method

        Note15 note15Price = new Note15();
        double note15GetPriceData = note15Price.note15GetPrice();

        if(pcPriceData < note15GetPriceData){
            System.out.println("Note15 is more expensive than PC");
        }else{
            System.out.println("PC is more expensive than Note15");
        }
    }
}
