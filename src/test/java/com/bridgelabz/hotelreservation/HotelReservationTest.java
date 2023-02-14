package com.bridgelabz.hotelreservation;
import org.junit.Assert;
import org.junit.Test;
public class HotelReservationTest {
    @Test
    public void givendetailsOf3Hotels_WhenAddedToHotelList_SizeOfListIs3() {

        HotelReservation.addHotel("Lakewood", 110);
        HotelReservation.addHotel("Bridge wood", 160);
        HotelReservation.addHotel("Ridge wood", 220);
        Assert.assertEquals(3, HotelReservation.countNoOfHotels());
    }
}
