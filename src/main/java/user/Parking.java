package user;

public class Parking {
    // константа, отвечающая за общее количество парковочных мест
    public static final int TOTAL_PARKING_PLACE = 100;
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
    //метод, который освобождает парковочное место
    public void leaveParkingPlace() {
        // если свободных мест меньше, чем всего мест на
        // парковке (то есть хотя бы одно место занято),
        // можно освободить место и увеличить количество свободных мест на 1
        if(freeParkingPlaces < TOTAL_PARKING_PLACE) {
            freeParkingPlaces++;
            System.out.println("Автомобиль покинул парковку");
            printFreeParkingPlacesAmount();
            isFull = false;
        } else {
            System.out.println("Парковочных мест не может быть больше" + TOTAL_PARKING_PLACE);
        }
    }
}
