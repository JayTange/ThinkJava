package cp8;

import java.util.Random;

public class RandomShapeGenertor {

	private Random rand = new Random(47);
	public Shape next(){
		switch (rand.nextInt(3)) {
			case 0:return new Circle();
			case 1:return new Shape();
			case 2:return new Triangle();
		}
		return null;
	}
}
