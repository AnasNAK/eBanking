package org.NAK.eBanking.Service.Implementation;



import org.NAK.eBanking.Entity.Role;
import org.NAK.eBanking.Repository.RoleRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RoleService {

    private final RoleRepository roleRepository;

    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public Role createRoleIfNotFound(String name) {
        return roleRepository.findByName(name)
                .orElseGet(() -> roleRepository.save(new Role(name)));
    }

    public Optional<Role> findRoleByName(String name) {
        return roleRepository.findByName(name);
    }
}