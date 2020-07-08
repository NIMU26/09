
public class NeteruState extends DogState{

	private static NeteruState s = new NeteruState();
	private NeteruState() {}

	public static DogState getInstance() {
		return s;
	}

	//労働
	public void tukareta(Dog moto) {
	  moto.changeState(IrairaState.getInstance());
	}

	//食事
	public void tabeta(Dog moto) {
		  moto.changeState(TanoshiiState.getInstance());
	  }

	public String toString() {
		return "寝てる状態";
	}
}
