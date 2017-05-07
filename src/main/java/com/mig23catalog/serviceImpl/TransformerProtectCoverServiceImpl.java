package com.mig23catalog.serviceImpl;

import com.mig23catalog.entities.transformerProtectCover.TransformerProtectCover;
import com.mig23catalog.models.bindingModels.AddTransformerProtectCoverBindingModel;
import com.mig23catalog.models.bindingModels.EditTransformerProtectCoverBindingModel;
import com.mig23catalog.models.viewModels.TransformerProtectCoverViewModel;
import com.mig23catalog.repositories.TransformerProtectCoverRepository;
import com.mig23catalog.services.TransformerProtectCoverService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service
public class TransformerProtectCoverServiceImpl implements TransformerProtectCoverService {

    @Autowired
    private TransformerProtectCoverRepository transformerProtectCoverRepository;

    private final ModelMapper mapper;

    @Autowired
    public TransformerProtectCoverServiceImpl() {
        this.mapper = new ModelMapper();
    }

    @Override
    public void save(AddTransformerProtectCoverBindingModel addTransformerProtectCoverBindingModel) {
        TransformerProtectCover transformerProtectCover = this.mapper.map(addTransformerProtectCoverBindingModel, TransformerProtectCover.class);
        this.transformerProtectCoverRepository.save(transformerProtectCover);
    }

    @Override
    public void save(EditTransformerProtectCoverBindingModel editTransformerProtectCoverBindingModel) {
        TransformerProtectCover transformerProtectCover = this.mapper.map(editTransformerProtectCoverBindingModel, TransformerProtectCover.class);
        this.transformerProtectCoverRepository.save(transformerProtectCover);
    }

    @Override
    public List<TransformerProtectCoverViewModel> findAllTransformerProtectCovers() {
        List<TransformerProtectCoverViewModel> transformerProtectCoverViewModels = new ArrayList<>();
        Set<TransformerProtectCover> transformerProtectCovers = this.transformerProtectCoverRepository.findAll();
        for (TransformerProtectCover transformerProtectCover : transformerProtectCovers) {
            TransformerProtectCoverViewModel transformerProtectCoverViewModel = this.mapper.map(transformerProtectCover, TransformerProtectCoverViewModel.class);
            transformerProtectCoverViewModels.add(transformerProtectCoverViewModel);
        }
        return transformerProtectCoverViewModels;
    }

    @Override
    public EditTransformerProtectCoverBindingModel findTransformerProtectCoverById(long id) {
        return this.mapper.map(this.transformerProtectCoverRepository.findById(id), EditTransformerProtectCoverBindingModel.class);
    }

    @Override
    public void deleteById(long id) {
        this.transformerProtectCoverRepository.delete(id);
    }

    @Override
    public TransformerProtectCoverViewModel findById(long id) {
        return this.mapper.map(this.transformerProtectCoverRepository.findById(id), TransformerProtectCoverViewModel.class);
    }
}
