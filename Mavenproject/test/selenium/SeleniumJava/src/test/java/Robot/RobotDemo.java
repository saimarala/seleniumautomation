package Robot;

import org.testng.annotations.Test;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class RobotDemo {

    @Test
    void test() throws AWTException {
        Runtime.getRuntime();
        //use robot class robert class
        Robot robot=new Robot();
        //store the path of file to be uploaded using StringSelection object
        StringSelection s=new StringSelection("dd");
        //copy above path to clipboard
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s,null);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_C);
        robot.keyRelease(KeyEvent.VK_C);
        robot.keyRelease(KeyEvent.VK_CONTROL);



    }
}
