package SingletonFactory;

public class SingletonfactoryTest {
	public static void main(String[] args) {
		BarProducer t1 = new BarProducer(111);
		BarProducer t2 = new BarProducer(2);
                BarProducer t3 = new BarProducer(3);
		t1.start();
		t2.start();
//                t1.interrupt();
//		t2.interrupt();
                t3.start();
	}
}
