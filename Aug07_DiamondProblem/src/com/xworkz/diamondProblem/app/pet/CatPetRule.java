package com.xworkz.diamondProblem.app.pet;

public interface CatPetRule extends PetRule{
	
	void getSleep();
	
	
	@Override
	default void getBath() {
		System.out.println("Giving Bath to pet in Cat Pet Rule");
	}

}
