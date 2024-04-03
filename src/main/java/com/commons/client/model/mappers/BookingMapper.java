package com.commons.client.model.mappers;

import com.commons.client.model.Booking;
import com.commons.client.model.DTO.BookingDTO;
import com.commons.client.model.DTO.BookingResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BookingMapper {

    BookingMapper INSTANCE = Mappers.getMapper(BookingMapper.class);

    @Mapping(target = "id", ignore = true)
    Booking bookingDTOToBooking(BookingDTO bookingDTO);

    BookingResponse bookingToBookingResponse (Booking booking);


}
