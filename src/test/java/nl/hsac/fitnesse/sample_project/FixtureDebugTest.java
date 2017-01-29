package nl.hsac.fitnesse.sample_project;

import fitnesse.junit.FitNesseRunner;
import nl.hsac.fitnesse.junit.HsacFitNesseRunner;
import org.junit.runner.RunWith;

/**
 * Test class to allow fixture code to be debugged, or run by build server.
 */
@RunWith(HsacFitNesseRunner.class)
@FitNesseRunner.Suite("HsacAcceptanceTests.SlimTests.UtilityFixtures.MapFixtureTest")
public class FixtureDebugTest {
}
