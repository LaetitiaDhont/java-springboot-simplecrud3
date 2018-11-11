package co.simplon.springboot.simplecrud3.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import co.simplon.springboot.simplecrud3.model.Etudiant;

@Controller
public class EtudiantController {

	private static List<Etudiant> etudiants = new ArrayList<Etudiant>();

	static {
		etudiants.add(new Etudiant(1, "Dhont", "Laetitia", "21 rue du docteur Leray", "laetis", "36"));
	}

	@RequestMapping(value = { "/studentList" }, method = RequestMethod.GET)
	public String viewStudentList(Model model) {

		model.addAttribute("etudiants", etudiants);

		return "studentList";
	}

}
