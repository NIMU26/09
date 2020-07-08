
public class IrairaState extends DogState{

	private static IrairaState s = new IrairaState();
	private IrairaState() {}

	public static DogState getInstance() {
		return s;
	}

	//労働
	public void tukareta(Dog moto) {
		moto.changeState(NeteruState.getInstance());
	}

	//食事
	public void tabeta(Dog moto) {
		moto.changeState(TanoshiiState.getInstance());
	}

	public String toString() {
		return "いらいら状態";
	}

}
