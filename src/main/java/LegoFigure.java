/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author johan_9mx9tzb
 */

    public class LegoFigure {
    private Head head;
    private Body body;
    private Arms arms;

    public LegoFigure(LegoFactory factory) {
        head = factory.createHead();
        body = factory.createBody();
        arms = factory.createArms();
    }

    public void draw() {
        head.draw();
        body.draw();
        arms.draw();
    }
}

