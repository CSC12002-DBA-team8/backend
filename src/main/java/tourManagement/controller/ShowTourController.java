package tourManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tourManagement.model.apis.ResponseObject;
import tourManagement.model.apis.showTour.RequestShowTour;
import tourManagement.service.ShowTourService;

@RestController
@CrossOrigin
public class ShowTourController {
    @Autowired
    ShowTourService showTourService;

    @PostMapping ("/api/showTour")
    public ResponseEntity<ResponseObject> showTour(@RequestBody RequestShowTour req) {
        ResponseObject res = showTourService.showTour(req);
        return ResponseEntity.status(res.getStatus()).body(res);
    }
}
