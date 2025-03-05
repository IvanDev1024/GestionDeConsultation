package ma.enset.gestiondeconsultation.web;

import ma.enset.gestiondeconsultation.entities.Patient;
import ma.enset.gestiondeconsultation.service.CabinetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CabinetController {
    private CabinetService cabinetService;

    public CabinetController(CabinetService cabinetService) {
        this.cabinetService = cabinetService;
    }

    @GetMapping("/patients")
    public String getPatient(){
        return "patients";
    }

    @GetMapping("/patients/new")
    public String getNewPatient(Model model){
        List<Patient> patients =cabinetService.getAllPatient();
        return "add_patient";
    }

}
