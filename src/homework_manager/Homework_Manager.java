/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework_manager;


/**
 *
 * @author doilhan
 */
public class Homework_Manager {
      

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Model model = new Model();
       ViewController viewcontroller = new ViewController(model);
       viewcontroller.setVisible(true);
      
       
    }
    
    
}
