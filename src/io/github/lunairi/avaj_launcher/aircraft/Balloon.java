package io.github.lunairi.avaj_launcher.aircraft;

import io.github.lunairi.avaj_launcher.Coordinates;
import io.github.lunairi.avaj_launcher.WeatherTower;

public class Balloon extends Aircraft implements Flyable  {

	public Balloon(String name, Coordinates coordinates) {
		super (name, coordinates);
	}

	@Override
	public void updateConditions() {
		// TODO Auto-generated method stub
	}

	@Override
	public void registerTower(WeatherTower weatherTower) {
		// TODO Auto-generated method stub
	}

}