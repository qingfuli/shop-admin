package shopadmin.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import shopadmin.controller.form.SearchCondition;
import shopadmin.model.Cellphone;
import shopadmin.model.Operator;
import shopadmin.service.OperatorService;

@Controller
public class OperatorController {
	private OperatorService operatorService;

	@Autowired
	public OperatorController(OperatorService operatorService) {
		this.operatorService = operatorService;
	}
	
	@RequestMapping(method = RequestMethod.GET,value = "/operators/")
	public String list(Model model){
		List<Operator> operators = operatorService.findAll();
		model.addAttribute("operators", operators);
		return "operator-list";
	}
	
	@RequestMapping(method = RequestMethod.GET,value = "/operators/add")
	public String add(@ModelAttribute Operator operator){
		return "operator-edit";
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "/operators/add")
	public String create(@ModelAttribute @Valid Operator operator, 
						BindingResult bindingResult,
						Model model){
		if(bindingResult.hasErrors()){
			return "operator-edit";
		}
		
		operatorService.create(operator);
		return "redirect:/operators/";
	}
}
