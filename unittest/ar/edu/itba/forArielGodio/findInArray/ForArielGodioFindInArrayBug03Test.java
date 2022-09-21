package ar.edu.itba.forArielGodio.findInArray;


import ar.edu.taco.regresion.CollectionTestBase;
import ar.uba.dc.rfm.dynalloy.visualization.VizException;

public class ForArielGodioFindInArrayBug03Test extends CollectionTestBase {

	@Override
	protected String getClassToCheck() {
		return "forArielGodio.findInArray.bug03.FindInArray";
	}

	public void test_genericMethod1Test() throws VizException {
		setConfigKeyRelevantClasses("forArielGodio.findInArray.bug03.FindInArray");
		setConfigKeyRelevancyAnalysis(true);
		setConfigKeyCheckNullDereference(true);
		setConfigKeyUseJavaArithmetic(true);
		setConfigKeyInferScope(true);
		setConfigKeyObjectScope(0);
		setConfigKeyIntBithwidth(4);
        setConfigKeyLoopUnroll(4);
		setConfigKeySkolemizeInstanceInvariant(true);
		setConfigKeySkolemizeInstanceAbstraction(false);
		setConfigKeyGenerateUnitTestCase(true);
		setConfigKeyAttemptToCorrectBug(false);
		setConfigKeyMaxStrykerMethodsPerFile(1);
		setConfigKeyRemoveQuantifiers(true);
		setConfigKeyUseJavaSBP(false);
		setConfigKeyUseTightUpperBounds(false);
		setConfigKeyTypeScopes("forArielGodio.findInArray.bug03.FindInArray:1");
		check(GENERIC_PROPERTIES,"getArr(int)",true);
	}
}
