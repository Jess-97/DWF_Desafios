package sv.edu.udb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sv.edu.udb.model.Alumno;
import sv.edu.udb.service.AlumnoService;
import org.springframework.http.ResponseEntity;

import java.util.List;

@RestController
@RequestMapping("/api/alumnos")
public class AlumnoController {

    @Autowired
    private AlumnoService alumnoService;

    @GetMapping
    public ResponseEntity<List<Alumno>> listar() {
        return ResponseEntity.ok(alumnoService.listar());
    }

    @PostMapping
    public ResponseEntity<Alumno> guardar(@RequestBody Alumno alumno) {
        return ResponseEntity.ok(alumnoService.guardar(alumno));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Alumno> actualizar(@PathVariable Long id, @RequestBody Alumno alumno) {
        return ResponseEntity.ok(alumnoService.actualizar(id, alumno));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminar(@PathVariable Long id) {
        alumnoService.eliminar(id);
        return ResponseEntity.ok("Alumno eliminado correctamente");
    }
}
