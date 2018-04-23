/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl7;

import java.util.Random;

/**
 *
 * @author Sensei
 */
public class Punkt2D {
    
    protected int x;
   protected int y;
    Random r = new Random();
    
    public Punkt2D()
    {
        this.x = 0;
        this.y = 0;
    }
    
    public Punkt2D(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
            
    
    public void losuj()
    {
        this.x = r.nextInt(21)-10;
        this.y = r.nextInt(21)-10;
    }

    
    @Override
    public String toString() {
        return "Punkt2D{" + "x=" + x + ", y=" + y + '}';
    }
    
    
    
}
