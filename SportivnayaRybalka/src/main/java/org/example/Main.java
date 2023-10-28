package org.example;

import javax.xml.transform.Result;
import java.sql.*;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {
         String name;
         int age;
         String udochka;



        try {
            //Адрес базы данных
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://localhost:5432/SportRybalka";

            //Создание св-тв соединения с базой данных
            Properties authorization = new Properties();
            authorization.put("user", "postgres");          //зададим Имя пользователя
            authorization.put("password", "postgres");      //зададим пароль пользователя

            //Создание соединения с базой данных
            Connection connection = DriverManager.getConnection(url, authorization);

            //Создание оператора доступа к базе данных
            Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            ResultSet table = statement.executeQuery("SELECT * FROM public.rybak");

            //Выведем имена полей
            table.first();
            for(int i = 1; i <= table.getMetaData().getColumnCount(); i++){
                System.out.println(table.getMetaData().getColumnName(i) + "\t\t");
            }
            System.out.println();

            //Выведем записи таблицы
            table.beforeFirst();
            while(table.next()){
                for (int i = 1; i < table.getMetaData().getColumnCount(); i++){
                    System.out.println(table.getString(i) + "\t\t");
                }
                System.out.println();
            }












            //Че то закрываем
            table.close();
            statement.close();
            connection.close();





        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }




    }
}