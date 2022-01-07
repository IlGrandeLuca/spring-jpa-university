/**
 * 
 */
package org.generation.italy.repository;

import java.math.BigInteger;

import org.generation.italy.model.Degree;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author lucai
 *
 */
public interface DegreeRepository extends JpaRepository<Degree, BigInteger> {

}
