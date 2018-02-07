/**
 * 
 */
package com.oms.auth0.security.annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.context.annotation.Import;

import com.oms.auth0.security.config.AppConfig;
/**
 * @author 109726
 *
 */
@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import(AppConfig.class)
public @interface OmsAuth0MvcCommonSecurity {

}
