/**
 * Unit 1 Project
 * 
 * In this project you have the opportunity to create a piece of artwork using ASCII 
 * (American Standard Code for Information Interchange). Using the already created file 
 * named `ASCIIArt.java` write a program that outputs your artwork to the console. 
 * The goal of this project is to use ONLY what we have learned in Unit 1 to create 
 * anything you would like so be creative (and school appropriate). Artwork must also have a caption describing what it's depicting.  
 * 
 * For those of you who have dabbled in coding before, try to contain your code to 
 * just what we have discussed in this unit.  
 * 
 * @author Mr. Rasmussen 
 *
 */


public class ASCIIArt {
	public static void main(String []arg) {
		escapeP();
		topP();
		bodyP();
		bootP();
		fireP();
	}
		
	public static void pin1() {
		System.out.println("\t\t\t\t     ||");
	}
	
	public static void pin2() {
		System.out.println("\t\t\t\t    |  |");
	}
	
	public static void body1() {
		System.out.println("\t\t\t      |              |");
	}
	
	public static void body2() {
		System.out.println("\t\t\t       |            |");
	}
	
	public static void body3() {
		System.out.println("\t\t\t       | ||     |   |");
		System.out.println("\t\t\t       | ||      |  |");
	}
	
	public static void body4() {
		System.out.println("\t\t\t       | ||         |");
	}
	
	public static void body5() {
		System.out.println("\t\t\t       | ||  __     |");
//		System.out.println("\t\t\t       | || |  |    |");
		System.out.println("\t\t\t       | || |__|    |");
	}
	
	public static void body6() {
		System.out.println("\t\t\t       |     __     |");
//		System.out.println("\t\t\t       |    |  |    |");
		System.out.println("\t\t\t       |    |__|    |");
	}
	
	public static void boot() {
		System.out.println("\t\t\t | |     |        |     | |");
		System.out.println("\t\t\t |  |    |        |    |  |");
	}
	
	public static void escapeP() {
		System.out.println("\t\t\t\t     /\\");
		pin1();
		pin1();
		pin1();
		pin1();
		System.out.println("\t\t\t\t     /\\");
		System.out.println("\t\t\t\t    /  \\");
		System.out.println("\t\t\t\t    \\/\\/");
		pin1();
		pin1();
		pin1();
		pin1();
		System.out.println("\t\t\t\t     /\\");
		System.out.println("\t\t\t\t    /  \\");
		System.out.println("\t\t\t\t  _/    \\_");
		System.out.println("\t\t\t\t /  _/\\_  \\");
		System.out.println("\t\t\t\t \\_/|  |\\_/");
		pin2();
		pin2();
		pin2();
		pin2();
		pin2();
	}
	
	public static void topP() {

		System.out.println("\t\t\t\t    |__|");
		System.out.println("\t\t\t\t    /  \\");
		System.out.println("\t\t\t\t   /    \\");
		System.out.println("\t\t\t\t  /      \\");
		System.out.println("\t\t\t\t /        \\");
		System.out.println("\t\t\t\t/          \\");
		System.out.println("\t\t\t       /            \\");
		System.out.println("\t\t\t      /______________\\");
		System.out.println("\t\t\t      \\______________/");
		body1();
		body1();
		body1();
		body1();
		System.out.println("\t\t\t     /|   ________   |\\");
		System.out.println("\t\t\t     ||  |hello   |  ||");
		System.out.println("\t\t\t     ||  |   world|  ||");
		System.out.println("\t\t\t     \\|  |________|  |/");
		body1();
		body1();
		body1();
		body1();
		System.out.println("\t\t\t      /______________\\");
		System.out.println("\t\t\t      \\              /");
		System.out.println("\t\t\t       \\____________/");
	}
	
	public static void bodyP() {
		body2();
		body2();
		System.out.println("\t\t\t       |____________|");
		body3();
		body3();
		body3();
		body3();
		System.out.println("\t\t\t       | ||     |   |");
		System.out.println("\t\t\t       |_||______|__|");
		System.out.println("\t\t\t       |_||_________|");
		body4();
		body4();
		body4();
		System.out.println("\t\t\t       | ||  /\\     |");
		System.out.println("\t\t\t       | || /__\\    |");
		body4();
		body4();
		body5();
		body4();
		body2();
		body6();
		body2();
		body2();
		body6();
		body4();
		body4();
		body5();
		body4();
		body4();
		body4();
		System.out.println("\t\t\t       |_||_________|");
		System.out.println("\t\t\t       |_||_________|");
		body4();
		body4();
		System.out.println("\t\t\t       | ||  C      |");
		body4();
		System.out.println("\t\t\t       | ||  Z      |");
		body4();
		System.out.println("\t\t\t       | ||  |      |");
		body4();
		System.out.println("\t\t\t       | ||  2      |");
		body4();
		System.out.println("\t\t\t       | ||  F      |");
		body4();
		body4();
		
	}
	
