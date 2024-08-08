//package lyttpc05561.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//
//import lyttpc05561.entity.Commune;
//import lyttpc05561.entity.District;
//import lyttpc05561.entity.Province;
//import lyttpc05561.service.LocationService;
//
//import java.util.List;
//
//@Controller
//@RequestMapping("/locations")
//public class LocationController {
//    @Autowired
//    private LocationService locationService;
//
//    @GetMapping
//    public String getAllProvinces(Model model) {
//        List<Province> provinces = locationService.getAllProvinces();
//        model.addAttribute("provinces", provinces);
//        return "locations";
//    }
//
//    @GetMapping("/provinces/{provinceId}/districts")
//    public ResponseEntity<List<District>> getDistrictsByProvinceId(@PathVariable Integer provinceId) {
//        List<District> districts = locationService.getDistrictsByProvinceId(provinceId);
//        return ResponseEntity.ok(districts);
//    }
//
//    @GetMapping("/districts/{districtId}/communes")
//    public ResponseEntity<List<Commune>> getCommunesByDistrictId(@PathVariable Integer districtId) {
//        List<Commune> communes = locationService.getCommunesByDistrictId(districtId);
//        return ResponseEntity.ok(communes);
//    }
//}
