public class ParkingDemo {
    public static void main(String[] args) {
        int data1,data2,data3,data4,data5;
        ParkingLot obj = new ParkingLot("PRKLT!", 5, 10);
        data1 = obj.getNoOfOpenSlots("car");
        System.out.println(data1);
    }
}
