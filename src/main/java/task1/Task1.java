package task1;

import task1.office.Boss;
import task1.office.Manager;
import task1.office.Person;

import java.io.IOException;

public class Task1 {
    public static void main(String[] args) throws IOException {
        IntParser parser = new IntParser();
        String line = "1000";
        int res1 = parser.parse(line);
        System.out.println(res1);
        long numLong = 2147483648L;// почему в консоле -2147483648
        int res2 = parser.parse(numLong);
        System.out.println(res2);
        byte numByte = 100;
        int res3 = parser.parse(numByte);
        System.out.println(res3);
        Person p1 = new Person("Ben", "Margera", 41);
        Person p2 = new Person("Ben", "Margera", 41);
        Manager manager = new Manager("L1", "Mary", "McNill", 22);
        Boss boss = new Boss("midle", "Dan");

        System.out.println(p1 == p2); // почему ответ false
        System.out.println(p1.equals(p2));// а здесь true
        System.out.println(p1 instanceof Person);
        System.out.println(manager instanceof Person);
        System.out.println(boss instanceof Person);
        System.out.println(manager instanceof Manager);
        System.out.println(boss instanceof Boss);

        //по аналогии с оффисом создай пакет на лоюбую тему, можешь например школу,
        // в нем создать учителя - учитель литературы, учитель физики, ученик, ну и базовый класс Человек
        //напиши все геттеры сеттеры, чтобы можно было создавать сущность как через конструктор, так и через сеттер

        // пример создания через сеттеры
        Manager manager1 = new Manager();// manager1 и manager2 это по сути одинаковые обьекты, просто способ создания разный
        manager1.setName("Amanda");
        manager1.setSurname("Jeferson");
        manager1.setAge(24);
        manager1.setLevel("mid");

        // пример создания через конструктор
        Manager manager2 = new Manager("mid", "Amanda", "Jeferson", 24);
        System.out.println("mid".equals("mid"));
        System.out.println(manager1.equals(manager2));
        // manager1 и manager2 это по сути одинаковые обьекты, просто способ создания разный
        
    }
}
