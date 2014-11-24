package RPG;

import java.io.IOException;
import java.util.Scanner;

/*
 * args[0] - path
 * args[1] - name 1
 */
public class RPGTest {
		GameController game = new GameController();
		Character c = game.getCharacter(args[0], args[1]);
		System.out.println(c.name());
		
	}
		

}