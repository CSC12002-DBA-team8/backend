package tourManagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import tourManagement.model.apis.ResponseObject;
import tourManagement.model.apis.showTour.RequestShowTour;
import tourManagement.model.entityFromDB.Tour;
import tourManagement.repository.TourRepository;

@Service
@Component
public class ShowTourService {
    @Autowired
    TourRepository tourRepository;

    public ResponseObject showTour(RequestShowTour req) {
        Tour tour = tourRepository.getTourInformation(req.getMaTour()).get(0);
        return new ResponseObject(HttpStatus.OK, "Success", tour);
    }
}
