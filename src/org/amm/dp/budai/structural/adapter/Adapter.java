package org.amm.dp.budai.structural.adapter;

//Адаптер
public class Adapter implements INewElectricitySystem {
	private final OldElectricitySystem _adaptee;

	public Adapter(OldElectricitySystem adaptee) {
		_adaptee = adaptee;
	}

	// А тут коїться вся магія
	// наш адаптер перекладає із того, що ми (код) не можемо використати наразі
	// у те що ми можемо
	public String MatchWideSocket() {
		return _adaptee.MatchThinSocket();
	}
}
