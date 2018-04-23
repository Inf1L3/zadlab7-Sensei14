/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl7;

/**
 *
 * @author Sensei
 */
public class Punkt3D extends Punkt2D{
    
    private int z;
 

    
    
    @Override
   public void losuj()
    {
       this.x = r.nextInt(21)-10;
       this.y = r.nextInt(21)-10;
       this.z = r.nextInt(21)-10;
        
    }

    @Override
    public String toString() {
        return "Punkt3D{" + "z=" + z + ", x=" + x + ", y=" + y + '}';
    }

   
   
   
}
