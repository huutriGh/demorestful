package com.aptech.demorestfull.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.Date;

@Entity
@Table(name = "SaveTransaction")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class SaveTransaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", columnDefinition = "int")
    private int id;

    @Column(name = "TranDate", columnDefinition = "Date")
    private Date tranDate;

    @Column(name = "Amount", columnDefinition = "decimal(15, 2)")
    private double amount;

    @Column(name = "Comment", columnDefinition = "varchar(250)")
    private String comment;

    @Column(name = "AccountNo", columnDefinition = "varchar(20)")
    private String accountNo;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "AccountNo", updatable = false, insertable = false)
    private Account account;


}
