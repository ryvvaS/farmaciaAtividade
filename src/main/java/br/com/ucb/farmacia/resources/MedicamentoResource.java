package br.com.ryvvas.farmacia.resources;

import br.com.ryvvas.farmacia.models.Medicamento;
import br.com.ryvvas.farmacia.repository.MedicamentosRepository;
import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/medicamentos")
public class MedicamentoResource {

    @Inject
    MedicamentosRepository repositorio;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Medicamento> buscarPessoas() {
        return repositorio.listAll();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Transactional
    public void addMedicamento(@RequestBody Medicamento dto) {
        Medicamento medicamento = new Medicamento();
        medicamento.setDataVencimento(dto.getDataVencimento());
        medicamento.setNome(dto.getNome());
        medicamento.setNomeLaboratorio(dto.getNomeLaboratorio());
        medicamento.setValor(dto.getValor());
        medicamento.setDataVencimento(dto.getDataVencimento());

        medicamento.persist();

    }

    @DELETE
    @Path("{id}")
    @Transactional
    public Response delete(@PathParam("id") Long id) {
        Medicamento medicamento = Medicamento.findById(id);

        if (medicamento == null) {
            throw new WebApplicationException("Medicamento " + id + " não existe.", Response.Status.NOT_FOUND);
        }

        medicamento.delete();
        return Response.status(204).build();
    }

}
