package strings;


import ar.edu.taco.regresion.CollectionTestBase;
import ar.uba.dc.rfm.dynalloy.visualization.VizException;

public class StringLengthTestDriver extends CollectionTestBase {

	@Override
	protected String getClassToCheck() {
		return "strings.StringLengthTest";
	}

	public void test_genericMethodTest() throws VizException {
		setConfigKeyRelevantClasses("strings.StringLengthTest");
		setConfigKeyRelevancyAnalysis(true);
		setConfigKeyCheckNullDereference(true);
		setConfigKeyUseJavaArithmetic(true);
		setConfigKeyInferScope(true);
		setConfigKeyObjectScope(0);
		setConfigKeyIntBithwidth(4);
		setConfigKeyLoopUnroll(3);
		setConfigKeySkolemizeInstanceInvariant(true);
		setConfigKeySkolemizeInstanceAbstraction(false);
		setConfigKeyGenerateUnitTestCase(true);
		setConfigKeyAttemptToCorrectBug(false);
		setConfigKeyMaxStrykerMethodsPerFile(1);
		setConfigKeyRemoveQuantifiers(true);
		setConfigKeyUseJavaSBP(false);
		setConfigKeyUseTightUpperBounds(false);
		setConfigKeyTypeScopes("strings.StringLengthTest:1");
		check(GENERIC_PROPERTIES,"check(java_lang_String)",false);
	}

}
