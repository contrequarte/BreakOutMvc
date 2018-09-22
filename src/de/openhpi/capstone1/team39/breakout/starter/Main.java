package de.openhpi.capstone1.team39.breakout.starter;

import java.util.Scanner;
import java.util.UUID;

import de.openhpi.capstone1.team39.breakout.controller.Controller;
import de.openhpi.capstone1.team39.breakout.model.Model;
import de.openhpi.capstone1.team39.breakout.view.View;

public class Main {
	public static void main(String[] args) {
		
		//System.out.println(UUID.randomUUID().toString());
		
		Model model = new Model(1200, 800);
		
		View view = new View(model);
		
		Controller controller = new Controller(view);
		
		view.updateScreen();
		/*
		enterSomeThingToProceed();
		model.updateTimerMove(new Object());
        view.updateScreen();
		*/
	}
	private static void enterSomeThingToProceed() {
		System.out.println("Enter someting finished by pressing return key!");
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		//	System.out.println(a);

		sc.close();
	}
}
