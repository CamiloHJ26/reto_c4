/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Reto3Jeremy1.repository.Interface;

import com.example.Reto3Jeremy1.model.Supplements;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Jeremy
 */
public interface SupplementsInterface extends MongoRepository<Supplements, String> {
    
}
