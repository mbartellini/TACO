package strings;

import ar.edu.taco.regresion.CollectionTestBase;
import ar.uba.dc.rfm.dynalloy.visualization.VizException;

public class StringIsNullTestDriver extends CollectionTestBase {

        @Override
        protected String getClassToCheck() {
            return "strings.StringIsNullTest";
        }

        private void config() throws VizException {
            // To solve imports
            setConfigKeyRelevantClasses("strings.StringIsNullTest");

            // Scope
            setConfigKeyUseJavaArithmetic(true);
            setConfigKeyIntBithwidth(2);
            setConfigKeyInferScope(true);
            setConfigKeyObjectScope(0);
            setConfigKeyLoopUnroll(5);
            setConfigKeyTypeScopes("strings.StringIsNullTest:1");

            // Always true
            setConfigKeyRelevancyAnalysis(true);
            setConfigKeyCheckNullDereference(true);
            setConfigKeyGenerateUnitTestCase(true);
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
            check(GENERIC_PROPERTIES,"isNull(java_lang_String)",false);
        }

}
