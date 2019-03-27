package ru.guzev.mihan;

public class MyFirstProgram {
    public static void main(String[] args) {
        Sguare s = new Sguare(5);
        System.out.println("Площадь квадрата со стороной: " + s.l+ " = " + s.area());

        Rectangle r = new Rectangle(4,6);
        System.out.println("Площадь прямоугольника со сторонами: "+ r.a + " и "+r.b+" = "+r.area());
    }
}
