package co.edu.icesi.viajes.icesiviajes.icesiviajes.Service;

import static org.junit.jupiter.api.Assertions.*;

import co.edu.icesi.viajes.icesiviajes.domain.TipoDestino;
import co.edu.icesi.viajes.icesiviajes.service.TipoDestinoService;
import org.junit.jupiter.api.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

@SpringBootTest
public class TipoDestinoTest {

    @Autowired
    private TipoDestinoService tipoDestinoService;

    @Test
    void findAllTest(){
        List<TipoDestino> tipoDestinoList= tipoDestinoService.findAll();

        for (TipoDestino tipoDestino: tipoDestinoList) {
            System.out.println(tipoDestino.getCodigo() + "  -  " + tipoDestino.getNombre());
        }
    }

    @Test
    void findByIdTest(){
        for (TipoDestino i : tipoDestinoService.findAll()){
            assertEquals(i, tipoDestinoService.findById(i.getIdTide()).get());
        }
    }

    @Test
    void saveTest(){
        TipoDestino destino = new TipoDestino();
        destino.setIdTide(1);
        destino.setCodigo("PRUEB");
        destino.setNombre("PRUEBA DESTINO");
        destino.setDescripcion("TESTING");
        destino.setFechaCreacion(new Date(System.currentTimeMillis()));
        destino.setFechaModificacion(null);
        destino.setUsuCreador("USUA");
        destino.setUsuModificador("USUB");
        destino.setEstado("Z");

        try {
            assertEquals(destino, tipoDestinoService.save(destino));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void updateTest(){
        TipoDestino destino = new TipoDestino();
        destino.setIdTide(1);
        destino.setCodigo("CAMBI");
        destino.setNombre("CAMBIO DESTINO");
        destino.setDescripcion("TESTING");
        destino.setFechaCreacion(new Date(System.currentTimeMillis()));
        destino.setFechaModificacion(new Date(2025, 10, 2));
        destino.setUsuCreador("USUC");
        destino.setUsuModificador("USUD");
        destino.setEstado("O");

        try {
            assertEquals(destino, tipoDestinoService.save(destino));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    @Test
    void deleteTest() throws Exception {
        Optional<TipoDestino> toDelete = tipoDestinoService.findById(3);
        tipoDestinoService.delete(toDelete.get());
        Optional<TipoDestino> deleted  = tipoDestinoService.findById(toDelete.get().getIdTide());
        assertEquals(Optional.empty(), deleted);
    }

    @Test
    void deleteByIdTest() throws Exception {
        tipoDestinoService.deleteById(2);
        assertEquals(Optional.empty(), tipoDestinoService.findById(2));
    }

    @Test
    void countTest(){
        assertEquals(tipoDestinoService.findAll().size(),tipoDestinoService.count());
    }


}
