package ro.ase.csie.cts.g1098.design.patterns.main;

import ro.ase.csie.cts.g1098.design.patterns.models.SuperPower;
import ro.ase.csie.cts.g1098.design.patterns.models.Superhero;

public class Main {
	public static void main(String[] args) {
		
		Superhero superman = new Superhero.SuperheroBuilder("Superman","supermand.3d")
				.setPositive()
				.setLifePoints(1000)
				.setSuperpower(SuperPower.LASER_EYES).build();
	}
}
