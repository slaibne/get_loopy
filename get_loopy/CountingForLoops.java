package get_loopy;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

/**
 * CountingForLoops
 */
public class CountingForLoops {
    public static void main(String[] args) {
        int i;
        for (i = 10; i >= 0; i = i - 2) {
            System.out.println(i);
        }
    }

}
