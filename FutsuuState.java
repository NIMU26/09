
public class FutsuuState extends DogState{

  private static FutsuuState s = new FutsuuState();
  private FutsuuState() {}

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
	  return "普通状態";
  }
}
