/**
 * @author mingliang(andyming @ aliyun.com)
 * @date 2018-07-30 21:52
 */
module hx.web.service {
    requires spring.boot.starter.web;
    requires spring.web;
    requires spring.context;
    requires spring.context.support;
    requires spring.core;
    requires spring.webmvc;
    requires spring.beans;
    requires spring.boot;
    requires spring.boot.autoconfigure;

    requires java.base;
    requires tomcat.embed.core;
    requires slf4j.api;

    exports hx.web.front.service.adapter;
    exports hx.web.front.service.config;
    exports hx.web.front.service.filter;
    exports hx.web.front.service.gateway;
    exports hx.web.front.service.handler;
}