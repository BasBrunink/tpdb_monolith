package net.codefink.tpdb.backend.dataservice.park;

import net.codefink.tpdb.backend.model.Park;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ParkRepository extends JpaRepository<Park, UUID> {
}
