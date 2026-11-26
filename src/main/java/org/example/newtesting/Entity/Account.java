package org.example.newtesting.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

    @Getter
    @Setter
    @NoArgsConstructor
    @Entity
    @Table(name = "accounts")
    public class Account {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        Integer id;
        String accountName;
        BigDecimal balance;

}
