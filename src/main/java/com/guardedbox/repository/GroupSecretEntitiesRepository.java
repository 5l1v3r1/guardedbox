package com.guardedbox.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.guardedbox.entity.GroupSecretEntity;

/**
 * Repository: GroupSecret.
 *
 * @author s3curitybug@gmail.com
 *
 */
public interface GroupSecretEntitiesRepository
        extends JpaRepository<GroupSecretEntity, UUID>,
        JpaSpecificationExecutor<GroupSecretEntity> {

}
