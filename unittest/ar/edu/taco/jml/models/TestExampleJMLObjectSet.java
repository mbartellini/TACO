package ar.edu.taco.jml.models;

import ar.edu.taco.regresion.GenericTestBase;
import ar.uba.dc.rfm.dynalloy.visualization.VizException;

public class TestExampleJMLObjectSet extends GenericTestBase {

	@Override
	protected String getClassToCheck() {
		return "ar.edu.taco.jml.models.ExampleJMLObjectSet";
	}
	
	public void test_m1() throws VizException {
		setConfigKeyRelevantClasses("ar.edu.taco.jml.models.ExampleJMLObjectSet");
		setConfigKeyRelevancyAnalysis(false);
		setConfigKeyUseJavaArithmetic(false);
		setConfigKeyRemoveQuantifiers(true);
		setConfigKeyGenerateUnitTestCase(false);
		runAndCheck(GENERIC_PROPERTIES, "showInstance_0", true);
	}

}
