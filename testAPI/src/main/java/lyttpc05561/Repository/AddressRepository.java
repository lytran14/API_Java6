package lyttpc05561.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import lyttpc05561.entity.Address;

import java.util.List;

public interface AddressRepository extends JpaRepository<Address, Integer> {
//    List<Address> findByCommuneId(Integer communeId);
}

