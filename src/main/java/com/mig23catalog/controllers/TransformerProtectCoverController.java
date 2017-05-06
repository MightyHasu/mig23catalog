package com.mig23catalog.controllers;

import com.mig23catalog.entities.enums.transformerProtectCoverEnums.TransformerProtectCoverHeight;
import com.mig23catalog.entities.enums.transformerProtectCoverEnums.TransformerProtectCoverWidth;
import com.mig23catalog.entities.enums.transformerProtectCoverEnums.TransformerProtectiveCoverDepth;
import com.mig23catalog.models.bindingModels.AddTransformerProtectCoverBindingModel;
import com.mig23catalog.models.bindingModels.EditTransformerProtectCoverBindingModel;
import com.mig23catalog.models.viewModels.TransformerProtectCoverViewModel;
import com.mig23catalog.services.TransformerProtectCoverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/transformer-protect-covers")
public class TransformerProtectCoverController {

    @Autowired
    private TransformerProtectCoverService transformerProtectCoverService;

    @ModelAttribute("Height dimensions")
    public TransformerProtectCoverHeight[] getTransformerProtectCoverHeight(){
        return TransformerProtectCoverHeight.values();
    }

    @ModelAttribute("Width dimensions")
    public TransformerProtectCoverWidth[] getTransformerProtectCoverWidth(){
        return TransformerProtectCoverWidth.values();
    }

    @ModelAttribute("Depth dimensions")
    public TransformerProtectiveCoverDepth[] getTransforemerProtectCoverDepth() {
        return TransformerProtectiveCoverDepth.values();
    }

    @GetMapping("")
    public String getTransformerProtectCoverHomePage(Model model) {
        List<TransformerProtectCoverViewModel> transformerProtectCoverViewModels = this.transformerProtectCoverService.findAllTransformerProtectCovers();
        model.addAttribute("transformerProtectCoverViewModels", transformerProtectCoverViewModels);
        return "transformer-protect-covers";
    }

    @GetMapping("/add")
    public String getAddTransformerProtectCoverHomePage(@ModelAttribute AddTransformerProtectCoverBindingModel addTransformerProtectCoverBindingModel) {
        return "transformer-protect-covers-add";
    }

    @PostMapping("/add")
    public String addTPC(@Valid @ModelAttribute AddTransformerProtectCoverBindingModel addTransformerProtectCoverBindingModel, BindingResult bindingResult) {
        if(bindingResult.hasErrors()){
            return "transformer-protect-covers-add";
        }

        this.transformerProtectCoverService.save(addTransformerProtectCoverBindingModel);

        return "redirect:/transformer-protect-covers";
    }

    @GetMapping("/edit/{tpcId}")
    public String getEditTransformerProtectCover (@PathVariable long tpcId, Model model) {
        EditTransformerProtectCoverBindingModel editTransformerProtectCoverBindingModel = this.transformerProtectCoverService.findTransformerProtectCoverById(tpcId);
        model.addAttribute("editTransformerProtectCoverBindingModel", editTransformerProtectCoverBindingModel);
        return "transformer-protect-covers-edit";
    }

    @PostMapping("/edit/{tpcId}")
    public String getEditTransformerProtectCoverHomePage(@PathVariable long tpcId, @Valid @ModelAttribute EditTransformerProtectCoverBindingModel editTransformerProtectCoverBindingModel, BindingResult bindingResult) {
        if(bindingResult.hasErrors()){
            return "transformer-protect-covers-edit";
        }

        editTransformerProtectCoverBindingModel.setId(tpcId);
        this.transformerProtectCoverService.save(editTransformerProtectCoverBindingModel);
        return "redirect:/transformer-protect-covers";
    }

    @GetMapping("/delete/{tpcId}")
    public String deleteTransformerProtectCover(@PathVariable long tpcId, Model model) {
        this.transformerProtectCoverService.deleteById(tpcId);
        return "redirect:/transformer-protect-covers";
    }
}
