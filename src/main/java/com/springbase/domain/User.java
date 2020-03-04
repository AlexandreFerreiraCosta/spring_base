package com.br.smartzune.smartzune.domain;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Getter
@Setter
@Table(name = "tb_user", schema = "public")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class User implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id_user")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_user")
    @SequenceGenerator(name = "sq_user", sequenceName = "sq_user", allocationSize = 1)
    private Long id;

    @Column(name = "ds_fullname", nullable = false)
    private String fullname;

    @Column(name = "ds_username", nullable = false)
    private String username;

    @Column(name = "ds_password", nullable = false)
    private String password;

    @Column(name = "ds_enabled", nullable = false)
    private Boolean enabled;

    @Column(name = "nu_cnpj", nullable = false)
    private String cnpj;

    @Column(name = "ds_type", nullable = false)
    private String type;
}
