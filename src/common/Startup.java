/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.LinkedHashSet;
/**
 *
 * @author Chris
 */
public class Startup {
    public static void main(String[] args) {
        Address address1 = new Address("1705 E. Juniper Way", "Hartland", "WI", "53029");
        Address address2 = new Address("1801 E. Juniper Way", "Hartland", "WI", "53029");
        
        Dog dog1 = new Dog("Fido", 1234);
        Dog dog2 = new Dog("Fido", 1234);
        
        List<Dog> dogs = new ArrayList<>();
        dogs.add(dog1);
        dogs.add(dog2);
        
        
        
        Set<Dog> noDupes = new LinkedHashSet<>(dogs);
        
        for(Dog d: noDupes){
            System.out.println(d);
        }
    }
}
