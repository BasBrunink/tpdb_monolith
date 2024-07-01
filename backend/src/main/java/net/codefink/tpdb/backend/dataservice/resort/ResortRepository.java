package net.codefink.tpdb.backend.dataservice.resort;

import net.codefink.tpdb.backend.model.Resort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ResortRepository extends JpaRepository<Resort, UUID> {
}
