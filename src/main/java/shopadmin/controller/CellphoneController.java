package shopadmin.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import shopadmin.controller.form.CellphoneForm;
import shopadmin.controller.form.SearchCondition;
import shopadmin.model.Cellphone;
import shopadmin.service.CellphoneService;

@Controller
public class CellphoneController {
	private CellphoneService cellphoneService;

	@Autowired
	public CellphoneController(CellphoneService cellphoneService) {
		this.cellphoneService = cellphoneService;
	}
	
	@RequestMapping(method = RequestMethod.GET,value = "/cellphones/")
	public String list(@ModelAttribute SearchCondition searchCondition,Model model){
		List<Cellphone> cellphones = cellphoneService.findAll();
		model.addAttribute("cellphones", cellphones);
		return "cellphone-list";
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/cellphones/add")
	public String add(@ModelAttribute CellphoneForm cellphoneForm){
		
		return "cellphone-edit";
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/cellphones/add")
	public String create(@ModelAttribute @Valid CellphoneForm cellphoneForm,
						BindingResult bindingResult){
		if(bindingResult.hasErrors()){
			return "cellphone-edit";
		}
		
		cellphoneService.create(cellphoneForm.toCellphone());
		return "redirect:/cellphones/";
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/cellphones/{id}/edit")
	public String edit(@PathVariable Long id,Model model){
		Cellphone cellphone = cellphoneService.findOne(id);
		CellphoneForm cellphoneForm = CellphoneForm.fromCellphone(cellphone);
		model.addAttribute("cellphoneForm", cellphoneForm);
		return "cellphone-edit";
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/cellphones/{id}/edit")
	public String update(@ModelAttribute @Valid CellphoneForm cellphoneForm,
						BindingResult bindingResult){
		if(bindingResult.hasErrors()){
			return "cellphone-edit";
		}
		
		cellphoneService.update(cellphoneForm.toCellphone());
		return "redirect:/cellphones/";
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/cellphones/{id}/delete")
	public String delete(@PathVariable Long id){
		cellphoneService.delete(id);
		return "redirect:/cellphones/";
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/cellphones/search")
	public String search(@ModelAttribute SearchCondition searchCondition,Model model){
		List<Cellphone> cellphones = cellphoneService.search(
				searchCondition.getBrand(),
				searchCondition.getOs(),
				searchCondition.getRamMin(),
				searchCondition.getRamMax());
		model.addAttribute("cellphones", cellphones);
		return "cellphone-list";
	}
	
}
