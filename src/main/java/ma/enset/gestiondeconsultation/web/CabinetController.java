package ma.enset.gestiondeconsultation.web;

import jakarta.websocket.server.PathParam;
import ma.enset.gestiondeconsultation.entities.Patient;
import ma.enset.gestiondeconsultation.service.CabinetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class CabinetController {
    private CabinetService cabinetService;

    public CabinetController(CabinetService cabinetService) {
        this.cabinetService = cabinetService;
    }

    @GetMapping("/patients")
    public String getPatient(Model model){
        List<Patient> patients =cabinetService.getAllPatient();
        model.addAttribute("patients", patients);
        return "patients";
    }

    @GetMapping("/patients/new")
    public String newPatient(Model model){
        Patient patient = new Patient();
        model.addAttribute("patient",patient);
        return "add_patient";
    }

    @PostMapping("/patients")
    public String savePatient(@ModelAttribute Patient patient){
        cabinetService.savePatient(patient);
        return "redirect:/patients";
    }

    @GetMapping("/patients/delete/{id}")
    public String deletePatient(@PathVariable("id") Long id){
        cabinetService.deletePatientById(id);
        return  "redirect:/patients";
    }

    @GetMapping("/patient/edit/{id}")
    public String editPatient(Model model, @PathVariable("id") Long id){
        Patient patient=cabinetService.getPatientById(id);
        model.addAttribute("patient",patient);
        return "edit_patient";
    }
}
