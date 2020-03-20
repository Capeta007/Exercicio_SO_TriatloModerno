package view;

import java.util.concurrent.Semaphore;

import controller.ThreadAtleta;

public class Circuito {
    
	public static void main(String[] args) {
		
		Semaphore semaPistola = new Semaphore(5);
		Semaphore semaColocacao = new Semaphore(1);

		
		for (int i = 1; i <= 25; i++) {
			Thread atleta = new ThreadAtleta(i, semaColocacao, semaPistola);
			atleta.start();
		}
		
	}

}
