//package lyttpc05561.service;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import lyttpc05561.Repository.CommuneRepository;
//import lyttpc05561.Repository.DistrictRepository;
//import lyttpc05561.Repository.ProvinceRepository;
//import lyttpc05561.entity.Commune;
//import lyttpc05561.entity.District;
//import lyttpc05561.entity.Province;
//
//@Service
//public class LocationService {
//	@Autowired
//	private ProvinceRepository provinceRepository;
//
//	@Autowired
//	private DistrictRepository districtRepository;
//
//	@Autowired
//	private CommuneRepository communeRepository;
//
//	public List<Province> getAllProvinces() {
//		return provinceRepository.findAll();
//	}
//
//	public List<District> getDistrictsByProvinceId(Integer provinceId) {
//		return districtRepository.findByProvinceId(provinceId);
//	}
//
//	public List<Commune> getCommunesByDistrictId(Integer districtId) {
//		return communeRepository.findByDistrictId(districtId);
//	}
//}
