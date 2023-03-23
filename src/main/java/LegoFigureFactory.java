/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author johan_9mx9tzb
 */
public class LegoFigureFactory implements LegoFactory {
    @Override
    public Head createHead() {
        // Seleccionar aleatoriamente la cabeza del personaje
        int randomNumber = (int) (Math.random() * 3) + 1; // Genera un número aleatorio del 1 al 3
        if (randomNumber == 1) {
            return new BatmanHead();
        } else if (randomNumber == 2) {
            return new RobinHead();
        } else {
            return new SupermanHead();
        }
    }

    @Override
    public Body createBody() {
        return new LegoBody();
    }

    @Override
    public Arms createArms() {
        return new LegoArms();
    }
}