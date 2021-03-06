/**
 * @author Quentin Aoustin
 * @version 1.0
 */
package main;

import contract.ControllerOrder;
import controller.Controller;
import model.Model;
import view.View;

/**
 * The Class Main.
 *
 * @author Quentin AOUSTIN
 */
public class Main {

    /**
     * The main method.
     *
     * @param args
     *            the arguments
     */
    public static void main(final String[] args) {
        final Model model = new Model();
        final View view = new View(model);
        final Controller controller = new Controller(view, model);
        view.setController(controller);

        controller.control();
        controller.orderPerform(ControllerOrder.notTheRightKey);
    }
}
//
//  _______  __  ____    ____  _______     __    __       _______.        ___      .__   __.         ___      
// /  _____||  | \   \  /   / |   ____|   |  |  |  |     /       |       /   \     |  \ |  |        /   \     
//|  |  __  |  |  \   \/   /  |  |__      |  |  |  |    |   (----`      /  ^  \    |   \|  |       /  ^  \    
//|  | |_ | |  |   \      /   |   __|     |  |  |  |     \   \         /  /_\  \   |  . `  |      /  /_\  \   
//|  |__| | |  |    \    /    |  |____    |  `--'  | .----)   |       /  _____  \  |  |\   |     /  _____  \  
// \______| |__|     \__/     |_______|    \______/  |_______/       /__/     \__\ |__| \__|    /__/     \__\ 
//                                                                                                          

