package org.example;

public class Rybak {
    private String name;
    private int age;
    private String udochka;
    private boolean geyOrNo;

    public Rybak(String name, int age, String udochka, boolean geyOrNo) {
        this.name = name;
        this.age = age;
        this.udochka = udochka;
        this.geyOrNo = geyOrNo;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getUdochka() {
        return udochka;
    }

    public boolean isGeyOrNo() {
        return geyOrNo;
    }

    @Override
    public String toString() {
        return "Rybak{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", udochka='" + udochka + '\'' +
                ", geyOrNo=" + geyOrNo +
                '}';
    }
}
