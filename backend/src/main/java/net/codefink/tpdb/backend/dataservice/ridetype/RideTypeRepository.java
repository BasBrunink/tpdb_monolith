package net.codefink.tpdb.backend.dataservice.ridetype;

import net.codefink.tpdb.backend.model.types.RideType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RideTypeRepository extends JpaRepository<RideType, UUID> {
}
