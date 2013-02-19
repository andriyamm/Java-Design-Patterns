package org.amm.dp.budai.structural.fasade;

public class SkiResortFacade {
	
	private SkiRent skiRent = new SkiRent();
	private SkiResortTicketSystem skiResortTicketSystem = new SkiResortTicketSystem();
	private HotelBookingSystem hotelBookingSystem = new HotelBookingSystem();

	public int HaveGoodRest(int height, int weight, int feetSize,
			int skierLevel, int roomQuality) {
		int skiPrice = skiRent.RentSki(weight, skierLevel);
		int skiBootsPrice = skiRent.RentBoots(feetSize, skierLevel);
		int polePrice = skiRent.RentPole(height);
		int oneDayTicketPrice = skiResortTicketSystem.BuyOneDayTicket();
		int hotelPrice = hotelBookingSystem.BookRoom(roomQuality);

		return skiPrice + skiBootsPrice + polePrice + oneDayTicketPrice
				+ hotelPrice;
	}

	public int HaveRestWithOwnSkis() {
		int oneDayTicketPrice = skiResortTicketSystem.BuyOneDayTicket();
		return oneDayTicketPrice;
	}
}