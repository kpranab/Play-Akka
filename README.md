# Play-Akka
Contains Akka toolkit for Creating Acotor,ActorStsrem,ActorRef and Props,
Akka cluser with remoting,
Play and akka integration

Run Akka remote app
  . Import "akka-cluster-calculator-remote-service" project into workspace, it's a maven project
  . mvn ecliple:eclipse
  . Run the main class i.e. CalculatorApplication.java
  . You remote actor will be upon running based on the configuration in application.conf file under resource folder.
  
Run Play Client app
  . Import "play-akka-calculator-client-app" project into workspace , it's a sbt project
  . Make sure that you have sbt installed in your machine.
  . Do a sbt clean, sbt compile, then sbt run
  . Then your play system ready to consume.

URL to test -> http://localhost:9000/add/15/21

