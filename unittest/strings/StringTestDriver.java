package strings;


import ar.edu.taco.regresion.CollectionTestBase;
import ar.uba.dc.rfm.dynalloy.visualization.VizException;

public class StringTestDriver extends CollectionTestBase {

	@Override
	protected String getClassToCheck() {
		return "strings.StringTest";
	}

	public void test_genericMethodTest() throws VizException {
		setConfigKeyRelevantClasses("strings.StringTest");
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
		setConfigKeyTypeScopes("strings.StringTest:1");
		check(GENERIC_PROPERTIES,"check(java_lang_String, int)",false);
	}

}
