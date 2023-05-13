package com.co.tiendas.indy.ccolombia.services;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.co.tiendas.indy.ccolombia.model.ComponenteModel;
import com.co.tiendas.indy.ccolombia.persisten.ComponentePersisten;

@Service
public class ComponenteServiceimpl implements ComponenteService {

	@Autowired
	private ComponentePersisten componentepersisten;

	@Override
	public List<ComponenteModel> fetchComponenteList() {
		// TODO Auto-generated method stub
		return (List<ComponenteModel>) componentepersisten.findAll();
	}

	@Override
	public ComponenteModel saveComponente(ComponenteModel componentemodel) {
		// TODO Auto-generated method stub
		return componentepersisten.save(componentemodel);
	}

	@Override
	public ComponenteModel updateComponente(ComponenteModel componentemodel, Long componenteId) {
		// TODO Auto-generated method stub
		ComponenteModel componente = componentepersisten.findById(componenteId).get();
		if (Objects.nonNull(componente.getNombre()) && !"".equalsIgnoreCase(componente.getNombre())) {
			componente.setNombre(componentemodel.getNombre());
		}if (Objects.nonNull(componente.getRutaImg()) && !"".equalsIgnoreCase(componente.getRutaImg())) {
			componente.setRutaImg(componentemodel.getRutaImg());
		}if (Objects.nonNull(componente.getTexto())) {
			componente.setTexto(componentemodel.getTexto());
		}
		return componentepersisten.save(componente);
	}

	@Override
	public void deleteComponenteById(Long componenteId) {
		// TODO Auto-generated method stub
		componentepersisten.deleteById(componenteId);

	}

}
