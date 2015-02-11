package org.mbrdi.helpinghand.model;

public enum EventType {

	WISH("WISH"), BLOOD_DONATION("BLOOD_DONATION"), PLEDGING_DONATION(
			"PLEDGING_DONATION"), CAREER_COUNSELLING("CAREER_COUNSELLING"), MATERIAL_COLLECTION(
			"MATERIAL_COLLECTION"), BECOME_A_VOLUNTEER("BECOME_A_VOLUNTEER"),NEED_OF_BLOOD("NEED_OF_BLOOD");

	private final String type;

	EventType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

}
