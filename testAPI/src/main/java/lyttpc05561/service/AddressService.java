//package lyttpc05561.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//
//import org.springframework.stereotype.Service;
//
//import lyttpc05561.Repository.AddressRepository;
//import lyttpc05561.entity.Address;
//
//import java.util.List;
//
//@Service
//public class AddressService {
//	@Autowired
//	private AddressRepository addressRepository;
//
//	public List<Address> getAllAddresses() {
//		return addressRepository.findAll();
//	}
//
//	public List<Address> getAddressesByCommuneId(Integer communeId) {
//		return addressRepository.findByCommuneId(communeId);
//	}
//
//	public Address saveAddress(Address address) {
//		return addressRepository.save(address);
//	}
//
//	public void deleteAddress(Integer id) {
//		addressRepository.deleteById(id);
//	}
//}
