package org.example;

import java.sql.*;
import java.util.Random;

public class Bytva1v1 {
    public static void boy(Rybak r1, Rybak r2, Ozero o1) throws RuntimeException {

        if(new Random().nextInt(2) == 0){
            System.out.println(r1.getName() + " победил в битве на озере " + o1.getNameOfOzero() + " При помощи удочки " + r1.getUdochka());

        }else {
            System.out.println(r2.getName() + " победил в битве на озере " + o1.getNameOfOzero() + " При помощи удочки " + r2.getUdochka());
        }
    }
}
