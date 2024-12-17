package org.NAK.eBanking.Mapper;

import org.NAK.eBanking.DTO.User.UserDTO;
import org.NAK.eBanking.Entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(uses = RoleMapper.class)
public interface UserMapper {

    @Mapping(target = "password", ignore = true)
    UserDTO toDto(User user);

    User toEntity(UserDTO userDto);
}
