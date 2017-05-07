package com.mig23catalog.services;

import com.mig23catalog.models.bindingModels.AddTransformerProtectCoverBindingModel;
import com.mig23catalog.models.bindingModels.EditTransformerProtectCoverBindingModel;
import com.mig23catalog.models.viewModels.TransformerProtectCoverViewModel;

import java.util.List;

public interface TransformerProtectCoverService {
    void save(AddTransformerProtectCoverBindingModel addTransformerProtectCoverBindingModel);

    void save(EditTransformerProtectCoverBindingModel editTransformerProtectCoverBindingModel);

    List<TransformerProtectCoverViewModel> findAllTransformerProtectCovers();

    EditTransformerProtectCoverBindingModel findTransformerProtectCoverById(long id);

    void deleteById(long id);

    TransformerProtectCoverViewModel findById(long id);
}
