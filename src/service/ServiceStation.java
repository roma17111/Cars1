package service;

import transport.Car;

import javax.swing.*;
import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation <C extends Car> {







    private Queue<C> queue = new LinkedList<>();

    public void addCarToQueue(C car) {
        queue.offer(car);
    }

    public void doServiceCar() {
        C car = queue.poll();
        if (car != null) {
            JOptionPane.showMessageDialog(null, "Авто " +
                    car.getBrand() +" "+ car.getModel() + " обслужено.");
            doServiceCar();
        }else {
            JOptionPane.showMessageDialog(null,"Нет машин в очереди");
        }

    }
}
