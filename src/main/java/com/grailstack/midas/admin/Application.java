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
@HaloApplication
@Domain(code = "basic", parentCode = "bp", name = "基础域", desc = "基础服务域")
public class Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
