package org.NAK.eBanking.Service.Contract;

import org.NAK.eBanking.DTO.User.UserDTO;

import java.util.List;

public interface UserService {
    UserDTO registerUser(UserDTO userDto);
    List<UserDTO> getAllUsers();
    UserDTO getUserByUsername(String username);
    void deleteUser(String username);
    UserDTO updateUserRole(String username, String newRoleName);
    UserDTO updateUserPassword(String username, String oldPassword, String newPassword);
}