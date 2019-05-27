package com.akka.java.actor;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;

public class AkkaMain {

	public static void main(String[] args) {
		final ActorSystem system = ActorSystem.create("akkabootActor");
		final ActorRef akkaBoot = system.actorOf(Props.create(AkkaBootActor.class), "akkaBoot");
		
		akkaBoot.tell(new AkkaBootActor.Move(AkkaBootActor.Direction.FORWARD), ActorRef.noSender());
		
		akkaBoot.tell(new AkkaBootActor.Move(AkkaBootActor.Direction.BACKWORD), ActorRef.noSender());
		
		akkaBoot.tell(new AkkaBootActor.Stop(), ActorRef.noSender());
		
		akkaBoot.tell(new AkkaBootActor.Move(AkkaBootActor.Direction.FORWARD), getSelf());
		
		system.terminate();
	}
}
//mvn compile exec:exec