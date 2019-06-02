# Play-Akka
<h3>Contains Akka toolkit for Creating Acotor,ActorStsrem,ActorRef and Props,
Akka cluser with remoting,
  Play and akka remote integration.</h3>

<h4>Run Akka remote app<h4>
      <ul>
         <li>Import "akka-cluster-calculator-remote-service" project into workspace, it's a maven project</li>
         <li>mvn ecliple:eclipse</li>
         <li>Run the main class i.e. CalculatorApplication.java</li>
         <li>You remote actor will be upon running based on the configuration in application.conf file under resource folder.</li>
      </ul>

<h4>Run Play Client app<h4>
  <ul>
    <li>Import "play-akka-calculator-client-app" project into workspace , it's a sbt project</li>
    <li>Make sure that you have sbt installed in your machine.</li>
    <li>Do a sbt clean, sbt compile, then sbt run</li>
    <li>Import "play-akka-calculator-client-app" project into workspace , it's a sbt project</li>
  </ul>
  
URL to test -> http://localhost:9000/add/15/21

