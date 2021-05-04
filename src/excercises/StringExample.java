package excercises;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class StringExample {
    public static void main(String[] args) {
        String ta = "A";
        ta = ta + "B";
        String tb = "C";
        ta = ta + tb;
        ta = ta.replace('C','D');
        System.out.println(ta);
    }
}
