package user;

 class ParkingService {
     public static void main(String[] args) {

         Parking parking = new Parking();

         parking.reserveParkingPlace();
         parking.reserveParkingPlace();
         parking.reserveParkingPlace();

         parking.leaveParkingPlace();

         System.out.println("Свободны ли еще места? - " + !parking.isFull);
     }
}
