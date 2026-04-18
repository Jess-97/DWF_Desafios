package sv.edu.udb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sv.edu.udb.model.Materia;
import sv.edu.udb.service.MateriaService;
import org.springframework.http.ResponseEntity;

import java.util.List;

@RestController
@RequestMapping("/api/materias")
public class MateriaController {

    @Autowired
    private MateriaService materiaService;

    @GetMapping
    public ResponseEntity<List<Materia>> listar() {
        return ResponseEntity.ok(materiaService.listar());
    }

    @PostMapping
    public ResponseEntity<Materia> guardar(@RequestBody Materia materia) {
        return ResponseEntity.ok(materiaService.guardar(materia));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Materia> actualizar(@PathVariable Long id, @RequestBody Materia materia) {
        return ResponseEntity.ok(materiaService.actualizar(id, materia));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminar(@PathVariable Long id) {
        materiaService.eliminar(id);
        return ResponseEntity.ok("Materia eliminada correctamente");
    }
}
