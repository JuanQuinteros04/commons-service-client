package com.commons.client.model.mappers;

import com.commons.client.model.Client;
import com.commons.client.model.DTO.ClientDTO;
import com.commons.client.model.DTO.ClientResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ClientMapper {

    ClientMapper INSTANCE = Mappers.getMapper(ClientMapper.class);

    @Mapping(target = "id", ignore = true)
//    @Mapping(target = "bookings", ignore = true)
    Client clientDTOToClient(ClientDTO clientDTO);

    ClientResponse clientToClientResponse(Client client);

    Client clientResponseToClient(ClientResponse clientResponse);
}
