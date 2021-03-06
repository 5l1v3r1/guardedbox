package com.guardedbox.entity;

import static com.guardedbox.constants.Constraints.BASE64_JSON_PATTERN;
import static com.guardedbox.constants.Constraints.SECRET_VALUE_MAX_LENGTH;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

/**
 * Entity: GroupSecret.
 *
 * @author s3curitybug@gmail.com
 *
 */
@Entity
@Table(name = "group_secret")
@Getter
@Setter
@SuppressWarnings("serial")
public class GroupSecretEntity
        implements Serializable {

    /** Group ID. */
    @Id
    @GeneratedValue(generator = "uuid2")
    @Column(name = "group_secret_id")
    private UUID groupSecretId;

    /** Group. */
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "group_id")
    @NotNull
    @Valid
    private GroupEntity group;

    /** Value. */
    @Column(name = "value")
    @NotBlank
    @Pattern(regexp = BASE64_JSON_PATTERN)
    @Size(max = SECRET_VALUE_MAX_LENGTH)
    private String value;

}
