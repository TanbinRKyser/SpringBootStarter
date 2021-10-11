package com.tusker.tutorial.springin6min.health;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * @link {http://localhost:8080/actuator/health}
 */

@Component
class CarHealthIndicator implements HealthIndicator {

	@Override
	public Health health() {
		return Health.status( "I love Production" ).build();
	}
}
