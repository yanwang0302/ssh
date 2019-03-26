package com.ssh.entity;

import java.io.Serializable;
import javax.persistence.*;

import lombok.Data;

/**
 * @author Created by Evin
 * On 2/2/2017.2:03 PM
 */
@Data
@Entity
@Table(name = "person")
public class Person implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "created")
    private Long created = System.currentTimeMillis();

    @Column(name = "username")
    private String username;

    @Column(name = "address")
    private String address;

    @Column(name = "phone")
    private String phone;

    @Column(name = "remark")
    private String remark;
}