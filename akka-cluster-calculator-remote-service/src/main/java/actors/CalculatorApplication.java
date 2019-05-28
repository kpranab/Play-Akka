/**
 * 
 */
package actors;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

import akka.actor.ActorSystem;
import akka.actor.Props;

/**
 * @author Pranab Kumar Sahoo
 *
 */
public class CalculatorApplication {
	
	public static void main(String[] args) {
        Config config = ConfigFactory.defaultApplication();
        final ActorSystem system = ActorSystem.create("CalculatorSystem", config);
        system.actorOf(Props.create(CalculatorActor.class), "calculator");
        System.out.println("Started CalculatorSystem");
    }

}