	public static void bootP() {
		System.out.println("\t\t\t     _ |            | _");
		System.out.println("\t\t\t    / \\|            |/ \\");
		System.out.println("\t\t\t   /   \\            /   \\");
		System.out.println("\t\t\t  /     \\          /     \\");
		System.out.println("\t\t\t /_______\\        /_______\\");
		System.out.println("\t\t\t \\_______/        \\_______/");
		boot();
		boot();
		boot();
		boot();
		boot();
		boot();
		System.out.println("\t\t\t | |     |        |     | |");
		System.out.println("\t\t\t/|  |    |        |    |  |\\");
		System.out.println("\t\t       / | |     |        |     | | \\");
		System.out.println("\t\t      /  |  |    |        |    |  |  \\");
		System.out.println("\t\t      |  | |     |        |     | |  |");
		System.out.println("\t\t      /__|  |    |        |    |  |__\\");
		System.out.println("\t\t      \\  |_|_____|        |_____|_|  /");
		System.out.println("\t\t       \\_/       \\        /       \\_/");
		System.out.println("\t\t\t \\_______/        \\_______/");
		System.out.println("\t\t\t   /___\\            /___\\");
		System.out.println("\t\t\t       \\____________/");
		System.out.println("\t\t\t        /___\\  /___\\");
	}
	
	public static void fireP() {
		System.out.println("\t\t\t    /\\                /\\");
		System.out.println("\t\t\t   //\\\\              //\\\\");
		System.out.println("\t\t\t   //\\\\  / \\    / \\  //\\\\");
		System.out.println("\t\t\t  //  \\\\// \\\\  // \\\\//  \\\\");
		System.out.println("\t\t\t  //  \\\\// \\\\  // \\\\//  \\\\");
		System.out.println("\t\t\t  //  \\\\/   \\\\//   \\//  \\\\");
		System.out.println("\t\t\t //    \\\\   \\\\//   //    \\\\");
		System.out.println("\t\t\t //    \\\\    \\/    //    \\\\");
		System.out.println("\t\t\t //    \\\\    \\/    //    \\\\");
		System.out.println("\t\t\t //    \\\\          //    \\\\");
		System.out.println("\t\t\t//      \\\\        //      \\\\");
		System.out.println("\t\t\t//      \\\\   /\\   //      \\\\");
		System.out.println("\t\t\t\\\\      //   /\\   \\\\      //");
		System.out.println("\t\t\t\\\\      //  //\\\\  \\\\      //");
		System.out.println("\t\t\t \\\\    //   //\\\\   \\\\    // ");
		System.out.println("\t\t\t \\\\    //   \\\\//   \\\\    //");
		System.out.println("\t\t\t \\\\    //   \\\\//   \\\\    //");
		System.out.println("\t\t\t \\\\    //    \\/    \\\\    //");
		System.out.println("\t\t\t  \\\\  //     \\/     \\\\  //");
		System.out.println("\t\t\t  \\\\  //\\          /\\\\  //");
		System.out.println("\t\t\t  \\\\  //\\\\        //\\\\  //");
		System.out.println("\t\t\t   \\\\// \\\\        // \\\\//");
		System.out.println("\t\t\t   \\\\//  \\\\      //  \\\\//");
		System.out.println("\t\t\t   \\\\//  \\\\      //  \\\\//");
		System.out.println("\t\t\t    \\/    \\\\    //    \\/");
		System.out.println("\t\t\t    \\/    \\\\    //    \\/");
		System.out.println("\t\t\t    \\/     \\\\  //     \\/");
		System.out.println("\t\t\t    \\/     \\\\  //     \\/");
		System.out.println("\t\t\t    \\/     \\\\  //     \\/");
		System.out.println("\t\t\t            \\\\//");
		System.out.println("\t\t\t            \\\\//");
		System.out.println("\t\t\t            \\\\//");
		System.out.println("\t\t\t\t     \\/");
		System.out.println("\t\t\t\t     \\/");
		System.out.println("\t\t\t\t     \\/");
		System.out.println("\t\t\t\t     \\/");
		System.out.println("\t\t\t\t     \\/");
		System.out.println("\t\t\t\t     \\/");
	}
		
}