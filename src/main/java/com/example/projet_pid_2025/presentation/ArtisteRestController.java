package com.example.projet_pid_2025.presentation;

import com.example.projet_pid_2025.model.Artiste;
import com.example.projet_pid_2025.repositpry.ArtisteRepositpry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/artises")
public class ArtisteRestController {

    @Autowired
    ArtisteRepositpry artisteRepositpry;

    @GetMapping("/user/all")
    public ResponseEntity<List<Artiste>> getAllArtist(){
        return ResponseEntity.ok( artisteRepositpry.findAll());
    }
    @GetMapping("/user/{id}")
    public ResponseEntity<Artiste> getArtistById( @PathVariable Long id ){
        return ResponseEntity.ok( artisteRepositpry.findById( id ).orElseThrow());
    }

    @PostMapping("/admin/artist")
    public ResponseEntity<Artiste> addArtist( @RequestBody Artiste artist) {
        return ResponseEntity.ok( artisteRepositpry.save( artist ));
    }

    @PutMapping("/admin/{id}")
    public ResponseEntity<Artiste> updateArtist( @PathVariable Long id , @RequestBody Artiste artist){
        Artiste target = artisteRepositpry.findById( id ).orElse( new Artiste());


        target.setFirstname(artist.getFirstname());
        target.setLastname(artist.getLastname());

        return ResponseEntity.ok( artisteRepositpry.save( target ) );

    }
    @DeleteMapping("/admin/{id}")
    public void deletArtiste ( @PathVariable Long id ){
        artisteRepositpry.deleteById( id ) ;
    }


}
