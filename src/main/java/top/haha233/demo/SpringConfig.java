package top.haha233.demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration
@Configuration
@ComponentScan(basePackages = {"top.haha233"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class SpringConfig {
}
