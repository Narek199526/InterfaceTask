package Interfaces;

class Human implements Speakable {
    @Override
    public void speak() {
        System.out.println("I speak");
    }
}
