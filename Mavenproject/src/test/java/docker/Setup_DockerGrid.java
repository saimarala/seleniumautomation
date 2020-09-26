package docker;

import net.bytebuddy.implementation.bytecode.Throw;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class Setup_DockerGrid {
    @BeforeTest
    public void startDockerGrid() throws IOException, InterruptedException {
        Runtime.getRuntime().exec("cmd /c start start_dockergrid.bat");
        System.out.println("before test method");
        Thread.sleep(20000);
    }
    @AfterTest
    public void stopDockerGrid() throws IOException, InterruptedException {
        Runtime.getRuntime().exec("cmd /c start stop_dockergrid.bat");
        Thread.sleep(15000);
        System.out.println("after test method");
        Runtime.getRuntime().exec("taskkill /f /im cmd.exe");

    }
}
