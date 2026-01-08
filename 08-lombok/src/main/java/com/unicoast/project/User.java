package com.unicoast.project;

import lombok.*;

// ANNOTATIONS INDIVIDUALES (generan métodos específicos):
@Getter      // Genera getName(), getAge(), getProfile()
@Setter      // Genera setName(), setAge(), setProfile()
@ToString    // Genera toString() con todos los campos
@EqualsAndHashCode // Genera equals() y hashCode() con todos los campos
// @AllArgsConstructor // Genera constructor con todos los parámetros
// @Data        // COMPOSITE: @Getter + @Setter + @ToString + @EqualsAndHashCode + @RequiredArgsConstructor
// @Value       // INMUTABLE: @Getter + @ToString + @EqualsAndHashCode + @AllArgsConstructor + final/private fields
// @Builder     // GENERA: User.builder().name("Nico").age(25).profile("Dev").build()
public class User {
    private String name;
    private int age;
    private String profile;
}
