package strings;

import ar.edu.taco.regresion.CollectionTestBase;
import ar.uba.dc.rfm.dynalloy.visualization.VizException;

public class StringLengthTestDriver extends CollectionTestBase {

        @Override
        protected String getClassToCheck() {
            return "strings.StringLengthTest";
        }

        private void config() throws VizException {
            // To solve imports
            setConfigKeyRelevantClasses("strings.StringLengthTest");

            // Scope
            setConfigKeyUseJavaArithmetic(true);
            setConfigKeyIntBithwidth(2);
            setConfigKeyInferScope(true);
            setConfigKeyObjectScope(0);
            setConfigKeyLoopUnroll(5);
            setConfigKeyTypeScopes("strings.StringLengthTest:1");

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
