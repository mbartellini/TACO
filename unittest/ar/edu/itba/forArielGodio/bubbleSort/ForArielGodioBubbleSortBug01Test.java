package ar.edu.itba.forArielGodio.bubbleSort;


import ar.edu.taco.regresion.CollectionTestBase;
import ar.uba.dc.rfm.dynalloy.visualization.VizException;

public class ForArielGodioBubbleSortBug01Test extends CollectionTestBase {

	@Override
	protected String getClassToCheck() {
		return "forArielGodio.bubbleSort.bug01.BubbleSort";
	}

	public void test_genericMethod1Test() throws VizException {
		setConfigKeyRelevantClasses("forArielGodio.bubbleSort.bug01.SwapInArray, forArielGodio.bubbleSort.bug01.BubbleSort");
		setConfigKeyRelevancyAnalysis(true);
		setConfigKeyCheckNullDereference(true);
		setConfigKeyUseJavaArithmetic(true);
		setConfigKeyInferScope(true);
		setConfigKeyObjectScope(0);
		setConfigKeyIntBithwidth(4);
        setConfigKeyLoopUnroll(2);
		setConfigKeySkolemizeInstanceInvariant(true);
		setConfigKeySkolemizeInstanceAbstraction(false);
		setConfigKeyGenerateUnitTestCase(true);
		setConfigKeyAttemptToCorrectBug(false);
		setConfigKeyMaxStrykerMethodsPerFile(1);
		setConfigKeyRemoveQuantifiers(true);
		setConfigKeyUseJavaSBP(false);
		setConfigKeyUseTightUpperBounds(false);
		setConfigKeyTypeScopes("forArielGodio.bubbleSort.bug01.BubbleSort:1, forArielGodio.bubbleSort.bug01.SwapInArray:1");
		check(GENERIC_PROPERTIES,"bubbleSort(int[])",true);
	}
}
