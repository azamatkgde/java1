package interfaces.Zhanyl;

class Car implements Driveable {
    public void drive() {
        System.out.println("Машина жол менен жүрүп жатат.");
    }
}

class Airplane implements Driveable, Flyable {
    public void drive() {
        System.out.println("Учак учуу тилкесинде айдап жатат.");
    }

    public void fly() {
        System.out.println("Учак асманда уча алды.");
    }
}

class Boat implements Sailable {
    public void sail() {
        System.out.println("Кеме деңизде сүзүп баратат.");
    }
}