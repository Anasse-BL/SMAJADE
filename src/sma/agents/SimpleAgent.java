package sma.agents;
import jade.core.Agent;
import jade.core.behaviours.Behaviour;
import jade.core.behaviours.CyclicBehaviour;
import jade.core.behaviours.OneShotBehaviour;
public class SimpleAgent extends Agent {
	@Override
	protected void setup() {
		addBehaviour(new OneShotBehaviour(this){
			public void action(){
			System.out.println("Bonjour tous le monde je suis l'agent "+getLocalName());}});			
			addBehaviour(new CyclicBehaviour(this) {
			public void action() {
			System.out.println("cyclique... ");
			}
			});			
			addBehaviour(new RandomBehaviour());
			}			
			private class RandomBehaviour extends Behaviour {
			private int aleatoire ;
			public void action() {
			aleatoire = (int) (Math.random()*10);
			System.out.println("aleatoire ="+ aleatoire);
			}
			public boolean done() {
			return aleatoire == 7;
			}
			public int onEnd() {
			myAgent.doDelete();
			return super.onEnd();
			}
			}
			}
