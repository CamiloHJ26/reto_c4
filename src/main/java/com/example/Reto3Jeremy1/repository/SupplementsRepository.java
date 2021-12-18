
package com.example.Reto3Jeremy1.repository;

import com.example.Reto3Jeremy1.model.Supplements;
import com.example.Reto3Jeremy1.repository.Interface.SupplementsInterface;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class SupplementsRepository {
    
    @Autowired
    private SupplementsInterface supplementsInterface;

    public List<Supplements> getAll() {
        return supplementsInterface.findAll();
    }

    public Optional<Supplements> getSupplement(String reference) {
        return supplementsInterface.findById(reference);
    }
    public Supplements create(Supplements supplements) {
        return supplementsInterface.save(supplements);
    }

    public void update(Supplements supplements) {
        supplementsInterface.save(supplements);
    }
    
    public void delete(Supplements supplements) {
        supplementsInterface.delete(supplements);
    }
    
}
