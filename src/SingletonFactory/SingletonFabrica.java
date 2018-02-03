/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SingletonFactory;

/**
 *
 * @author Jimmy Salami
 */
public class SingletonFabrica implements Factory{
    private int counter = 0;

    private static SingletonFabrica uniqueInstance = new SingletonFabrica();

    private SingletonFabrica() {}

    public synchronized Bar create(int id) {
        Bar bar = new OompaloompaBar(counter++);
        System.out.println(id + " creates new Oompaloompa bar created with id:" + counter);
        return bar;
    }

    public static synchronized SingletonFabrica getInstance() {
        return uniqueInstance;
    }
}




