package org.example.o2_Classes;

public class NestedOuterClasses {
    String outerField = "Outer field";
    String outerFieldShadow = "Outer field shadow";
    static String staticOuterField = "Static outer field";

    public class InnerClass {
        String outerFieldShadow = "Outer field shadow innder";

        public void accessMembers() {
            System.out.println("InnerClass: " + outerField);
            System.out.println("InnerClass: " + outerFieldShadow);
            System.out.println("InnerClass this: " + this.outerFieldShadow);
            System.out.println("InnerClass NestedOuterClasses.this: " + NestedOuterClasses.this.outerFieldShadow);
            System.out.println("InnerClass: " + staticOuterField);
        }
    }

    public static class StaticNestedClass {
        public void accessMembers(NestedOuterClasses outer) {
            // Compiler error: Cannot make a static reference to the non-static field outerField
            //
            // System.out.println(outerField);

            System.out.println("StaticNestedClass: " + outer.outerField);
            System.out.println("StaticNestedClass: " + staticOuterField);
        }
    }

    public void localClass(String parameterValue) {
        // a local class can only access local variables that are declared final
        final String localValue = "Local value";

        class ShowData {
            String localClassValues = null;

            ShowData(String localClassValue2) {
                this.localClassValues = localClassValue2;
            }

            public void showValue() {
                System.out.println("Local class ShowData: " + this.localClassValues);
                System.out.println("Local class ShowData parameters: " + parameterValue);
                System.out.println("Local class Outer field Static: " + staticOuterField);
                System.out.println("Local class Outer field: " + outerField);
                System.out.println("Local class Local value: " + localValue);
            }
        }

        ShowData data = new ShowData("The local value");
        data.showValue();
    }

    interface IAnonymous {
        public void greet(String value);
    }

    public void anonymousMethod(String parameterValue) {
        IAnonymous frenchGreeting = new IAnonymous() {
            public void greet(String value) {
                System.out.println("IAnonymous class: " + value);
            }
        };

        frenchGreeting.greet(parameterValue);
    }
}
