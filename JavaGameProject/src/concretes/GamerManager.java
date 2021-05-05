package concretes;

import abstracts.GamerService;
import entities.Gamer;

public class GamerManager implements GamerService {

	@Override
	public void add(Gamer gamer) {
		System.out.println("Tebrikler " + gamer.getName() + " sistemimize baþarýyla kayýt oldunuz!");
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Tebrikler " + gamer.getName() + " sistemimizdeki bilgilerin baþarýyla güncellendi!");
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Tebrikler " + gamer.getName() + " sistemimizdeki hesabýnýz baþarýyla silindi!");
		
	}

}
