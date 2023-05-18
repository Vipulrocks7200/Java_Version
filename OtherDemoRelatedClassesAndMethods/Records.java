public class Records {
    //Records to replace POJO

    public static void main(String[] args) {
        VehicleRecord vehicleRecord = new VehicleRecord("XYZ", "Test");
        System.out.println(vehicleRecord.code());
        System.out.println(vehicleRecord.engineType());
    }
}
