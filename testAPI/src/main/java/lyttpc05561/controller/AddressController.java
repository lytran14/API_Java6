package lyttpc05561.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import lyttpc05561.Repository.AddressRepository;
import lyttpc05561.entity.Address;


import java.util.List;

@Controller
@RequestMapping("/api/addresses")
public class AddressController {
	@Autowired
	AddressRepository addressRepository;

	@GetMapping("/list")
	public String api() {
		return "index";
	}
	@GetMapping("/update")
	public String update() {
		return "index";
	}
	 @PostMapping("/post")
	    public String post(@RequestParam("provinceId") int provinceId,
	                       @RequestParam("communeId") int communeId,
	                       @RequestParam("street") String street,
	                       @RequestParam("districtId") int districtId,
	                       Model model) {
	        Address address = new Address();
	        address.setStreet(street);
	        address.setCommune_id(communeId);
	        address.setDistrict_id(districtId);
	        address.setProvince_id(provinceId);
	        
	        addressRepository.saveAndFlush(address);
	        return "index"; // hoặc trả về view bạn muốn hiển thị sau khi thêm địa chỉ thành công
	    }
//    @GetMapping
//    public List<Address> getAllAddresses() {
//        return addressService.getAllAddresses();
//    }
//
//    @GetMapping("/commune/{communeId}")
//    public List<Address> getAddressesByCommuneId(@PathVariable Integer communeId) {
//        return addressService.getAddressesByCommuneId(communeId);
//    }
//
//    @PostMapping
//    public ResponseEntity<Address> createAddress(@RequestBody Address address) {
//        Address savedAddress = addressService.saveAddress(address);
//        return ResponseEntity.ok(savedAddress);
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> deleteAddress(@PathVariable Integer id) {
//        addressService.deleteAddress(id);
//        return ResponseEntity.noContent().build();
//    }
}
