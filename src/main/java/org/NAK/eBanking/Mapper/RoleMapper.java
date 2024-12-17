package org.NAK.eBanking.Mapper;


import org.NAK.eBanking.DTO.Role.RoleDTO;
import org.NAK.eBanking.Entity.Role;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RoleMapper {

    RoleDTO toDto(Role role);

    Role toEntity(RoleDTO roleDto);
}
