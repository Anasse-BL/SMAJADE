package sma;
import jade.core.Profile;
import jade.core.ProfileImpl;
import jade.core.Runtime;
import jade.wrapper.AgentContainer;
import jade.wrapper.AgentController;
import jade.wrapper.ControllerException;
public class Container1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			try {
				Runtime runtime = Runtime.instance();
				Profile profile = new ProfileImpl(false);
				profile.setParameter(Profile.MAIN_HOST, "localhost");
				AgentContainer agentContainer = runtime.createAgentContainer(profile);
				AgentController agentController = agentContainer.
			    createNewAgent("Anasse", "sma.agents.SimpleAgent", new Object[] {});
				agentController.start();
			} catch (ControllerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}


