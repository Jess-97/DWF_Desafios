package sv.edu.udb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sv.edu.udb.model.Alumno;
import sv.edu.udb.service.AlumnoService;

import java.util.List;

@RestController
@RequestMapping("/alumnos")
public class AlumnoController {

    @Autowired
    private AlumnoService service;

    @GetMapping
    public List<Alumno> listar() {
        return service.listar();
    }

    @PostMapping
    public Alumno guardar(@RequestBody Alumno a) {
        return service.guardar(a);
    }

    @PutMapping("/{id}")
    public Alumno actualizar(@PathVariable Long id, @RequestBody Alumno a) {
        return service.actualizar(id, a);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminar(id);
    }
}
