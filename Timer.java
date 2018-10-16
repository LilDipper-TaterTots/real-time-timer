import java.util.*;
public class Timer {

	public static void main(String[] args) throws InterruptedException {
		Scanner hello = new Scanner(System.in);
		System.out.print("What how long would you like to count to? (Hours Minutes Seconds) ");
		int hours3 = hello.nextInt();
		int minutes2 = hello.nextInt();
		int seconds1 = hello.nextInt();
		timer(hours3, minutes2, seconds1);

	}
	public static void timer(int h, int m, int s) throws InterruptedException {
		int timerSeconds = 86400;
		for(int i = 0; timerSeconds >= i; i++) {
			Thread.sleep(1000);
			int seconds = i % 60;
			int hours = i / 3600;
			int minutes = (i / 60) % 60;
			System.out.println(hours + ":" + minutes + ":" + seconds);
			String check = (hours + ":" + minutes + ":" + seconds);
			if(check.equals(h + ":" + m + ":" + s)) {
				break;
			}
		}
		
	}

}
