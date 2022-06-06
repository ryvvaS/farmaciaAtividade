package br.com.ryvvas.farmacia.repository;

import br.com.ryvvas.farmacia.models.Medicamento;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MedicamentosRepository implements PanacheRepository<Medicamento> {
}
