/**
 *
 */
package com.example.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
@Getter
@AllArgsConstructor
//@Entity
public class Employee {
//    @Id
    private String employeeId = null;
    private String name = null;
    @SuppressWarnings("unused")
    private Employee() {
    }
}
