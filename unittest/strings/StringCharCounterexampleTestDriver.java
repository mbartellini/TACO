package strings;

import ar.edu.taco.regresion.CollectionTestBase;
import ar.uba.dc.rfm.dynalloy.visualization.VizException;

public class StringCharCounterexampleTestDriver extends CollectionTestBase {

        @Override
        protected String getClassToCheck() {
            return "strings.StringCharCounterexampleTest";
        }

        private void config() throws VizException {
            // To solve imports
            setConfigKeyRelevantClasses("strings.StringCharCounterexampleTest");

            // Scope
            setConfigKeyUseJavaArithmetic(true);
            setConfigKeyIntBithwidth(2);
            setConfigKeyInferScope(true);
            setConfigKeyObjectScope(0);
            setConfigKeyLoopUnroll(5);
            setConfigKeyTypeScopes("strings.StringCharCounterexampleTest:1");

            // Always true
            setConfigKeyRelevancyAnalysis(true);
            setConfigKeyCheckNullDereference(true);
            setConfigKeyGenerateUnitTestCase(false);
            setConfigKeyRemoveQuantifiers(true);

            // Always false
            setConfigKeyUseJavaSBP(false);
            setConfigKeyUseTightUpperBounds(false);
            setConfigKeyAttemptToCorrectBug(false);

            // Ignored
            setConfigKeySkolemizeInstanceInvariant(true);
            setConfigKeySkolemizeInstanceAbstraction(false);
            setConfigKeyMaxStrykerMethodsPerFile(1);
        }

        public void test_genericMethod2Test() throws VizException {
            config();
            check(GENERIC_PROPERTIES,"returnTrue(java_lang_String)",false);
        }

}
