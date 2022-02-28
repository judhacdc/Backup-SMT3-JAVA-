/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan9_Praktikum1;

/**
 *
 * @author Judha Maygustya
 */
public class PlainCandy extends GameItem implements movable, Crushable {

    @Override
    public void moveLeft() {
        this.positionX -= 1;
    }

    @Override
    public void moveRight() {
        this.positionX += 1;
    }

    @Override
    public void moveUp() {
        this.positionY += 1;
    }

    @Override
    public void moveDown() {
        this.positionY -= 1;
    }

    @Override
    public void disappear() {
        this.positionY -= 1;
        this.positionX -= 1;
    }

}
