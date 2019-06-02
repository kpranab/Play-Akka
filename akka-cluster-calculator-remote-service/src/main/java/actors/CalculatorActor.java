/**
 * 
 */
package actors;

import akka.actor.AbstractActor;

/**
 * @author Pranab Kumar Sahoo
 *
 */
public class CalculatorActor extends AbstractActor {

	@Override
    public Receive createReceive() {
        return receiveBuilder()
                .match(Operation.Add.class, add -> {
                    System.out.println("Calculating " + add.getN1() + " + " + add.getN2());
                    Operation.AddResult result = new Operation.AddResult(add.getN1(), add.getN2(),
                            add.getN1() + add.getN2());
                    System.out.println("Add result : "+result.getResult());
                    sender().tell(result, self());
                })
                .match(Operation.Subtract.class, subtract -> {
                    System.out.println("Calculating " + subtract.getN1() + " - "
                            + subtract.getN2());
                    Operation.SubtractResult result = new Operation.SubtractResult(subtract.getN1(),
                            subtract.getN2(), subtract.getN1() - subtract.getN2());
                    System.out.println("Sub result : "+result.getResult());
                    sender().tell(result, self());
                })
                .match(Operation.Multiply.class, multiply -> {
                    System.out.println("Calculating " + multiply.getN1() + " * "
                            + multiply.getN2());
                    Operation.MultiplicationResult result = new Operation.MultiplicationResult(
                            multiply.getN1(), multiply.getN2(), multiply.getN1()
                            * multiply.getN2());
                    sender().tell(result, self());
                })
                .match(Operation.Divide.class, divide -> {
                    System.out.println("Calculating " + divide.getN1() + " / "
                            + divide.getN2());
                    Operation.DivisionResult result = new Operation.DivisionResult(divide.getN1(),
                            divide.getN2(), divide.getN1() / divide.getN2());
                    sender().tell(result, self());
                })
                .build();
    }

}
