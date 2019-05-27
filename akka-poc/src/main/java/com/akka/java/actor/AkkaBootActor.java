package com.akka.java.actor;

import java.util.Optional;

import akka.actor.AbstractActor;

/**
 * @author Pranab Kumar Sahoo
 *
 */
public class AkkaBootActor extends AbstractActor {

	private Optional<Direction> direction = Optional.empty();
	private boolean moving = false;
	
	@Override
	public Receive createReceive() {
		return receiveBuilder()
				.match(Move.class, this::onMove)
				.match(Stop.class, this::onStop)
				.build();
	}
	
	private void onMove(Move move){
		moving = true;
		direction = Optional.of(move.direction);
		System.out.println("I am moving "+direction.get());
	}
	
	private void onStop(Stop stop){
		moving = false;
		System.out.println("I stopped moving");
	}
	
	
	//Inner classes

	public enum Direction {
		FORWARD, BACKWORD, LEFT, RIGHT
	};
	
	public static class Move {
		public final Direction direction;

		public Move(Direction direction) {
			this.direction = direction;
		}
	}
	public static class Stop{
		
	}
	public static class GetRebootState{
		
	}
	public static class RebootState{
		public final Direction direction;
		public final boolean moving;
		public RebootState(Direction direction, boolean moving) {
			this.direction = direction;
			this.moving = moving;
		}
		
	}

}
