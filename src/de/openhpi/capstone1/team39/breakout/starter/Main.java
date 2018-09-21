package de.openhpi.capstone1.team39.breakout.starter;

import java.util.UUID;

import de.openhpi.capstone1.team39.breakout.model.Model;
import de.openhpi.capstone1.team39.breakout.view.View;

public class Main {
	public static void main(String[] args) {
		
		System.out.println(UUID.randomUUID().toString());
		
		Model model = new Model(1200, 800);
		
		View view = new View(model);
		
		view.UpdateScreen();
	}
}
