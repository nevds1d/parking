package user;

public class Parking {
    public int freeParkingPlaces = 100;
    public boolean isFull = true;

    // метод, который выводит количество свободных мест
    public void printFreeParkingPlacesAmount() {
        System.out.println("Свободных парковочных мест осталось " + freeParkingPlaces);
    }
    // метод, который резервирует парковочное место
    public void reserveParkingPlace() {
        if(!isFull) {
            // если парковка не заполнена, можно забронировать место;
            // иначе нужно вывести сообщение о том, что мест больше нет
            System.out.println("Парковочное место забронированно");
            freeParkingPlaces--;
            printFreeParkingPlacesAmount();
            // если после бронирования не осталось свободных мест,
            // то парковка заполнена: переменная isFull == true
            if(freeParkingPlaces == 0){
                isFull = true;
            }
        } else {
            System.out.println("Свободных мест нет!");
        }
    }

}
