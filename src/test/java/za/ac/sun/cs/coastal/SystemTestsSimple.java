package za.ac.sun.cs.coastal;

import static org.junit.Assert.assertEquals;

import org.apache.commons.configuration2.ImmutableConfiguration;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

public class SystemTestsSimple {

	@Test
	public void testStraight01() {
		final Logger log = LogManager.getLogger("COASTAL-TEST");
		ImmutableConfiguration config = COASTAL.loadConfiguration(log, new String[] { "tests/simple/Straight01.java" });
		if (config != null) {
			COASTAL coastal = new COASTAL(log, config);
			coastal.start(false);
			Reporter reporter = coastal.getReporter();
			assertEquals(1, reporter.getStatInt("Diver.runs"));
			assertEquals(0, reporter.getStatInt("Instrumentation.cached-count"));
			assertEquals(1, reporter.getStatInt("Instrumentation.instrumented-count"));
			assertEquals(1487, reporter.getStatInt("Instrumentation.post-instrumented-size"));
			assertEquals(670, reporter.getStatInt("Instrumentation.pre-instrumented-size"));
			assertEquals(6, reporter.getStatInt("Instrumentation.requests-count"));
//			14:42:27.965 ====  Strategy  ======================================================
//			14:42:27.965   infeasible-count: 0
//			14:42:27.965   path-count: 0
//			14:42:27.966   revisit-count: 0
		}

	}

}
