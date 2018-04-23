/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl7;

/**
 *
 * @author student
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//         Student s = new Student(1, "In", "Inf", 3, "Jan", "Kowalski", 1997, "M");
//        
//       
//        System.out.println(s.toString());


          Punkt2D[] array2D = new Punkt2D[100];
          Punkt3D[] array3D = new Punkt3D[100];

          
          
           for(int i=0; i<100; i++)
          {
              array2D[i] = new Punkt2D();
        
             
          }
           
             for(int i=0; i<100; i++)
          {
              array3D[i] = new Punkt3D();
           
          }
          
          for(int i=0; i<100; i++)
          {
              array2D[i].losuj();
           
             
          }

           for(int i=0; i<100; i++)
          {
              array3D[i].losuj();
             
          }

            for(int i=0; i<100; i++)
          {
              if(array2D[i].x == array3D[i].x && array2D[i].y == array3D[i].y)
                {
                  
                    System.out.println(array2D[i].toString());
                  System.out.println(array3D[i].toString());
                }
          }
        
    }
    
}
