/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.rest.service;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author macbook
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(co.com.rest.service.ChargeCreditCardFacadeREST.class);
        resources.add(co.com.rest.service.PayCreditCardFacadeREST.class);
        resources.add(co.com.rest.service.VerifyCreditCardFacadeREST.class);
    }
    
}