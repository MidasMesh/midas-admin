package com.grailstack.midas.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.xujin.halo.annotation.HaloApplication;
import org.xujin.halo.annotation.domain.Domain;

/**
 * @author halo codegen
 */
@SpringBootApplication
@HaloApplication(appId = "midas-admin",appName = "midas-admin")
@Domain(code="midas-admin",name = "管控端")
public class Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
