package sem6.task6;

interface Bird {
    void move();
}

class Sparrow implements Bird {
    @Override
    public void move() {
        // Полет воробья
    }
}

class Ostrich implements Bird {
    @Override
    public void move() {
        // Движение страуса, не включает полет
    }
}
