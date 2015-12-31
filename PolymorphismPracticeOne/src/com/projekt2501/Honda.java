package com.projekt2501;

class Honda extends Car{
    public Honda(String name, int cylinders) {
        super(name, cylinders);
    }

    public String startEngine(){
        return "Honda: startEngine().";
    }
    public String accelerate(){
        return "Honda: accelerate().";
    }
    public String brake(){
        return "Honda: brake().";
    }
}

