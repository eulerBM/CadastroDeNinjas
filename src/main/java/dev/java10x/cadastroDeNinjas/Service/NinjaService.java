package dev.java10x.cadastroDeNinjas.Service;

import dev.java10x.cadastroDeNinjas.DTO.CreateNinjaDTO;
import dev.java10x.cadastroDeNinjas.DTO.IdNinjaDTO;
import dev.java10x.cadastroDeNinjas.Entity.NinjaEntity;
import dev.java10x.cadastroDeNinjas.Repository.NinjaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class NinjaService {

    @Autowired
    private NinjaRepository ninjaRepository;

    public ResponseEntity<NinjaEntity> createNinjaService(CreateNinjaDTO data){

        NinjaEntity.ChoiceRank rankEnum = NinjaEntity.ChoiceRank.valueOf(data.rank());
        NinjaEntity.ChoiceVila vilaEnum = NinjaEntity.ChoiceVila.valueOf(data.vila());

        NinjaEntity ninjaEntity = new NinjaEntity(data.name(), rankEnum, vilaEnum);

        ninjaRepository.save(ninjaEntity);

        return ResponseEntity.ok().body(ninjaEntity);
    }

    public ResponseEntity<NinjaEntity> getNinjaService(IdNinjaDTO data){

        var getIdNinja = ninjaRepository.findById(data.id());

        if (getIdNinja.isEmpty()){
            throw new RuntimeException("Ninja não encontrado!");
        }

        NinjaEntity ninja = getIdNinja.get();

        return ResponseEntity.ok().body(ninja);


    }

   public ResponseEntity<Void> deleteNinjaService(Long id){

        var getNinja = ninjaRepository.findById(id);

        if (getNinja.isEmpty()){
            throw new RuntimeException("Ninja não encontrado!");
        }

        ninjaRepository.delete(getNinja.get());

        return ResponseEntity.ok().build();

   }


}
