package strings;


import ar.edu.taco.regresion.CollectionTestBase;
import ar.uba.dc.rfm.dynalloy.visualization.VizException;

public class PalindromeTestWithCharArrayDriver extends CollectionTestBase {

	@Override
	protected String getClassToCheck() {
		return "strings.PalindromeTestWithCharArray";
	}

	public void test_genericMethodTest() throws VizException {
		setConfigKeyRelevantClasses("strings.PalindromeTestWithCharArray");
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
		setConfigKeyTypeScopes("strings.PalindromeTestWithCharArray:1");
		check(GENERIC_PROPERTIES,"checkPalindrome(char[])",false);
	}

}
