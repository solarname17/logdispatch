package in.maheshlangote.logdispatch.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation used to customize the metadata dispatched to the APM Server
 * when an exception occurs in a Spring Boot RestController.
 * 
 * If omitted, default values (class name, method name, HTTP path) are used.
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface LogDispatch {
    
    /**
     * Overrides the default affectedFeature (which is the Class name).
     * e.g., "PaymentProcessing"
     */
    String feature() default "";

    /**
     * Overrides the default affectedAPI (which is the HTTP path).
     * e.g., "Stripe Webhook Listener"
     */
    String api() default "";

    /**
     * Overrides the default affectedFunction (which is the Method name).
     * e.g., "processPaymentAsync"
     */
    String function() default "";
}
