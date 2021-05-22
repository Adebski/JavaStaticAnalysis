package com.adebski;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        try {
            throw new RuntimeException("exception");
        } catch (RuntimeException e) {
            //Empty
        }
    }

    public static final class ProblematicClass {
        private final String foo;
        private final String bar;

        public ProblematicClass(String foo, String bar) {
            this.foo = foo;
            this.bar = bar;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ProblematicClass that = (ProblematicClass) o;
            return foo.equals(that.foo) &&
                bar.equals(that.bar);
        }

        @Override
        public int hashCode() {
            return Objects.hash(foo, bar);
        }

        @SuppressWarnings("BadInstanceof")
        public void method() {
            if (this instanceof ProblematicClass) {
                System.out.println("ASD");
            }
        }
    }

    @SuppressWarnings("ComparableAndComparator")
    public static class Bar implements Comparable<Bar>, Comparator<Bar> {
        private final int foo;

        public Bar(int foo) {
            this.foo = foo;
        }

        @Override
        public int compareTo(Bar o) {
            return 0;
        }

        @Override
        public int compare(Bar o1, Bar o2) {
            return 0;
        }
    }
}
