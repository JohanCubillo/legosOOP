/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author johan_9mx9tzb
 */
public class main{
    
    public static void main(String[] args) {
        LegoFactory factory = new LegoFigureFactory();
        LegoFigure figure = new LegoFigure(factory);
        figure.draw();
    }

}
